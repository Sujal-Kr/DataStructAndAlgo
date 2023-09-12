#include <stdio.h>
#include <stdlib.h>
#include <dirent.h>

int main() {
    
    DIR *dir;  
    struct dirent *entry;
    dir = opendir("../OperatingSystem"); 

    if (dir == NULL) {
        perror("opendir");
        exit(EXIT_FAILURE);
    }

    while ((entry = readdir(dir)) != NULL) {
        printf("FileName: %s\n", entry->d_name);
    }

    closedir(dir);

    return 0;
}
