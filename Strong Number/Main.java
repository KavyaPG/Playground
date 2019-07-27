#include <stdio.h>
int main() {
	//Type your code
  int num;
  scanf("%d",&num);
  int rem;
  int sum=0;
  
  int temp=num;
	while(num) {
		int i=1,f=1;
		rem=num%10;
		//while(i<=rem) 
      for(i=1;i<=rem;i++){
			f=f*i;
			
		}
		sum=sum+f;
		num=num/10;
	}
  if(sum == temp)
    printf("Yes");
  else
    printf("No");
  
	return 0;
}