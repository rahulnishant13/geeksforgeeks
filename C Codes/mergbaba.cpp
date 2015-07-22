#include<stdio.h>
#include<conio.h>

void merge(int arr[], int left, int mid, int right)
        {
            int i, l, n, t, temp[10];
            l = mid - 1;
            t = left;
            n = right - left + 1;

while ((left <= l) && (mid <= right))
        { 
                if (arr[left] <= arr[mid])
                {
                        temp[t] = arr[left];
                        left = left +1;
                        
                }
                else
                {
                        temp[t] = arr[mid];
                        mid = mid + 1;
                       
                }
                t = t + 1;
        }
        while (left <= l)
                {
                        temp[t] = arr[left];
                        left = left + 1;
                        t = t + 1;
                }
        while (mid <= right)
                {
                        temp[t] = arr[mid];
                        mid = mid + 1;
                        t = t + 1;
                }
        for (i = 0; i <= n; i++)
                {
                        arr[right] = temp[right];
                        right = right - 1;
                }
        }

void sort(int arr[], int left, int right)
{
        int mid;
        if (right > left)
        {
            mid = (right + left) / 2;
            sort(arr, left, mid);
            sort(arr, mid+1, right);
            for(int k = left; k<right;k++){
                  printf("%d\t",arr[k]);
                  }
                  printf("\n");
            merge(arr, left, mid+1, right);
            
        }
}

int main(){
    int   arr[10]={5,40,1,3,4,56,11,2},temp[10];
    sort(arr, 0, 7);
     printf("\n\n\n");
    for(int k = 0; k<8;k++){
                  printf("%d\t",arr[k]);
                  }
    getch();
    return 0;
    }
