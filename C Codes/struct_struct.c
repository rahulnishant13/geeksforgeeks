#include <stdio.h>

struct point{
	int y,x;
	};

struct rect{
	struct point point1;
	struct point point2;
	};
struct rect screen;
int main(int argc, char **argv)
{
	screen.point1.x = 5;
	screen.point2.x = 10;
	screen.point1.y = 15;
	screen.point2.y = 123;
	
	printf("%d ",screen.point1.y);
	return 0;
}

