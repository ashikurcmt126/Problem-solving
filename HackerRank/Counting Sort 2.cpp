#include<stdio.h>
#include <algorithm>
#include <iostream>
using namespace std;
int main() {
  int n;
  cin>>n;
  int array[n];
  for(int i=0;i<n;i++){
    scanf("%d",&array[i]);
  }
  size_t size = sizeof(array) / sizeof(array[0]);
  //cout<<size;
  sort(array, array + size);
  for (size_t i = 0; i < size; ++i) {
     cout << array[i] << ' ';
  }
  cout << endl;
}