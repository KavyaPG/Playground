#include <stdio.h>
int main() {
	//Type your code
  int n;
  scanf("%d",&n);
  for(int i=1; i<=2*n; i++)
  {
    if(i%2 != 0)
      printf("%d\n",i);
  }
	return 0;
}