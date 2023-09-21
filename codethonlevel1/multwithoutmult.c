#include <stdio.h>
int main()
{
    int num1,num2,mult;
    printf("enter the numbers:");
    scanf("%d%d",&num1,&num2);

    while(num2){
        mult+=num1;
        num2--;
    }
    printf("multiplication of two no. is %d",mult);
}