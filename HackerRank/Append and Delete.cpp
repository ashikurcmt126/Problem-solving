#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    string s,t;
    int k;

    cin >> s >> t >> k;

    int n = s.length();
    int m = t.length();

    int init = 0;
    while(s[init] == t[init] && init < n && init < m)
    {
        init++;
    }
    init--;

    int min_num = s.length()-1 - init + t.length()-1 - init;
    

    if(min_num > k)
    {
        cout << "No" << endl;
        return 0;
    }

    if(((k - min_num)%2) == 0)
    {
        cout << "Yes" << endl;
        return 0;
    }

    if(n+m <= k)
    {
        cout << "Yes" << endl;
        return 0;
    }else{
        cout<<"No"<<endl;
    }


    return 0;
}