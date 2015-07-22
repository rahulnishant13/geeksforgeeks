#include <stdio.h>
void linkfloat();

int main(int argc, char **argv)
{
	struct engine{
	int y_of_manufacture;
	char material[30];
	int quantity;
	};
	
	struct engine b[100];
	int i;
	for(i=0;i<=1;i++){
		fflush(stdin);
	    scanf("%d%s%d",&b[i].y_of_manufacture,&b[i].material,&b[i].quantity);
		}

	for(i=0;i<=1;i++){
		printf("\nY:%d M:%s Q:%d",b[i].y_of_manufacture,b[i].material,b[i].quantity);
		}
	
	return 0;
}

void linkfloat(){
	float a=0,*b;
	b = &a;
	a = *b;
	}
