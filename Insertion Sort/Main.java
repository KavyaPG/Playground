#include<stdio.h>
int main()
{
  //Type your code here
  int n;
  scanf("%d",&n);
  int A[n],i;
  for(i=0;i<n;i++)
    scanf("%d",&A[i]);
 for( int i = 0 ;i < n ; i++ ) {
    /*storing current element whose left side is checked for its 
             correct position .*/

      int temp = A[ i ];    
      int j = i;

       /* check whether the adjacent element in left side is greater or
            less than the current element. */

          while(  j > 0  && temp < A[ j -1]) {

           // moving the left side element to one position forward.
                A[ j ] = A[ j-1];   
                j= j - 1;

           }
         // moving current element to its  correct position.
           A[ j ] = temp;       
     }  

  for(int k=0;k<n;k++)
    printf("%d\n",A[k]);
  return 0;
}