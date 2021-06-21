#include<bits/stdc++.h>
using namespace std;
int main(){
		int t;cin>>t;
		while(t--){
			int n;cin>>n;
			//int a[]=new int[n];

			int sum1=0,sum2=0;
			for(int i=0;i<n;i++){
				int k;cin>>k;
				if(i<n/2){
					sum1=sum1+k;
				}else{
					sum2=sum2+k;
				}
			}
			cout<<abs(sum1-sum2)<<endl;
		}
	}
