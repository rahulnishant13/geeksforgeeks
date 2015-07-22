#include <stdio.h>
#include <conio.h>

int main(){
    int n,i,j,k,l,p;
     
    printf("enter alphabet");
    scanf("%d",&n);
    for(i=0;i<n;i++){
                     p=65;
                     for(j=n-i;j>0;j--){
                                        printf("%c ",p);
                                        p++;
                                        }
                     for(k=2;k<=2*(i+1)-1;k++){
                                               printf("  ");
                                               }
                     l=p-1;
                     
                     for(j=n-i;j>0;j--){
                                        printf("%c ",l);
                                        l--;
                                        }
                     printf("\n");
                     }
                     getch();
                     return 0;
    }
