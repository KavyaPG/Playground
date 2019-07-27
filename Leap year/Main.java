#include<stdio.h>
int main()
{
  //Type your code here
  int year;
  scanf("%d",&year);
  if(year%4==0 && year%100!=0)
    printf("Leap year");
  else if(year%100==0 && year%400==0)
    printf("leap year");
  else
    printf("Not Leap year");
  return 0;
}