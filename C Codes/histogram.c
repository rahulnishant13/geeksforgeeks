#include <stdio.h>

int main(int argc, char **argv)
{
	int k=0,j,i;
	int wordlen[]={0,0,0,0,0,0,0,0,0,0};
	int c;


	while((c=getchar()) != EOF){
		int t=0;
		
		if((c != '\n') || (c != ' ')){
		  wordlen[k]++;
	  }


		while(c == ' '){
			t=1;
			c=getchar();
			}

		if(t == 1){
			k++;
			}
		}

printf("\n");
int max = 0;
	for(i=0;i<=k;i++){
		if(max < wordlen[i]){
			max = wordlen[i];
			}
		}
printf("max %d KK %d",max,k);

for(i=0;i<= max; i++){
	for(j=0;j<= k; j++){
		
		if((max - wordlen[j]) > 0){
			wordlen[j]++;
			//printf("XX %d",wordlen[j]);
			printf(" ");
			}
		
		else{
			printf("0");
			}
		}
		printf("\n");
	
	}

	return 0;
}
