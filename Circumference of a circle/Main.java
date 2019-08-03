#include<stdio.h>

float PI = 3.14;

int main(){
   float radius, ci;

   scanf("%f", &radius);

   ci = 2 * PI * radius;
   
   printf("%.2f", ci);

   return (0);
}