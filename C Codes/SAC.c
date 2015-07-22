#include<stdio.h>

int main()
{    
    
   
   int n,i;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
   {
    char string[400];
   int c = 0, count[26] = {0},flag =0;
   scanf("%s",string);

   while ( string[c] != '\0' )
   {
 
      if ( string[c] >= 'a' && string[c] <= 'z' ) 
         count[string[c]-'a']++;
 
      c++;
   }
 
   for ( c = 0 ; c < 26 ; c++ )
   {
       int x=c+1;
      if(count[c]>0){
      if( count[c] != x )
         flag=1;
         }
   }
 
 if(flag==0)
   printf("yes");
 
 else
     printf("no");
    
   }
   
    return 0;   
}

