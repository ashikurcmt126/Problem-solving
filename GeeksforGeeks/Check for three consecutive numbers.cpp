
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int t;cin>>t;
    while(t-->0){
        int n;cin>>n;
        int a[3];
        int c=0,sum=0,rashid=0;
        for(int i=1;i<=(n/2)-2;i++){
                int g=0,k=0,sum=0;
            for(int j=i;j<=i+2;j++){
                if(k<=3){

                    a[g]=j;
                    g++;

                        sum=sum+j;k++;


                    if(k==3&&sum==n){
                            //cout<<"Ashikur"<<endl;
                           // cout<<j<<endl;
                    //cout<<k<<" "<<sum<<endl;
                    rashid=1;
                      c=1;break;

                    }
                }

            }
            if(rashid==1){
                break;
            }
        }

        if(c==1){
            for(int i=0;i<3;i++){
                cout<<a[i]<<" ";
            }
            cout<<endl;
        }
        else{
            cout<<"-1"<<endl;
        }

    }
    return 0;
}