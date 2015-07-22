#include <stdio.h>

int day(int dt, int mnth, int yr, int sum){
	switch(mnth - 1){
		case 12 :
		sum += 31;
		
		case 11 :
		sum += 30;
		
		case 10 :
		sum += 31;
		
		case 9 :
		sum += 30;
		
		case 8 :
		sum += 31;
		
		case 7 :
		sum += 31;
		
		case 6 :
		sum += 30;
		
		case 5 :
		sum += 31;
		
		case 4 :
		sum += 30;
		
		case 3 :
		sum += 31;
		
		case 2 :
		if(yr % 4 == 0){
			sum += 29;
			}
		else{
			sum += 28;
			}
		
		case 1 :
		sum += 31;
		
		case 0 :
		break;
		}
	return (sum + dt);
	}

void din(int days){
	days = days % 7;
	
	switch(days){
		case 1 :
		   printf("Monday");
		   break;
		case 2 :
		   printf("Tuesday");
		   break;
		case 3 :
		   printf("Wednseday");
		   break;
		case 4 :
		   printf("Thrusday");
		   break;
		case 5 :
		   printf("Friday");
		   break;
		case 6 :
		   printf("Saturday");
		   break;
		case 0 :
		   printf("Sunday");
		   break;
		}
	}

int main(int argc, char **argv)
{
	int i,sum=0,dt,mnth,yr,days=0;
	
	printf("Enter Date Month Year : ");
	scanf("%d%d%d",&dt,&mnth,&yr);

	for(i=1900;i < yr; i++){
		if(i%4 == 0){
			sum += 366;
			}
		else{
			sum += 365;
			}
		}
	if(dt <= 31 && mnth <= 12){
		if(mnth == 2){
			if((yr % 4 == 0 && dt <= 29)  || (yr % 4 != 0 && dt <= 28)){
				days = day(dt,mnth,yr,sum);
				din(days);
				return 0;
				}
			else{
				printf("ERROR");
				return 0;
		       }
			}
		days = day(dt,mnth,yr,sum);
		din(days);
		}
	else{
		printf("ERROR");
		}
	
	//printf("Su\tM\tT\tW\tTH\tF\tSA");


	return 0;
}

