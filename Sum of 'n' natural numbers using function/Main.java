#include<stdio.h>
int main() {
    // Type your code here
  int n;
  scanf("%d",&n);
  int son(int n)
  {
    int sum=0;
    for(int i;i<=n;i++)
    {
      sum=sum+i;
    }
    return sum;
  }
  printf("%d",son(n));
  	return 0;
}