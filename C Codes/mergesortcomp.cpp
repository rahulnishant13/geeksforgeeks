#include<stdio.h>
#include<conio.h>

void merge(int a[], int low, int mid, int high){
     int i,l,m=mid+1,temp[high+1];
     i=l=low;
     
     while(l<=mid && m<=high){
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
     
     while(l<=mid){
                   temp[i]=a[l];
                   l++;
                   i++;
                   }
     while(m<=high){
                    temp[i]=a[m];
                    m++;
                    i++;
                    }
     
     for(int k=low;k<=high;k++){
             a[k]=temp[k];
             }
     }

void part(int a[], int low, int high){
     if(low<high){
                  int mid = (low+high)/2;
                  part(a,low,mid);
                  part(a,mid+1,high);
                  
                  merge(a,low,mid,high);
                  }
     }

int main(){
    int a[50],n;
    printf("Enter no of elements : ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
                     scanf("%d",&a[i]);
                     }
    printf("\n");
    part(a,0,n);
    
    for(int i=0;i<n;i++){
                     printf("%d ",a[i]);
                     }
    
    getch();
    return 0;
    }
