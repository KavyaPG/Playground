#include <stdio.h>
int main() {
  int m=3,n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  { 
    printf("%d",i);
    if((i % 3) == 0 && i != n)
      printf(",");
  }
    
	//Type your code
	return 0;
}