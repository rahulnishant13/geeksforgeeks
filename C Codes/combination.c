/*
 * combination.c
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
#include <math.h>
#include <time.h>

int main(int argc, char **argv)
{
	clock_t  start,end;
	start = clock();
	
	int t1,t2,a[25],z=0,i,d,b,c,dig,status = 0,num=0 ;
	t1=time(NULL);
	
	double ts;
	
	//sleep(5);
	
	while(1){
		d=(rand()%3)+1;
		b=(rand()%3)+1;
		c=(rand()%3)+1;
		if((d!=b) && b!=c && c!=d){
			dig=d+b*10+c*100;
			for(i=0;i<num;i++){
				if(a[i] == num){
					status = 1;
					}
				}
				if(status == 0){
					a[num]= dig;
					printf("%d\n",dig);
					num++;
					}
			}
			if(num == 6)
			  break;
			  
			  z++;
		}
	
		end = clock();
		ts = (double)(end - start);
	
	t2 = time(NULL);
	printf("\n\n%d\t%f\n%d",t2-t1,ts,z);
	return 0;
}
