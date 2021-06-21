#include <iomanip>
using namespace std;

int main() {
	//code
	int t,b;
	float a;
	cin>>t;
	while(t--)
	{
	    cin>>a>>b;
	    cout<<std::setprecision(b)<<a<<std::endl;
	}
	return 0;
}