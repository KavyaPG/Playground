#include <stdio.h>
int main() 
{
    //write your logic here
  int n;
  scanf("%d",&n);
  int arr[n],i,j;
  for(i=0;i<n;i++)
  {
    scanf("%d",&arr[i]);
  }
 
   j = 0;
   for(i=0;i<n-1;i++)
   {
     if(arr[i] != arr[i+1])
     {
       arr[j] = arr[i];
       printf("%d ",arr[j]);
       j++;
     }
     
   }
   arr[j] = arr[n-1];
   printf("%d ",arr[j]);
 
	return 0;
}