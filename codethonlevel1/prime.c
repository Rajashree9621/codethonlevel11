#include <stdio.h>

int main()
{
    int n,count=0;
    printf("enter the no.");
    scanf("%d",&n);
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
            count++;
            }
        }
        if(count==0)
        {
            printf("no.is prime");
        }
        else{
            printf("no. is not prime");
        }
    }
}