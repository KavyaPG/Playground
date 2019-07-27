#include <stdio.h>
int main(){
	// Type your code here
  int n;
  scanf("%d",&n);
  for(int row=1;row <=n;row++)
  {
    for(int col=1;col<=n;col++)
   {
      printf("%d",row);
    }
    printf("\n");
  }
  	return 0;
}