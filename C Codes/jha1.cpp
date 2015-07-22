#include<stdio.h>
#include<conio.h>
int main()
{
char c='y',temp;
printf("Press y\n");
do
{
printf("Press y to continue\n"); 
fflush(stdin);
scanf("%c",&c); // y entered
printf("%c",c); // loop should repeat but doesn't repeat
}
while(c=='y');

getch();
}
