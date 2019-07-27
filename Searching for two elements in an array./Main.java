#include<stdio.h>
int main()
{
  //Type your code here
  int n,ele1=-1,ele2=-1;
  int a[10];
  scanf("%d",&n);
  for(int i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
 int x,y;
  scanf("%d %d",&x,&y);
  for(int j=0 ;j<n ;j++)
  {
    if(a[j] == x)
    {
     ele1 = j;
    }
    if(a[j] == y)
    {
      ele2 = j;
    }}
  printf("%d \n",ele1);
  printf("%d",ele2);
    
  return 0;
}