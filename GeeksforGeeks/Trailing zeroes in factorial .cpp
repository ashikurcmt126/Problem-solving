using namespace std;
int main()
{
    int t, n, sum;
    cin >> t;
    while (t--) {
        sum = 0;
        cin >> n;
        while (n!=0) {
            n = n / 5;
            sum = sum + n;
        }
        cout << sum << endl;
    }
    return 0;
}