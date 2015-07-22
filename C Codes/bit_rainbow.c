/*
 * rainbow.c
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

int main(int argc, char **argv)
{
	int a,arr[8];
	printf("Enter The Nos. : ");
	scanf("%d",&a);
	int i;
	for(i=7; i>=0; i--){
		int mask= 1<<i;
		int bin = mask & a;
		(bin==0) ? (printf("0") && (arr[i] = 0)):(printf("1") && (arr[i] = 1)) ;
		}

	printf("\n\n");

	if(arr[0] == 1)
	 printf("Violet ");
	if(arr[1] == 1)
	 printf("Indigo ");
	if(arr[2] == 1)
	 printf("Blue ");
	if(arr[3] == 1)
	 printf("Green ");
	if(arr[4] == 1)
	 printf("Yellow ");
	if(arr[5] == 1)
	 printf("Orange ");
	if(arr[6] == 1)
	 printf("Red");

	return 0;
}
