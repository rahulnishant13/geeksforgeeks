/*
 * gold.c
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

int count=0;
 int value(int n){
	 count++;
	int	A=0,B=0,C=0 ;
	

	if(n < 12){
		return n;
		}

	else{
		A += value(n/2);
		B += value(n/3);
		C += value(n/4);
		printf("A %d\n",A);
		printf("B %d\n",B);
		printf("C %d\n",C);
		
		return A+B+C;
		}
	}

int main(int argc, char **argv)
{
	printf("A \n\n%d\n\n ",value(60));
	printf("A \n\n%d\n\n",count);
	return 0;
}
