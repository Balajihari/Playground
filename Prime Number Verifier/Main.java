#include <stdio.h>
int main()
{
   int i, num, p = 0;
   
   scanf("%d", &num);
 if(num==0)
   printf("neither");
  else
  {
   for(i=1; i<=num; i++)
   {
    
      if(num%i==0)
      {
         p++;
      }
   }
   if(p==2)
   {
      printf("prime");
   }
   else
   {
      printf("composite");
   }}return 0;
}
