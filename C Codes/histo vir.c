#include <stdio.h>

int main(int argc, char **argv)
{
	int k=0,j,i;
	int wordlen[]={0,0,0,0,0,0,0,0,0,0};
	int c;
	while((c=getchar()) != EOF){
		int t=0;
		
		if((c != '\n'))
		  wordlen[k]++;
		 
		printf("\n%d",k);
		while(c == '\n'){
			t=1;
			c=getchar();
			printf("abc");
			}

		if(t == 1){
			k++;
			}
		}

int max=0;
printf("\n");
	for(i=0;i<=k;i++){
			if(max < wordlen[i]){
				max = wordlen[i];
				j = i;
			   }
		}
printf("%c",wordlen[j]);
	return 0;
}
