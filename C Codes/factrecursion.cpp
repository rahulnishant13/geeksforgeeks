#include<stdio.h>
#include<conio.h>

int power_recur(int a, int b){
    if((a == 0) && (b == 0)){
          printf("\n power_recur: Undefined 0^0 \n");
          exit (0);
          }
    if(a == 0)
          return(0);
    if((a != 0) && (b == 0))
          return(1);
    if(b > 0)
          return(a * power_recur(a, b-1));
    }
    
    {
          int repeated_product = 1;
          
          if((a == 0) && (b == 0)){
                printf("\n power_recur: Undefined 0^0 \n");
                exit(0);
                }
          if(a == 0)
                return(0);
          
          if((a !=0) && (b == 0))
                return(1);
          
          while(b > 0){
                  repeated_product *= a;
                  b--;
                  }
          }

void main(void){
     int a=3, b=4;
     
     printf("\n ** POWER FUNCTION: A^B ** \n*");
     printf("\n Recursive version: %d^%d = %d \n*, a,b, power_iter(a,b)");
     }
