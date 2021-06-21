#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main(){
    int n, m, cnt = 0, ashik = 0, rashid = 0;
    cin>>n>>m;
    string s[n];
    for( int i = 0; i < n; i++ )    cin>>s[i];

    for( int i = 0; i < n; i++ )
        for( int j = i + 1; j < n; j++ ){
            ashik = 0;

            for( int k = 0; k < m; k++ )
                if(  s[i][k] == '1' || s[j][k] == '1' )
                    ashik++;

          if( ashik == rashid ){
                cnt++;
            }

            if( ashik > rashid ){
                rashid = ashik;
                cnt = 1;
            }



        }

    cout<<rashid<<endl<<cnt<<endl;
    return 0;
}