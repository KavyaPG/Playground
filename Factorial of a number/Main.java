#include <stdio.h>
int main() {
	//Type your code
  int n;
  int fact=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    
    fact=fact * i;
}    
  printf("%d",fact);
  
	return 0;
}