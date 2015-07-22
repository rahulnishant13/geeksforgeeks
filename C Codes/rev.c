#include <stdio.h>

void rev(){
	char ch;
	scanf("%c",&ch);
	if(ch == 't')
	   return;
	rev();

	printf("%c",ch);
	}

int main(int argc, char **argv){
	rev();
	return 0;
	}
