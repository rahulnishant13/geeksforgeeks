#include <stdio.h>
#include <sys/types.h>

int main(int argc, char **argv)
{
	int pid;
	pid = fork();
	printf("%d\n",pid);
	if(pid == 0){
		printf("child\n");
		printf("child : %d\n",getpid());
		printf("parents : %d\n",getpid());
     }


	else{
		printf("parent\n");
		printf("P parents : %d\n",getpid());
		printf("P childs : %d\n",pid);
		}
	return 0;
}
