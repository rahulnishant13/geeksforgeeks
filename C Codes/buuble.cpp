#include<stdio.h>
#include<conio.h>

int main(){
    int i,j,n=4,a[5]={4,8,3,9},temp;
    int switched = true;
    for(i=0;i<(n-1) && switched == true; i++){
                    switched = false;
                    
                    for(j=0;j<(n-1-i);j++){
                                           if(a[j]>a[j+1]){
                                                           switched = true;
                                                           temp = a[j];
                                                           a[j] = a[j+1];
                                                           a[j+1] = temp;
                                                           }
                                           
                                           }
                    
                    }
                    int k=0;
       while(k<4){
                  printf("%d\t",a[k]);
                  k++;
                  } 
    
    getch();
    return 0;
    }
