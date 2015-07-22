#include<stdio.h>
#include<conio.h>

void merge(int arr[],int low, int mid, int h){
    int m = mid+1;
    int temp[7],i=low,l=low;
     
     while((l<=m) && (m<=h)){
             if(arr[l]<=arr[m]){
                                temp[i]=arr[l];
                                 l++;
                                }
              else{
                   temp[i]=arr[m];
                   m++;
                   }   
                   i++;              
             }
          
          
          
          if(l>mid){
                  for(int k = l;k<=mid;k++){
                       temp[i] = arr[k];
                       i++;
                       }
                  }
          else{
               for(int k = l;k<=mid;k++){
                       temp[i] = arr[k];
                       i++;
                       }
               }
          
          for(int k = low; k<=h;k++){
                  arr[k] = temp[k];
                  printf("%d\t",temp[k]);
                  }
                  printf("\n");
     }     

void part(int arr[],int l, int h){
     int mid= (l+h)/2;
     if(l<h){
     part(arr,l,mid);
     part(arr,mid+1,h);
     merge(arr,l,mid,h);
     }
     }


int main(){
    
  int   arr[]={1,2,3,4,5,6,7};
    part(arr,0,6);
    for(int k = 0; k<7;k++){
                  printf("%d\t",arr[k]);
                  }
    
    getch();
    return 0;
    }

