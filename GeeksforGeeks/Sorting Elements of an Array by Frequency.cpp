using namespace std;
vector<int> v(130);
bool compare(int a,int b)
{
    if(v[a]>v[b]){
        return true;
    }
    if((v[a]==v[b])&&(a<b))return true;
    return false;
}
int main()
{
   int t,j;cin>>t;
   while(t--){
     int n;cin>>n;
    for(int i=0;i<130;i++){
        v[i]=0;
    }
    vector<int> ashik;
    for(int i=0;i<n;i++){
        cin>>j;
        v[j]++;
        ashik.push_back(j);
    }
    sort(ashik.begin(),ashik.end(),compare);

    for(int i=0;i<n;i++){
      cout<<ashik[i]<<" ";
    }
    cout<<endl;
   }
   return 0;
}