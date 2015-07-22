#include <stdio.h>

int main(int argc, char **argv)
{
	int i,t;
	char name[100];
	//while(true){
		
		gets(name);
	/*name=	getchar();
		gets(name);
	//	}*/
	
	//printf("\\t \\b \\ ");
	
	char* ptr=name;
	for(i=0;(*ptr != '\0'); i++){
		t=0;
		while(*ptr == ' '){
			t=1;
			ptr++;
			}
		if(t == 1){
			printf(" ");
			}
		printf("%c",*ptr);
		ptr++;
		}
	
	return 0;
}
