#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int a,b,c;cin>>a>>b>>c;
        string s1,s2,s3;
    cin>>s1>>s2>>s3;
    int dp[s1.length()+1][s2.length()+1][s3.length()+1];
    memset(dp,0,sizeof(dp));

    for(int i=0;i<=s1.length();i++){
        for(int j=0;j<=s2.length();j++){
            for(int k=0;k<=s3.length();k++){
                if(k==0||i==0||j==0)dp[i][j][k]=0;

                else if(s1[i-1]==s2[j-1]&&s1[i-1]==s3[k-1]){
                    dp[i][j][k]=dp[i-1][j-1][k-1]+1;
                }
                else{
                    dp[i][j][k]=max(max(dp[i-1][j][k],dp[i][j-1][k]),dp[i][j][k-1]);
                }
            }
        }
    }

    cout<<dp[s1.length()][s2.length()][s3.length()]<<endl;
    }

    return 0;
}