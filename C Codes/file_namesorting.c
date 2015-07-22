#include <stdio.h>

int main(int argc, char **argv)
{

	char ch[30];
	int j;


	 freopen("baba.txt", "r",stdin);
     freopen("baba.txt","a",stdout);

printf("\nSorted :->\n");

	for(j = 'A'; j<= 'Z'; j++){
		freopen("baba.txt", "r",stdin);
	while((scanf("%[^\n]s",ch)) != EOF){
			if((*ch) == j){
				printf("%s\n",ch);
				getchar();
				}
		else{
			getchar();
			}
		}
	}

	return 0;
}
