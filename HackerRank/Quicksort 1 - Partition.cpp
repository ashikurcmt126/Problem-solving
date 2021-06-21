#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <bitset>
#include <cstdio>
#include <vector>
#include <cstdlib>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
using namespace std;
void part(int a[],int p){

    int start=0,end=p-1;
    int pivot=a[start];

    while(start<end)
    {
        int temp=0;
        while(a[start]<pivot&&start<end){
            start++;
        }
        while(a[end]>pivot&&start<end){
            end--;
        }
        temp=a[end];
        a[end]=a[start];
        a[start]=temp;
    }

}
int main(void) {
   int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
part(a,n);

for(int i=0;i<n;i++){
    printf("%d ",a[i]);
}
return 0;

}