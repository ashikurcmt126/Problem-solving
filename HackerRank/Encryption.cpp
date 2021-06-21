#include<stdio.h>
#include<iostream>
#include<string>
#include<math.h>
using namespace std;
int main()
{
    string str;
    cin>>str;
    int k=str.size();
    int r=round(sqrt(k));
    int c;
    if(r>=sqrt(k))c=r;
    else 
        c=r+1;

 for(int i=0;i<c;i++){
        for(int j=i;j<k;j=j+c){
            cout<<str[j];
        }
        cout<<" ";
    }

    return 0;

}