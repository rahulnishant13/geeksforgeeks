#include <stdio.h>
#define in 9999

void dijkstra(int n, int v, int wt[n][n], int dist[], char arr[n],char flow[n]){
	int i,j,flag[n],count=2,min,X=0,k=1;
	flow[0] = arr[0] = 'A';

	for(i=1;i<=n;i++){
		flag[i]=0;
		dist[i]=wt[v][i];
		if(wt[v][i] < in)
		arr[i]= 'A';
		else
		arr[i]= 'z';
		}

	while(count <= n){
		min = 999;
		for(i=1;i<=n;i++){
			if((dist[i]<min) && !flag[i]){ min = dist[i],j=i;}
			}
flow[k]='A'+j-1;
		flag[j] = 1;
		for(i=1;i<=n;i++){
			if((wt[j][i] < in)){
				X = wt[j][i] + dist[j];
				if(X < dist[i]){
					dist[i] = X;
					arr[i] = flow[k];
					//printf("ARR%c  ",arr[i]);
					}
				}
			}

			k++;
		count++;
		}
	//printf("%s    %s\n",flow,arr);
	}

int main(int argc, char **argv)
{
	int n,i,j,v,a;
	printf("Enter no of nodes : ");
	scanf("%d",&n);
	int wt[n][n],dist[n];
	char flow[n],arr[n];
	printf("Enter weight matrix\n");
	for(i=1;i<=n;i++)
		for(j=1;j<=n;j++){
			scanf("%d",&a);
			wt[i][j] = a;
			if(a==0)
				wt[i][j] = in;
			}
	printf("Enter The Starting Virtex : ");
	scanf("%d",&v);
	dijkstra(n,v,wt,dist,arr,flow);
	for(i=1;i<=n;i++){
	if(i != v){
		for(j=0;j<i;j++){
			printf("%c->",flow[j]);
			if(arr[i] == flow[j])
				j= i;
			}
		printf("%c,cost=%d\n",i-1+'A',dist[i]);
		}
	}
	return 0;
}
