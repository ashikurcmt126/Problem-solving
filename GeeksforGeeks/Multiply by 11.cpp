#include<bits/stdc++.h>
using namespace  std;
int main(){

		int t;
		cin>>t;
		while(t--){
			char c[1000001];
			scanf("%s",c);
			int j=0,d=0,n=0;
			//string s="";
			char ch[1000001];
			//int ashik=0;
			int k=strlen(c);
			for(int k=strlen(c)-1;k>=0;k--){
				n=c[k];
				n-=48;
				n=(n*11)+d;
				j=n%10;
				d=n/10;
				//s=s+(char)j;
				//System.out.println("S "+s);
				ch[k]=j+48;
			}
			ch[k]='\0';
			if(d!=0){
				cout<<d;
			}
			cout<<ch;
			cout<<endl;

		}
	}