#include <stdio.h>
int main() {
	//Type your code
	
  int n,rem;
  scanf("%d",&n);
  int temp = n;
  int d1,d2,d3,sum=0,cube=0;
  
   while (n != 0)
    {
        rem = n % 10;
        cube = pow(rem, 3);
        sum = sum + cube;
        n = n / 10;
    }
  if(sum == temp)
    printf("Armstrong Number");
  else
    printf("Not an Armstrong Number");
    return 0;
  
}