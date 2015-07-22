#include <stdio.h>
#include <malloc.h>
#include <string.h>

int main(int argc, char **argv)
{
char *names[6] ;
char n[50] ;
int len, i ;
char *p ;
for ( i = 0 ; i <= 2 ; i++ ){
	printf("\nEnter name ");
	scanf("%s", n );
	len = strlen(n);
	//names[i] = n;
	p = malloc ( len + 1 );
	strcpy( p, n );
	names[i] = p;
	}

for ( i = 0 ; i <= 2 ; i++ )
printf ("\n%s",names[i]);

	return 0;
}
