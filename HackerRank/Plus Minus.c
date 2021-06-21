#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
     int i,j,n;
    scanf("%d",&n);
    int p=0,ni=0,nul=0;
    for(i=0;i<n;i++)
    {
        scanf("%d",&j);
        if(j>0)
        {
            p++;
        }
        else if(j<0)
        {
            ni++;
        }
        else
        {
            nul++;
        }
    }
    float a;
    a=(float)p/(float)n;
    printf("%.6f\n",a);

     float b;
    b=(float)ni/(float)n;
    printf("%.6f\n",b);

     float c;
    c=(float)nul/(float)n;
    printf("%.6f\n",c);
    
    return 0;
}