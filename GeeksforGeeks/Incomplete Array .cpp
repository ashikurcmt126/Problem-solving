#include<bits/stdc++.h>
using namespace std;
int countNum(int arr[], int n)
{
    int count = 0;

    sort(arr, arr + n);

    for (int i = 0; i < n - 1; i++)
        if (arr[i] != arr[i+1] &&
            arr[i] != arr[i + 1] - 1)
            count += arr[i + 1] - arr[i] - 1;

    return count;
}
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
    int a[n];
    //int h=INT_MIN,l=INT_MAX;
    //set<int> s;
    for(int i=0;i<n;i++){
        cin>>a[i];
    }
    cout<<countNum(a,n)<<endl;
    }
return 0;
}