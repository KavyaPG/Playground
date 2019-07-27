#include <stdio.h>
int main() {
	// Type your code here
  
{
    //1
    int i,j,size;
    //2
    
    scanf("%d",&size);
    
    //3
    for(i=0; i < size ;i++)
    {
        //4
        for(j=0; j < size ;j++)
        {
            //5
            if(i==j || j==(size-i-1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        //6
        printf("\n");
    }
    return 0;
}
	return 0;
}