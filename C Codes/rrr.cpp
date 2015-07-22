#include<stdio.h>
#include<conio.h>

void merge(int arr[], int low, int mid, int high){
     int i=low,m=mid+1;
     
     int l=low, temp[high+1]; //,,,,,
     
        while(l<=mid && m<=high){
                     if(arr[l]<=arr[m]){
                                        temp[i]=arr[l];
                                        l++;
                                        }else{
                                              temp[i]=arr[m];
                                              m++;
                                              }
                        i++;                      
                     }
                     
        
                           while(l<=mid){
                           temp[i]=arr[l];
                           l++;
                           i++;
                           }
                   
                    
                              while(m<=high){
                           temp[i]=arr[m];
                           m++;
                           i++;
                           }
                   
                       
              
     for(int k=low;k<=high;k++)
       arr[k]=temp[k]; 
       
                                  
     
     }


void part(int arr[],int low ,int high){
      int mid=(low+high)/2 ; 
     if(low<high){
            part(arr,low,mid);
            part(arr,mid+1,high);
             //printf("%d",high); 
                     
            merge(arr,low,mid,high);           
                      }
         return;             
     }



int main(){
    int arr[]={6,5,3,4,7,2,1};
    part(arr,0,6);
    for(int k=0;k<7;k++)
       printf("%d\t",arr[k]);
       
       getch();
       return 0;
    }
