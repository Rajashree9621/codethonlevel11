#include <stdio.h>

int main()
{
    int n,i;
    printf("enter the no.");
    scanf("%d",&n);

    while(i<=n)
    {
        if(i%2==0)
        {
            printf("no is even");
            
        }
        else{
            printf("no is odd.");
            
        }
    }

}