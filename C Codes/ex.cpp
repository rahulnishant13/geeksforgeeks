#include<stdio.h>
#include<conio.h>
void message();
int  main( ) 
{ 
      int  a[] = {10,20,30,45,56,74}, *i,*j ;
      i = &a[4];
      j = (a + 4); 
      printf ( "\n %d %d %d", a,&a[0], (*j) - (*i) ) ; 

              getch();
} 
