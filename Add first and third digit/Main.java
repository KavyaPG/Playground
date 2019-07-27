#include<stdio.h>
int main()
{
  //Type your code here
  int f=0,l=0,num;
  scanf("%d",&num);
  int n=num;
  f=num/100;
  l=n%10;
  int s=f+l;
  printf("%d",s);
  
  return 0;
}