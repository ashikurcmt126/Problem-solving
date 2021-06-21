using namespace std;
int main()
 {
     ios_base::sync_with_stdio(false);
     //cin.tie(NULL);
        int t;
        cin>>t;
        while(t--){
            int n;
            cin>>n;
            vector<int>v(n);
            for(int i=0;i<n;i++)
                cin>>v[i];
            for(int i=0;i<3;i++){
                for(int j=0;j<n-i-1;j++){
                    if(v[j]>v[j+1])
                        swap(v[j],v[j+1]);
                }
            }
            cout<<(v[n-3]+v[n-1]+v[n-2])<<endl;
        }
	return 0;
}