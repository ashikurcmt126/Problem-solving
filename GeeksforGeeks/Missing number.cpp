using namespace std;
int main()
{
    int n;
    cin>>n;
    for(int i=0;i<n;i++)
    {
        int d , d1,sum =0;
        cin>>d;
        for(int j=0;j<d-1;j++)
          {cin>>d1; sum = sum + d1;}
         int d2 = (d*(d+1) / 2);
         cout<<d2-sum<<endl;
        
    }
    return 0;
}