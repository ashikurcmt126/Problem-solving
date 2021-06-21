#include<bits/stdc++.h>
using namespace std;
bool iP(int n);
int main(){

		int tq;
		cin>>tq;
		while(tq--){
			int n;
			cin>>n;
			int sum=0;
			int t=0,c=0;
			while(t==0){
				c=0;
				while(n!=0){
					sum=sum+n%10;
					n/=10;
				}
				n=sum;
				int k=n;
				while(n!=0){
					c++;
					n=n/10;
				}
				if(c>1){
					sum=0;
					t=0;n=k;
				}else{
					t=1;
				}

			}
			if(sum==1){
                cout<<0<<endl;
			}
			else{
                if(iP(sum)){
				cout<<1<<endl;
			}else
				cout<<0<<endl;
			}
		}

	}
	bool iP(int s){
		for(int i=2;i<=sqrt(s);i++){
			if(s%i==0)return false;
		}
		return true;
	}
