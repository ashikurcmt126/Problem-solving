#include<stdio.h>
#include<iostream>
#include<string.h>
using namespace std;
int main(){
    string s;
    cin >> s;
    long n;
    cin >> n;
    long ashik=0;
    int i,k=s.size();
    long p=n/k;

      for(i=0;i<s.size();i++){
        if(s[i]=='a')
            ashik++;
      }

    ashik = ashik * p;

    for(i=0;i<(n%s.size());i++){
        if(s[i]=='a')
            ashik++;
    }
    cout << ashik << endl;
        return 0;
}