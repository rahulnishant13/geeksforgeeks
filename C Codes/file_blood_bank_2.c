#include <stdio.h>

int main(int argc, char **argv)
{
	int age,bg,i=1,a=0,b=0;
	char name[30],add[10];
	printf("Enter Age And BloodGrp : ");
	scanf("%d%d",&a,&b);
	freopen("baba.txt","r+",stdin);
	while((scanf("%[^\n]s",name)) != EOF){
		scanf("%[^\n]s",name);
		  getchar(); scanf("%d",&age);
		  scanf("%s",add);
		  scanf("%d",&bg);
		  
		  if((age <= a) && (b == bg)){
			  printf("%s\n",name);
			  printf("%d\n",age);
			  printf("%s\n",add);
			  printf("%d\n\n",bg);
			  }

		    getchar();
		    getchar();
		    i++;
		}
	
	return 0;
}

