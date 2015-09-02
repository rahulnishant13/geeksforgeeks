#include <stdio.h>
#include <conio.h>
 
int main(int argc, char **argv)
{
    int a[] = {4, 65, 2, -31, 0, 99, 2, 83, 782, 1};

    int i, j, m, t,n =10;
    for (i = 0; i < n; i++) {
        for (j = i, m = i; j < n; j++) {
            if (a[m] > a[j])
                m = j;
        }
        t = a[i];
        a[i] = a[m];
        a[m] = t;
    }
    for(i=0;i<n;i++)
    printf("%d\t",a[i]);
    getch();
    return 0;
}
