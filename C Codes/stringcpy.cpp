#include<conio.h>
#include<stdio.h>
#include<iostream>

using namespace std;

void swap(char *str1, char *str2)
{
	char temp;
     while(*str1 != '\0' && *str2 != '\0' ){
                  temp = *str1;
                *str1 = *str2;
                 *str2 = temp;
                // cout<<"\n"<<*str1<<" "<<*str2<<"\n";
                str1++;
                 str2++;
                 
                }
  
}  
   
int main()
{
  char str1[] = "Geek";
  char str2[] = "Quiz";
  swap(str1, str2);
  printf("str1 is %s, str2 is %s", str1, str2);
  getch();
  return 0;
}
