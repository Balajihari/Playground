#include <stdio.h>
int main()
{
  int a,b,c;
  scanf("%d\n%d",&a,&b);
  if(b<0)
  {
    printf("Wrong input");
  }
    else
  { c=pow(a,b);
  printf("%d",c);
  }
           return 0;
}