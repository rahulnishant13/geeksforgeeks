#include<stdio.h>
#include<conio.h>

int main(){
    int no[7]={0,3,1,25,33,54,20};
    int swap=true;
    for(int i=0;i<6 && swap==true;i++){
            swap=false;
            for(int j=0; j<6-i;j++){
                    if(no[j]>no[j+1]){
                                      swap=true;
                                      int temp= no[j];
                                      no[j]=no[j+1];
                                      no[j+1]=temp;
                                      
                                      }
                    }
            
            }
            int k=0;
       while(k<7){
                  printf("%d\t",no[k]);
                  k++;
                  }     
            getch();
            return 0;
    }
