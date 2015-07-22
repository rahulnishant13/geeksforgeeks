#include <stdio.h>

int main(int argc, char **argv)
{
	int ws=0,i,oth=0,dig[10]={0,0,0,0,0,0,0,0,0,0};
	int c;
	while((c=getchar())!=EOF){
		
		if(c>='0' && c<='9'){
			++dig[c-'0'];
			}
		
		else if((c == '\n') || (c == '\t') || (c == ' ')){
			++ws;
			}
		
		else{
			++oth;
			}
		}


	for(i=0;i<10;i++){
		printf("%d",dig[i]);
		}
	printf("\nWhite Space = %d Others = %d",ws,oth);
	
	return 0;
}

