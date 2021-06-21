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
    string ch;
   cin>>ch;
   int count=1;
   int i;
   for(i=0;ch[i]!='\0';i++){
    if(ch[i]>=65&&ch[i]<=90){
        count++;
    }
   }
   cout<<count;
    return 0;
}