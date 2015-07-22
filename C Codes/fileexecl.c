#include <stdio.h>
#include <unistd.h>

int main(int argc, char **argv)
{  //FILE * fp= freopen("ls.txt","w",stdout); 
      stdout = fopen ("standard-output-file", "w");
	execl("/bin/ls","~/codes","-l",NULL);
	fclose(stdout);
	printf("kjlks");
	return 0;
}

