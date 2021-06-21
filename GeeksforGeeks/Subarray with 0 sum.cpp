#include <bits/stdc++.h>
#include<map>
using namespace std;

int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;
    cin>>n;
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
  map<int,bool> sumMap;
  int sum=0;
  int check=0;
  for(int i=0;i<n;i++){
    sum+=a[i];

    if(sum==0||sumMap[sum]==true)
    {
        check=1;
        cout<<"Yes"<<endl;break;
    }
    sumMap[sum]=true;
  }
  if(check==0){
    cout<<"No"<<endl;
  }
    }

}