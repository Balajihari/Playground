#include <stdio.h>
#include <string.h>
 
int main()
{
  char Str[100];
  int Length;
 
 
  gets (Str);
 
  Length = strlen(Str);
 
  printf("%d\n", Length);
 
  return 0;
}