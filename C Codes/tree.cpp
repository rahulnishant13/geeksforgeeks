#include<stdio.h>
#include<conio.h>
#include<malloc.h>

struct node{
       int data;
       struct node * left , *right;
       
       };

typedef struct node * box;

int main(){

    do{
           int d;
           printf("Enter the data \n");
           scanf("%d",&d);
           }
     while(d!="");      

    }
