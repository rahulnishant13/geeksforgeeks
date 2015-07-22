#include<stdio.h>
#include<conio.h>

void merge(int a[], int low, int mid, int high){
     int temp[high+1],i,l,m=mid+1;
     i=l=low;
     
     while((l<=mid) && (m<=high)){
                    if(a[l]<=a[m]){
                                   temp[i]=a[l];
                                   l++;
                                   }
                    else{
                         temp[i]=a[m];
                         m++;
                         }
                    i++;
                    }
     
     if(l<=mid){
                for(int k=l;k<=mid;k++){
                                      temp[i]=a[l];
                                      l++;
                                      i++;
                                      }
                }
     else if(m<=high){
          for(int k=m;k<=high;k++){
                               temp[i]=a[m];
                               m++;
                               i++;
                               }
          }
     
     for(int k=low;k<=high;k++){
                    a[k] = temp[k];
                    }
     }

void partition(int a[], int low, int high){
    
     if(low<high){
                   int mid = (low+high)/2;
                  partition(a,low,mid);
                  partition(a,mid+1,high);
                  
                  merge(a,low,mid,high);
                  }
                  return;
     }

int main(){
    int a[]={4,3,2,1};
    
    partition(a,0,3);
    
    for(int k=0;k<4;k++){
                    printf("%d\t",a[k]);
                    }
    getch();
    return 0;
    }
