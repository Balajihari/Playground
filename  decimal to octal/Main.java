#include<stdio.h>
int main()
{
  int n,i=0,j,arr[128];
  scanf("%d",&n);
  while(n!=0)
  {
    arr[i]=n%8;
    n=n/8;
   i++;
  }
  for(j=i-1;j>=0;j--)
  {
    printf("%d",arr[j]);
   
  }
  return 0;
}