#include<stdio.h>
#include<conio.h>

int main(){
    int n,l,r,q,i,j;
    
    scanf("%d",&n);
    char z[n][10];
    for( i =1; i<=n;i++){
            scanf("%s",&z[i][10]);
            }
    
    for( j =2; j<=n+1;j++){
            printf("%s\n",z[j]);
            }
    
    scanf("\n%d",&q);
    char p[q][10];
    for(i=0;i<q;i++){
                     scanf("%s",&p[i][10]);
                     }
     for( j =1; j<n;j++){
            printf("\n%s",p[j]);
            }
     
     

    getch();
    return 0;
    }
