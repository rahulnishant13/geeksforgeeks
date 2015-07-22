#include <stdio.h>
#include <unistd.h>

int main(int argc, char **argv)
{
	//char arr[100];
	execl("/bin/ls","-al",NULL);
	//execl("pwd",NULL);
	return 0;
}
