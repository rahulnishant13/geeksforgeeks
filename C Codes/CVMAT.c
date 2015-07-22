#include<stdio.h>
#include<conio.h>
int main()
{
    char c;
    int n,i,j,k,m,p,a[10][10],b[10][10];
    double s=0;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
     for(j=0;j<n;j++)
     {
                     scanf("%d",&a[i][j]);
     }
    }
    scanf("%c",&c);
    for(;;)
    {
    switch(c)
    {
              case 'A':
                   scanf("%lf",&s);
                   //if(s>=0 && s<=160000)
                   //{
                          // if((s/90)==0)
                           //{
                              m = s/90;
                              p = m%4;
                              while(p!=0)
                              {
                                     for(i=0;i<n;i++)
                                     {
                                      for(j=0;j<n;j++)
                                      {
                                                      b[j][n-i+1]=a[i][j];
                                      }                
                                     }
                                     for(i=0;i<n;i++)
                                     {
                                      for(j=0;j<n;j++)
                                      {
                                                      a[i][j]=b[i][j];
                                      }                
                                     }               
                              }                  
                           //}
                   //}
                   break;
                   
               case 'Q':
                    scanf("%d",&i);
                   scanf("%d",&j);
                    printf("%d",a[i-1][j-1]);
                    break;
                    
              case 'U':
                   scanf("%d",&i);
                   scanf("%d",&j);
                   scanf("%d",&k);
                   a[i-1][j-1]=k;
                   break;
                   
              
                 
              }
}
  
    return 0;
  
}
