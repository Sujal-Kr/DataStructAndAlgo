#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <fcntl.h>

#define BUFFER_SIZE 1024

int main() {
    int fd; 
    char text[] = "Hello, this program is to demonstrate open, read, and write UNIX commands.\n";
    ssize_t bytes_written, bytes_read;
    char buffer[BUFFER_SIZE];

    fd = open("output.txt", O_CREAT | O_WRONLY| O_TRUNC);
    if (fd == -1) {
        perror("open");
        exit(1);
    }

    bytes_written = write(fd, text, sizeof(text) - 1); 
    if (bytes_written == -1) {
        perror("write");
        close(fd);
        exit(1);
    }

    close(fd);

    fd = open("output.txt", O_RDONLY);
    if (fd == -1) {
        perror("open");
        exit(1);
    }

    
    while ((bytes_read = read(fd, buffer, sizeof(buffer))) > 0) {
        write(STDOUT_FILENO, buffer, bytes_read); 
    }

    if (bytes_read == -1) {
        perror("read");
        close(fd);
        exit(1);
    }

    close(fd);

    return 0;
}
