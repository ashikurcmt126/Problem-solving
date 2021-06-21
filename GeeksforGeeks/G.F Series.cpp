using namespace std;

int main() {
	long int n;
    cin>>n;
    while(n--){
       long int a;
       cin>>a;
       long int arr[a];
       arr[0]=0;
       arr[1]=1;
			for(int j=2;j<a;j++){
				arr[j]=arr[j-2]*arr[j-2]-arr[j-1];
			}

    for(int i=0;i<a;i++){
        cout<<arr[i]<<" ";
    }
    cout<<endl;
    }
    return 0;
}