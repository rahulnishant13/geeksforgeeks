#include <stdio.h>

enum maretial{
	single, married, un_married,
	};

int main(int argc, char **argv)
{
	enum maretial ram = single;
	enum maretial rama = married;
	enum maretial ramaa = un_married;
	printf("%d  %d  %d",ram,rama,ramaa);
	enum maretial sada;
	scanf("%u",sada);
	printf("%d",sada);
	return 0;
}

