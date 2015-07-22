#include<stdio.h>
#include<conio.h>

int main( ) 
{ 
       int   num, i,k ; 
 
       printf ( "Enter a number " ) ; 
       scanf ( "%d", &num ) ; 
 
       i = 2 ; 
       for(k=3;k<=num;k++){
       while ( i <= k - 1 ) 
       { printf ( "ff" ) ;
              if ( k % i == 0 ) 
              { 
                     printf ( "Not a prime number" ) ; 
                     break ; 
              } 
              i++ ; 
       } 
        if ( i == num ) 
              printf ( "%d\n",i) ; 
              }
              getch();
} 
 
