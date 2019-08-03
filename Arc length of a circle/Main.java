#include<stdio.h>                                                                
                                                                                
void main()
{
    float radius, central_angle;
    float length=0;
  
    scanf("%f",&radius);
  
    scanf("%f",&central_angle);

    length = (2*3.14*radius*central_angle)/360;

    printf("%.2f", length);
}        