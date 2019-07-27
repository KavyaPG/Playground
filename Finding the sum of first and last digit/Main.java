#include <stdio.h>
 
void main()
{
    int num,temp;
 
    
    scanf("%d", &num);
    temp=num;
    while (num > 10)
    {

        num /= 10;
    }
  int ldigit = temp % 10;
  int sum = num+ldigit;
  printf("%d",sum);
    
}