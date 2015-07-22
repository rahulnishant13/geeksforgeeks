#include <stdio.h>

int main(int argc, char **argv)
{
	int i;
	char name[100];
	//while(true){
		
		gets(name);
	/*name=	getchar();
		gets(name);
	//	}*/

	
	char* ptr=name;
	for(i=0;(*ptr != '\0'); i++){
		
		while(*ptr == ' '){
			printf("\\b");
			ptr++;
			}

		while(*ptr == '\t'){
			printf("\\t");
			ptr++;
			}

		while(*ptr == '\\'){
			printf("\\");
			ptr++;
			}

		printf("%c",*ptr);
		ptr++;
		}
	
	return 0;
}
