#include<stdio.h>
#include<conio.h>
#define MAX 50

void merge(int a[],int low, int mid, int high){
     int i = low ,l=low;
     int m = mid+1;
               else {
                    temp[i] = a[m];
                    m++;
                    }
                    i++;
     if(l>m){
             for(int k = m; k<=h;k++){
                     temp[i] = a[k];
                     i++;
                     }
             }
     else{
          for(int k=l;k<=mid;k++){
                              temp[i] = a[k];
                              i++;
                              }
          }
     
     for(int k=low;k<=h;k++){
                    a[k] = temp[k];
                    }
                    }
     
     }

void part(int arr[],int l, int h){
     int mid;
     if(l<h){
     mid= (l+h)/2;
     part(arr,l,mid);
     part(arr,mid+1,h);
     merge(arr,l,mid,h);
     }
     }

int main(){
    int i,merge[10],n;
    printf("Enter the no of Element");
    scanf("%d",&n);
    for (i=0;i<=n;i++){
        scanf("%d",&merge[i]);
        }
    part(merge,0,n-1);
    printf("aftr shorting");
     for(i=0;i<=n;i++){
                    printf("%d\t",merge[i]);
                    }
    getch();
    return 0;
    }
