/*
 * quick.c
 * 
 * Copyright 2013 rahul <rahul@rahul-HP-630-Notebook-PC>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


#include <stdio.h>

void quick(int a[], int l, int h){
	int low,high,pivot;
	low=l;
	high=h;
	pivot=a[low];
	if(l<h){
	while((a[h] >= pivot) && (l < h) )
	h--;
	
	if(l != h){
		a[l]=a[h];
		l++;
		}
	
	while((a[l]<=pivot) && (l<h))
	l++;
	
	if(l != h){
		a[h]=a[l];
		h--;
		}
            }

    a[l]=pivot;
    pivot = low;
    l=low;
    h=high;
    
    if(l < pivot)
        quick(a,l,pivot-1);
    if(h > pivot)
         quick(a,pivot+1,h);
    
	}

int main(int argc, char **argv)
{
	int a[30],i,n,k;
	printf("Enter No of Elements");
	scanf("%d",&n);
	for(k=0;k<n;k++){
		scanf("%d",&a[k]);
		}
	quick(a,0,n-1);
	for(i=0;i<n;i++){
		printf("%d\t",a[i]);
	   }
	return 0;
}
