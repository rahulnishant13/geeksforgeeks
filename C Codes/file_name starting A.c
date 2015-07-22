#include <stdio.h>

int main(int argc, char **argv)
{

	char ch[30];

   freopen("math.txt", "r",stdin);
   freopen("baba.txt", "w",stdout);

	while((scanf("%[^\n]s",ch)) != EOF){
			if( ((*ch) == 'S') || ((*ch) == 's') ){
				printf("%s\n",ch);
				getchar();
				}
		else{
			getchar();
			}
		}

	return 0;
}
