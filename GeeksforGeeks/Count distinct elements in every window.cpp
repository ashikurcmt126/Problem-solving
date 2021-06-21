/*You are required to complete below method */
void countDistinct(int a[],int k,int n)
{
    map<int,int> m;
    int c=0;
    for(int i=0;i<n;i++){
            c++;
        m[a[i]]++;
        if(k==c){
                if(i-k>=0){
                    m[a[i-k]]--;
                    if(m[a[i-k]]==0){
                        m.erase(a[i-k]);
                    }
                }
            cout<<m.size()<<" ";
            c--;
        }
    }
    }