#include<stdio.h>

int main(int argc, char **argv){

  float determinant=0;
	FILE *fp;
    fp = fopen("input.txt","r");
    if ( fp == NULL )
    {
        puts ( "Cannot open source file");
    }

    int lines=1,z=1;
    char c;
    while((c = fgetc(fp)) != EOF)
    {
		if( (c >= 'A') && (c <= 'z')){
			printf("Invalid Input");
			return 0;
			}
		if((c == ' ') && (lines == 1)){
			z++;
			}
        if(c == '\n'){
			lines++;
			}
    }

	if(z != (lines-1)){
		printf("Matrix inverse can be calculated only for a square matrix.");
		}
else{
    fclose(fp);
    fp = fopen("input.txt","r");
    float a[lines][lines];

    int i,j;
    for(i=0;i<lines;i++)
    {
        for(j=0;j<(lines-1);j++)
        {
            fscanf( fp, "%f", &(a[i][j]));
        }
    }


  for(i=0;i<(lines-1);i++)
      determinant = determinant + (a[0][i]*(a[1][(i+1)%3]*a[2][(i+2)%3] - a[1][(i+2)%3]*a[2][(i+1)%3]));

if(determinant != 0){
   printf("Inverted Matrix :\n");
   for(j=0;j<(lines-1);j++){
      for(i=0;i<(lines-1);i++)
           printf("%.3f\t",((a[(i+1)%3][(j+1)%3] * a[(i+2)%3][(j+2)%3]) - (a[(i+1)%3][(j+2)%3]*a[(i+2)%3][(j+1)%3]))/ determinant);
       printf("\n");
   }
}
else{
	printf("Matrix is singular. Cannot find inverse.");
	}
}
   return 0;
}
