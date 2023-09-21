#include <stdio.h>

int main()
{
    int a[5]={};
    int b[5]={};
    int sum=0;
    printf("enter the elements:");

    for(int i=0;i<=5;i++)
    {
        for(int j=0;j<=5;j++)
        {
            scanf("%d",&a[i][j]);
        }
        printf("\n");
        for(int i=0;i<=5;i++)
        {
            for(int j=0;j<=5;j++)
            {
                scanf("%d",&b[i][j]);
            }
            printf("\n");
        }
    }
    for(int k=0;k<5;k++)
    {
        sum=a[i][j]+b[i][j];
        printf("enter the sum ");
        scanf("%d",&sum);
    }
}