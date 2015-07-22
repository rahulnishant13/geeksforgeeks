#include <stdio.h>

void itoa(int n, int b){
	int i=0,sign,j=0,k,temp,rem;
	int s[50];

	if((sign = n) < 0){
		n = -n;
		}

	do {
		rem = n % b ;
		if(rem > 9){
			s[i++] = 'A' + (rem - 10);
			}
		else{
			s[i++] = rem;
			}
		} while((n = n/b) > 0);

	if(sign < 0){
		s[i++] = '-';
		}

	s[i] = '\0';

	for(k=0,j = i; k < j; k++, j-- ){
		temp = s[j] , s[j] = s[k] , s[k] = temp;
		}

	j=0;
	while(j <= i){
		if(s[j] > 10){
			printf("%c ",s[j]);
			}
		else
		printf("%d ",s[j]);
		j++;
		}
	}


int main(int argc, char **argv)
{
	int n,b;

    printf("Enter the Integer : ");
	scanf("%d",&n);

	printf("Enter the Base : ");
	scanf("%d",&b);

	itoa(n,b);

	return 0;
}
