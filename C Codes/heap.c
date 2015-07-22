/*
 * heap.c
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

void heap(int arr[], int n){
	int temp,lr,i,prnt;
  for(i=0;i < n;i++){
	temp = arr[i];
	lr = i;
	prnt = (lr -1)/2;
	while(lr > 0 && arr[prnt] < temp){
		arr[lr] = arr[prnt];
		lr = prnt;
		prnt = (lr-1)/2;
		}
	arr[lr] = temp;
	}
}

int main(int argc, char **argv)
{
	int i,a[]={6,7,8,9};
	
	heap(a,4);
	for(i=0;i<=3;i++){
		printf("%d",a[i]);
		}
	
	return 0;
}

