#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

#define MAXOP 100
#define NUMBER '0'

int getop(char []);
int getch(void);
void ungetch(int);
void push(double);
double pop(void);

int main(int argc, char **argv)
{
	int type;
	double op2;
	char s[MAXOP];

	while((type = getop(s)) != EOF){

		switch(type){
			case NUMBER:
			     push(atof(s));
			     break;
			case '+':
			     push(pop() + pop());
			     break;
			case '*':
			     push(pop() * pop());
			     break;
			case '-':
			     op2 = pop();
			     push(pop() -op2);
			     break;
			case '/':
			     op2 = pop();
			     if(op2 != 0.0)
			        push(pop() / op2);
			     else
			        printf("ERROR CANN'T Divide by 0");
			     break;
			case '\n':
			     printf("\t%.8g\n",pop());
			     break;
			default :
			     printf("ERROR : unknown command %s\n",s);
			     break;
			}		
		}
	return 0;
}

int sp=0;
double val[MAXOP];

void push(double f){
	if(sp < MAXOP)
	   val[sp++] = f;
	else
	   printf("ERROR : stack full, can't push %g\n",f);
	}

double pop(void){
	if(sp > 0)
	   return val[--sp];
	else
	   printf("ERROR : stack empty\n");
	   return 0.0;
	}

int getop(char s[]){
	
	int i,c;
	
	while((s[0] = c = getch()) == ' ' || c == '\t')
	     ;
	s[1] = '\0';
	if(!isdigit(c) && c != '.')
	    return c;
	i = 0;
	if(isdigit(c))
	    while(isdigit(s[++i] = c = getch()))
	    ;
	if(c == '.')
	    while(isdigit(s[++i] = c = getch()))
	    ;
	s[i] = '\0';
	if(c != EOF)
	    ungetch(c);
	
	return NUMBER;
	}

char buf[MAXOP];
int bufp = 0;

int getch(void){
	return(bufp > 0) ? buf[--bufp] : getchar();
	}

void ungetch(int c){
	if(bufp >= MAXOP)
	    printf("ungetch: too many characters\n");
	else
	   buf[bufp++] = c;
	}
