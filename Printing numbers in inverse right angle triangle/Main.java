#include <stdio.h>
int main() {
    // Type your code here
    int n;
    scanf("%d",&n);
	int num = n;
	for(int row_no = 1 ; row_no <= n ; row_no++)
       {
		  for(int col_no = num ; col_no >= 1; col_no--)
            {
			  printf("%d",col_no);
			}
		  printf("\n");
	      num = num - 1;
		}
	return 0;
}