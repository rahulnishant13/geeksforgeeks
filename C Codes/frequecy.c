#include <stdio.h>

int main(int argc, char **argv)
{
	int a[26],i,c,j;
	for(i=0;i<26;i++){
		a[i] = 0;
		}

  while((c = getchar()) != EOF){
		  if((c >= 'a') || ( c <= 'z')){
			  a[c -'a']++;
			  }	    
	  }

	for(i=0;i<26;i++){
		if(a[i] > 0)
		printf("\t%c%c : %d",'A'+i,'a'+i,a[i]);
			}

	for(i=0;i<26;i++){
	if(a[i]>0){
		printf("\n%c%c : ",'A'+i,'a'+i);
		for(j=0;j<a[i];j++)
			printf("0");
			}
    }
  return 0;
}
