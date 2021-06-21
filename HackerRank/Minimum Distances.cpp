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
        cin>>a[i];
    }
    int max=1000001,temp=0,check=0;
    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            if(a[i]==a[j]){
                temp=j-i;
                if(max>temp){
                        check=1;
                    max=temp;
                }
            }
        }
    }
    if(check==0){
        cout<<-1<<endl;
    }
    else{
        cout<<max<<endl;
    }
    return 0;
}