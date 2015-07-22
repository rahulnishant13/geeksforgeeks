#include<stdio.h>

int main()
{
    int c,n,m,a1[50]={0},a2[50]={0},i,j,x,y,flag1,flag2;
    scanf("%d %d",&n,&m);
    for(c = 0 ; c < m ; c++)
    {
          flag1=flag2=0;
            scanf("%d %d",&x,&y);
            for(i=0 ; a1[i] != 0; i++)
            {
                    if(a1[i]==x)
                    {
                                flag1 = 1;
                    }        
                    if(a1[i]==y)
                    {
                                flag2 = 1;
                    }
                    
            }
            if(flag1==0 && flag2==0)
            {
                        
                        for(j=0 ; a2[j] != 0; j++)
                        {
                                if(a2[j]==x)
                                  {
                                   flag1 = 1;
                                   }
                                     if(a2[j]==y)
                                     {
                                            flag2 = 1;
                                     }
                         }
                         if (flag1 == 1)
                         {
                                      if(flag2==1)
                                      {
                                             printf("No");
                                             return 0;     
                                      }
                                      else
                                          a1[i]=y;          
                         }
                         else if(flag2 == 1)
                         {
                                 a1[i] = x;    
                         }
                         else
                         {
                              a1[i] = x; 
                               a2[j] = y;    
                         }
                        
            }
            
            else if (flag1==1 && flag2==1)
            {
                      printf("No");
                      return 0;
            }
            else if (flag1==1)
            {
                 for(j=0 ; a2[j] != 0; j++)
                        {
                            if(a2[j]==y)
                            {
                            flag2 = 1;
                            }
                        }
                        if(flag2 != 1)
                                 a2[j] = y;
            }
            else
            {
                for(j=0 ; a2[j] != 0; j++)
                        {
                            if(a2[j]==x)
                            {
                            flag1 = 1;
                            }
                        }
                        if(flag1 != 1)
                                 a2[j] = x;
            }
            
                   
    }
    printf("Yes");
    return 0;
}
