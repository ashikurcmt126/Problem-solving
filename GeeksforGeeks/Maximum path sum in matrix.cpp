#include<bits/stdc++.h>
using namespace std;

void inputarr(int arr[][20],int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin>>arr[i][j];
        }
    }
}

int minpath(int arr[][20],int n){
    int dp[20][20]={};
    for(int i=0;i<n;i++){
        dp[0][i]=arr[0][i];
    }

    for(int i=1;i<n;i++){
        for(int j=0;j<n;j++){
            if(j-1>=0&&j+1<n){
            dp[i][j]=arr[i][j]+max(dp[i-1][j],max(dp[i-1][j+1],dp[i-1][j-1]));
            }else if(j+1<n){
            dp[i][j]=arr[i][j]+max(dp[i-1][j],dp[i-1][j+1]);
            }else if(j-1>=0){
             dp[i][j]=arr[i][j]+max(dp[i-1][j],dp[i-1][j-1]);
            }

            }
    }
    int best=0;
    for(int j=0;j<n;j++){
        if(best<dp[n-1][j]){
            best=dp[n-1][j];
        }

    }
    // for(int i=0;i<n;i++){
    //     for(int j=0;j<n;j++){
    //         cout<<dp[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }
    return best;
}

int main() {
	//code
	int t;
	cin>>t;
	for(int j=0;j<t;j++){
	    int n,arr[20][20];
	    cin>>n;
	    inputarr(arr,n);
	    cout<<minpath(arr,n)<<endl;
	}
	return 0;
}