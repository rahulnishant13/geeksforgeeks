#include<stdio.h>

int main()
{    
    
   
   int n,i;
    scanf("%d",&n);
    for(i=1;i<=n;i++)
   {
    char string[300];
   int c = 0, flag[26] = {0} , count[26] = {0}, sump = 0,sumn = 0,cost = 0;
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
         flag[c] = count[c]-(c+1);
         }
   }
 
   for (c=0 ; c < 26; c++)
       {
            if(flag[c]>0)
            {
                         sump = sump + flag[c];
                         }
            else if(flag[c]<0)
            {
                             sumn = sumn + flag[c];
             }
                            
       }
       if((sump+sumn)==0)
       {
              cost = sump;           
       }
       else if((sump+sumn)<0)
       {
            cost = sump;
            cost = cost + ((sump+sumn)*(-2));
        }
        else
        {
            cost = sumn*(-1);
            cost = cost + ((sump+sumn)*3);
        }
        printf("%d\n",cost);
    
   }
   
    return 0;   
}

