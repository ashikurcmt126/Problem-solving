#include <map>
#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <unordered_map>

using namespace std;


int main(){
    char t[3];
    t[0]='S';
    t[1]='O';
    t[2]='S';
    int i;
   string s1;
   int coun=0;
   cin>>s1;
   for(i=1;s1[i]!='\0';i=i+3){
        if(s1[i-1]!='S'){
            coun++;
        }
        if(s1[i]!='O'){
            coun++;
        }
        if(s1[i+1]!='S'){
            coun++;
        }
   }
   cout<<coun<<endl;
    return 0;
}