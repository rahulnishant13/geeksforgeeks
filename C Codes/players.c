#include <stdio.h>
#include <malloc.h>

struct player{
	char * name;
	int age;
	int test;
	int av_run;
	};

struct player p[50];

int main(int argc, char **argv)
{
	int i,j,temp,n,a[50];

	printf("Enter no Of Plyers : ");
	scanf("%d",&n);
	
	for(i=1;i<=n;i++){
		p[i].name = (char *)malloc(30);
		printf("\nEnter NAME, AGE, TEST MATCHES, AVG RUN : ");
		scanf("%s%d%d%d",p[i].name,&p[i].age,&p[i].test,&p[i].av_run);
		}

for(i=0;i<=n;i++){
	a[i] = p[i].av_run;
	}

  for(i=1; i<=n ;i++)
  {
   for(j=i+1;j<=n;j++)
   {
     if(a[i]>a[j]){
      temp = a[i];
      a[i] = a[j];
      a[j] = temp;
     }
   }
  }

	for(i=1;i<=n;i++){
		for(j=1;j<=n;j++){	
		    if(a[i] == p[j].av_run){
		      printf("NAME : %s\tAGE : %d\tTEST MATCHES : %d\tAVG RUN : %d\n",p[j].name,p[j].age,p[j].test,p[j].av_run);
		      }
		    }
		}
	return 0;
}
