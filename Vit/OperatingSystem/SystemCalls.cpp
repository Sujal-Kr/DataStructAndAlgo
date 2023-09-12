#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
#include <sys/wait.h>
#include <fcntl.h>

int main() {
    pid_t child_pid;
    child_pid = fork();

    if (child_pid < 0) {
        perror("Fork failed");
        exit(EXIT_FAILURE);
    }
    if (child_pid == 0) {
      
        printf("Child Process id is %d\n", getpid());
        char *args[] = {"date", NULL};
        execvp(args[0], args);
        perror("Exec failed");
        exit(EXIT_FAILURE);
    } else {
        printf("Parent Process: My PID is %d\n", getpid());
        int status;
        wait(&status);

        if (WIFEXITED(status)) {
            printf("Child Process exited with status %d\n", WEXITSTATUS(status));
        } else {
            perror("Child Process didn't exit properly");
        }

    }
    return 0;
}
