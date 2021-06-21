#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int x;cin>>x;

    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    int start=0,end=0,min=n+1;
    int sum=0;
    while(end<n){

        while(sum<=x&&end<n){
            sum+=a[end++];
        }

        while(sum>x&&start<end){
            if(min>(end-start)){
                min=end-start;
            }

            sum-=a[start++];
        }
    }
    cout<<min<<endl;
    }
}