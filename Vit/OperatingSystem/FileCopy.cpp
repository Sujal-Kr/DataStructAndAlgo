#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <fcntl.h>
#include <string.h>

#define BUFFER_SIZE 512

int main(int argc, char *argv[]) {
    if (argc != 3) {
        fprintf(stderr, "Usage: %s src_file dest_file\n", argv[0]);
        exit(EXIT_FAILURE);
    }

    const char *src_file = argv[1];
    const char *dest_file = argv[2];

    int pipe_fd[2];
    pid_t child_pid;
    if (pipe(pipe_fd) == -1) {
        perror("Pipe creation failed");
        exit(EXIT_FAILURE);
    }
    child_pid = fork();
    if (child_pid == -1) {
        perror("Fork failed");
        exit(EXIT_FAILURE);
    }

    if (child_pid == 0) {
        close(pipe_fd[1]); 
        int dest_fd = open(dest_file, O_WRONLY | O_CREAT | O_TRUNC, 0644);
        if (dest_fd == -1) {
            perror("Failed to open destination file");
            exit(EXIT_FAILURE);
        }
        char buffer[BUFFER_SIZE];
        ssize_t bytes_read;
        while ((bytes_read = read(pipe_fd[0], buffer, sizeof(buffer))) > 0) {
            write(dest_fd, buffer, bytes_read);
        }
        close(pipe_fd[0]);
        close(dest_fd);
        exit(EXIT_SUCCESS);
    } else {
        close(pipe_fd[0]); 
        int src_fd = open(src_file, O_RDONLY);
        if (src_fd == -1) {
            perror("Failed to open source file");
            exit(EXIT_FAILURE);
        }
        char buffer[BUFFER_SIZE];
        ssize_t bytes_read;
        while ((bytes_read = read(src_fd, buffer, sizeof(buffer))) > 0) {
            write(pipe_fd[1], buffer, bytes_read);
        }
        close(src_fd);
        close(pipe_fd[1]);
        wait(NULL); 
        exit(EXIT_SUCCESS);
    }
    return 0;
}
