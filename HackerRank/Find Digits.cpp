#include <math.h>
#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>
#include <limits.h>
#include <stdbool.h>

int main(){
    int n,t;
    scanf("%d",&t);
    int i;
    int cou=0;
    for(i=0;i<t;i++){
            cou=0;
        scanf("%d",&n);
        int b=n;
       while(n>0){
        int reminder=n%10;

        n=n/10;
        if(reminder==0)
        {
            continue;
        }
        if(b%reminder==0){
           cou++;
        }

       }
       printf("%d\n",cou);
    }
    return 0;
}