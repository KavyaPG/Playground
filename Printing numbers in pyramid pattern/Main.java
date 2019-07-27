#include <stdio.h>
int main() {
	// Type your code here
  
    int n,k;
    scanf("%d",&n);
  int c=1;
 for(int rownum = 1; rownum <= n; ++rownum)
       {
          for(int space = 1; space <= (n- rownum ); ++space)
               {
    		     printf(" ");
		       }
  
   
          for(int colnum = 1; colnum <= rownum; ++ colnum)
               { 
                  
                  
                 printf("%d ", c);
                 c++;
               } 
          printf("\n");
   
	   	 }
  
  
   // int starcount = n;
    /*for(int rownum =1; rownum <= n; rownum = rownum + 1)
        {
    	   for(int space = 1; space <= rownum - 1; space = space + 1)
                {
        		  printf(" ");
        		}
           for(int colnum = 1; colnum <= starcount; colnum = colnum + 1)
                {
        		  printf(" ");
        		}
    		    printf("\n");
      		    starcount = starcount -1;
		 } */
	return 0;
}