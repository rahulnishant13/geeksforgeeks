#include<stdio.h>
#include<conio.h>
int main()
{	
    char string[400];
   int c = 0, count[26] = {0},flag =0;
 
   printf("Enter a string\n");
   gets(string);
 
   while ( string[c] != '\0' )
   {
 
      if ( string[c] >= 'a' && string[c] <= 'z' ) 
         count[string[c]-'a']++;
 
      c++;
   }
 
   for ( c = 0 ; c < 26 ; c++ )
   {
      if( count[c] != (c+1) )
         flag=1;
   }
 
 if(flag==0)
   printf("yes");
 
 else
     printf("no");
     
     getch();
    return 0;   
}
