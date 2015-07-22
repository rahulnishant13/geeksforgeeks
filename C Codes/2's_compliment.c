#include <stdio.h>
#include <math.h>

int main(int argc, char **argv)
{
	unsigned char ch1= -99,O;

	O = ~ch1;
	O = O -1;
	printf("1's compliment : %d",O);

	return 0;
}

