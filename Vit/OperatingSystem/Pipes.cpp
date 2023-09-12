    #include <stdio.h>
    #include <stdlib.h>
    #include <unistd.h>
    #include <string.h>
    #include <ctype.h>
    #include <sys/wait.h>

    #define BUFFER_SIZE 256

    int main() {
        int pipe_fd1[2]; 
        int pipe_fd2[2]; 
        char message[BUFFER_SIZE];
        char modifiedMsg[BUFFER_SIZE];

        if (pipe(pipe_fd1) == -1 || pipe(pipe_fd2) == -1) {
            perror("Pipe creation failed");
            exit(EXIT_FAILURE);
        }

        pid_t child_pid = fork();

        if (child_pid == -1) {
            perror("Fork failed");
            exit(EXIT_FAILURE);
        }

        if (child_pid == 0) {
            close(pipe_fd1[1]); 
            close(pipe_fd2[0]); 

            read(pipe_fd1[0], message, BUFFER_SIZE);

            int len = strlen(message);
            for (int i = 0; i < len; i++) {
                if (isupper(message[i])) {
                    modifiedMsg[i] = tolower(message[i]);
                } else if (islower(message[i])) {
                    modifiedMsg[i] = toupper(message[i]);
                } else {
                    modifiedMsg[i] = message[i];
                }
            }
            modifiedMsg[len] = '\0';

            write(pipe_fd2[1], modifiedMsg, strlen(modifiedMsg));

            close(pipe_fd1[0]);
            close(pipe_fd2[1]);

            exit(EXIT_SUCCESS);
        } else {
            close(pipe_fd1[0]); 
            close(pipe_fd2[1]); 

            printf("Enter Youe message: ");
            fgets(message, BUFFER_SIZE, stdin);
            write(pipe_fd1[1], message, strlen(message));
            read(pipe_fd2[0], modifiedMsg, BUFFER_SIZE);

            printf("Modified message : %s\n", modifiedMsg);

            
            close(pipe_fd1[1]);
            close(pipe_fd2[0]);

            wait(NULL); 

            exit(EXIT_SUCCESS);
        }

        return 0;
    }
