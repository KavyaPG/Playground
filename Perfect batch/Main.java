/* ***Test Instructions***
* There are multiple test cases to evaluate the program.
* Some test cases are visible and others are hidden.
* Your program should be generic so that it will satisfy all the test cases.
* Scan the input from stdin and print the exact output only which is as given in the sample test cases.
*/
#include<stdio.h>
void batch_sum(int a[],int arr_size);
int main()
{
  int arr_size,i;
  scanf("%d",&arr_size);
  int a[arr_size];
  for(i=0;i<arr_size;i++)
    scanf("%d",&a[i]);
 batch_sum(a,arr_size);
  return 0;
}
void batch_sum(int a[],int arr_size)
{
  int i,j,sum=0,count = 0,sum2 =0;
  for(i=0;i<=2;i++)
  {
    sum = sum + a[i];
  }
 for(i = 3;i<arr_size;i++)
  {
    sum2 = sum2 + a[i];
 }
    
   if(sum == sum2)
        printf("Perfect Batch");
  	else
      printf("Not a Perfect Batch");
}