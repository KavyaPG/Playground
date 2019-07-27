// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int i,j,arr_size,max;
  scanf("%d",&arr_size);
  int a[arr_size];
  for(i=0;i<arr_size;i++)
    scanf("%d",&a[i]);
max = a[0];
  int maxi =0;
  for(i=0;i<arr_size;i++)
  {
    for(j=1;j<arr_size;j++)
    {
     if(a[i] <a[j])
     {
       max = a[j];
      maxi = j;
    }
  }
  }
  printf("%d",maxi);
   return 0;
}