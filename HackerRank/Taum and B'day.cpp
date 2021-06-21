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
   int n;
    cin>>n;
    for(int i=0;i<n;i++){
        long int w,b,x,y,z;
        cin>>b>>w>>x>>y>>z;

        x=(x>y)?((x-y>z)?(y+z):x):x;
        y=(x<y)?((y-x>z)?(x+z):y):y;

        cout<<b*x+w*y<<endl;
    }
    return 0;
}