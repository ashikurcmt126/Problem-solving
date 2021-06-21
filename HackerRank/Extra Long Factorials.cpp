#include<stdio.h>
#include<iostream>
using namespace std;
int main()
{
    int n;
    cin>>n;
    int a[1000]={0},len=0,carry=0,mul=0;
    a[0]=1;
    for(int i=2;i<=n;i++){
        for(int j=0;j<=len;j++){
            mul=a[j]*i+carry;
            a[j]=mul%10;
            carry=mul/10;

            if(carry!=0&&j==len){
                len++;
            }
        }
    }
    
    for(int i=len;i>=0;i--){
        cout<<a[i];
    }
    return 0;
}