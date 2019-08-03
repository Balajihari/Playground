#include<stdio.h>
int main()
{
  int n,c,s;
  scanf("%d\n",&n);
  int arr[n];
  for(c=0;c<n;c++)
  {
    scanf("%d",&arr[c]);
  }
  scanf("\n%d",&s);
  for(c=0;c<n;c++)
  {
    if(arr[c]==s)
    {
      printf("%d",c+1);
     return 0;
    }
  }
  printf("%d isn't present in the array.",s);
    
  return 0;
}