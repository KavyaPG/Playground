#include<stdio.h>
int main() {
   // Type your code here
  int n;
  scanf("%d",&n);
  int square(int n)
  {
    int sq=n*n;
    return sq;
  }
  printf("%d",square(n));
   return 0;
}