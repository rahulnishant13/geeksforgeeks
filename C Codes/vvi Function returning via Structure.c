#include <stdio.h>

struct x{
	int s,av,sub;
	};

struct x sum(int a, int b, int c){
	struct x z;
	z.s = (a+b+c);
	z.av = ((a+b+c)/3);
	z.sub = (a-(b-c));
	return z;
	}

int main(int argc, char **argv)
{   struct x y;
	y = sum(4,3,1);
	printf("%d  %d  %d",y.s,y.av,y.sub);
	return 0;
}
