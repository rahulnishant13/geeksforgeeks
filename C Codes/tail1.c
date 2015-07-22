/*
 * tail1.c
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
	FILE *fc,*fp;
	char c;
	int i=0,j=0,n;
    n = atoi(argv[2]);
    fc = fopen(argv[1],"r");
    fp = fopen(argv[1],"r");
    
    while((c=fgetc(fc)) != EOF ){
	   if(c == '\n'){
			j++;
			}
	   }
    while( (c=fgetc(fp)) != EOF ){
		if(c == '\n'){
			i++;
			}
			if((j-n) <= i){
				printf("%c",c);
				}
		}
	return 0;
}

