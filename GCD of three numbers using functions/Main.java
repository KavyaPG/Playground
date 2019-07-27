#include <stdio.h>
int gcd(int a,int b,int c);
int main() {
	int p,q,r;
  scanf("%d %d %d",&p,&q,&r);
  int g = gcd(p,q,r);
  printf("%d",g);
  
	return 0;
}
int gcd(int a,int b,int c)
{int temp =0 ,temp2 =0 ;
 int gcd1,gcd2;
  for(int i = 1; i <= a && i <= b; i++)
    {
        if(a % i == 0 && b % i == 0)
            temp = i;
    if(temp < i)
       gcd1 =i;
    else
      gcd1=temp;
    }
  for(int i = 1; i <= gcd1 && i <= c; i++)
    {
        if(gcd1 % i == 0 && c % i == 0)
            temp2 = i;
    if(temp2 < i)
      gcd2 =i;
    else
      gcd2=temp;
    }
 return gcd2;
}