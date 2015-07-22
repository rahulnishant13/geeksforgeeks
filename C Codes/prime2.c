#include <stdio.h>

int main(int argc, char **argv)
{
	int input1=1,input2=100000,i,j=0,a[100000],sum=0,b[10000];

	for(i=input1; i<=input2; i++){
		if(((i % 2) != 0) || (i == 2)){
			a[j] = i;
			j++;
			}
			sum++;
		}

int l,n,k=0,m=3,o=0;
n = j-1;
b[0]=2;

do{

	for(i=0;i<=o;){
		if(m % b[i] == 0){
			m++;
			i = 0;
			}
		else{
			i++;
			}
			sum++;
		}
	o++;
	b[o] = m;
//printf("%d %d %d\n",m,o,b[o]);

	l = 0;
	for(k = 0;k <= n;k++){
		if( (a[k] == m) || (a[k] % m !=0) ){
			a[l] = a[k];
		    l++;
			}
			sum++;
		}
		n = (l-1);
		m++;

	}while(m < (a[n]/2) +1);

k =0;

	while(l>0){
		printf("%d\t",a[k]);
		l--;
		k++;
		}

printf("\n\n%d",sum);
	return 0;
}
