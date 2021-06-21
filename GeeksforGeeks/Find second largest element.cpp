#include<bits/stdc++.h>
using namespace std;
int main(){
		int t;
		cin>>t;
		while(t--){
			int n;
			cin>>n;
			int a[n];
			int t=0;
			for(int i=0;i<n;i++){
				cin>>a[i];
			}
			sort(a,a+n);
			int k=a[n-1];
			for(int i=n-1;i>=0;i--){
				if(a[i]==k){

				}else{
				    t=1;
					cout<<a[i]<<endl;
					break;
				}
			}
			if(t==0){
                cout<<-1<<endl;
			}
		}
		return 0;
	}	
