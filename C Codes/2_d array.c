/*
 * 2_d array.c
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

void fun(int a[4][4]){

	int i,*b;
	b = a;
	for(i=0; i<10;i++){
		 printf("%d\t",*b);
		 b++;
		}
		
	}

int main(int argc, char **argv)
{
	int a[4][4],i,j;
	for(i=0; i<2;i++){
		for(j=0;j<2;j++)
		 scanf("%d",&a[i][j]);
		}

	fun(a);
	return 0;
}

