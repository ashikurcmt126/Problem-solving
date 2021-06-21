#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>
#include <assert.h>

int main() {

int n,i,j,key;

    scanf("%d",&n);
      int a[n];
    for( i=0;i<n;i++){
        scanf("%d",&a[i]);
    }

    for( i=1;i<n;i++){
         i,j,key;
        key=a[i];
        j=i-1;
        while(j>=0&&a[j]>key){
            a[j+1]=a[j];
            j--;
        }
        a[j+1]=key;

        
    }
    for( int b=0;b<n;b++){
            printf("%d ",a[b]);
        }
        printf("\n");
    return 0;
}