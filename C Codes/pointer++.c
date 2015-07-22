#include <stdio.h>

struct node{

	char d;
	char c;
	int f;
	};

typedef struct node box;

int main(int argc, char **argv)
{
	box hc,vc;
	hc.d = 's';
	hc.c = 't';
	hc.f = 5;
	box * hcp=&hc;
	vc.d = 'r';
	vc.c = 'n';
	vc.f = 13;
	
	printf("%c %c %d  %d   %d",hcp->c,hcp->d,hcp->f, hcp+1, sizeof hc );
	printf("\n%c %c %d",vc.d,vc.c,vc.f);
	
	
	return 0;
}

