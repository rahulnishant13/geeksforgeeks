#include<stdio.h>
#include<conio.h>

int time(int f, int b, int t, int d)
{
    int i=0,disp=(d-b)+f,dist=b+f,x = b-f;
    while(disp != 0){
               
               if((disp % x) == 0){
              if(disp >= b){
                      disp = disp - b;
                      dist += b;
                      }
               else{
                   disp += f;
                   dist += f;
                   }                  
              }
              else{
                   disp += f;
                   dist +=f;
                   }
                   }
              return dist*t;
    }

int main(){
    int n,i;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
                    int F=0,B=0,T=0,D=0;
                    scanf("%d %d %d %d",&F,&B,&T,&D);
                    printf("%d ",time(F,B,T,D));
                    
                    
                    }
                    getch();
                    return 0;
    }
