#include <stdio.h>
#include <ctype.h>

double atof(char s[] ) {
   int i,sign;
   double val,power;

   for(i=0;(isspace(s[i]));i++)
      ;
   
   sign = (s[i] == '-') ? -1 : 1;

   if(s[i] == '+' || s[i] == '-')
       i++;

   for(val = 0.0; isdigit(s[i]); i++){
	   val = val * 10.0 + (s[i] - '0');
	   }

   if(s[i] == '.')
       i++;

   for(power = 1.0; isdigit(s[i]); i++){
	   val = val * 10.0 + (s[i] - '0');
	   power *= 10.0;
	   }

    return sign * (val / power);

}


int main(int argc, char **argv)
{
	int i;
	double val = 0.0;
	char c,s[50];
	for(i=0;(c = getchar()) != EOF ;i++){
		s[i] = c;
		}

	val = atof(s);
	printf("%f",val);
	return 0;
}
