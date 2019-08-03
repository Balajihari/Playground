#include <stdio.h>
#include <math.h>

double hypotenuse(double x, double y) {
    double z = sqrt(x * x + y * y);
    return z;
}

int main(void) {
    double b1, b2, counter;
 
        
        scanf("%lf %lf", &b1, &b2);
        printf("%.2f\n", hypotenuse(b1, b2));
    
    return 0;
}