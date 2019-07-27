#include <stdio.h>
int g(int a,int b,int c);
int main(){
	// Type your code 
  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  int great;
  great = g(a,b,c);
  printf("%d",great);
  return 0;
}
int g(int a,int b,int c)
{
  int g1=0,g2=0;
  if( a > b)
    g1 = a;
  else 
    g1 =b;
  if(g1 > c)
    g2 = g1;
  else 
    g2 = c;
  return g2;
}