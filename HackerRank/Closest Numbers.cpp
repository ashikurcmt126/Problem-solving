#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
  int n;
    
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    sort(a,a+n);
    int max=100000000;
    //int id=0;
    for(int i=1;i<n;i++){
        if(abs(a[i]-a[i-1]<max)){
            max=abs(a[i]-a[i-1]);
            //id=id-1;
        }
    }



    /*for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(i==j){
                continue;
            }
            if(max==abs(a[i]-a[j])){
                b[k]=a[i];
                k++;
                b[k]=a[j];
                k++;
            }
        }
    }*/
     for(int i=0;i<n-1;i++)
        {
            if(max==abs(a[i]-a[i+1])){
                
                    printf("%d %d ",a[i],a[i+1]);
                
            }

        }
      
    return 0;
}