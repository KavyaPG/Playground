#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int last2=n%100;
  int secondlast=last2/10;
  printf("%d",secondlast);
  
  return 0;
}