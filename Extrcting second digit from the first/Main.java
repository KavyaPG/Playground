#include <stdio.h>
 
void main()
{
    long num;
 
    
    scanf("%ld", &num);
    
    while (num > 100)
    {

        num /= 10;
    }
  num = num % 10;
  printf("%ld",num);
    
}