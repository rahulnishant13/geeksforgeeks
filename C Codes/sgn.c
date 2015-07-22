#include <stdio.h>


int main(int argc, char **argv)
{     
	 short int si;
	 signed short int ssi;
	 unsigned short int usi;
	 
	
    printf("\n%d  , %d    ,%d",sizeof si, sizeof ssi, sizeof usi);
    
    //si=ssi=-32769;
    usi=-1;
   // printf("\n%d  , %d    ",usi,ssi);
    printf("\n%d    ",usi);
   // printf("\n%d  , %d    ,%d",sizeof si, sizeof ssi, sizeof usi);
	
	
	
	return 0;
}

