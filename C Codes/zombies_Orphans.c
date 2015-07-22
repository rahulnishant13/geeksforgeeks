#include <stdio.h>
#include <unistd.h>
#include <sys/types.h>

int main( )
{
unsigned int i = 0 ;
int pid, status ;

pid = fork() ;

if ( pid == 0 )
{

while( i < 4294967295U )
i++ ;

printf("The child is now terminating\n");
}

else
{
waitpid( pid, &status, 0 ) ;

if( WIFEXITED(status) )
printf ( "Parent: Child terminated normally\n" ) ;

else
printf ( "Parent: Child terminated abnormally\n" ) ;
}

return 0 ;

}

// WIFEXITED error
// waitpid error
