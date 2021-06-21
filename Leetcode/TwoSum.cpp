#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int> map1;
        vector<int> v1;
        for(int i=0;i<nums.size();i++){
            if(map1.find(target-nums[i])!=map1.end()){
               v1.push_back(map1[target-nums[i]]);
               v1.push_back(i);
               return v1;
            }else map1[nums[i]] = i;
        }
        return v1;
    }
    /*
    // Another way to solve... 
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> v1;
        for(int i=0;i<nums.size();i++){
            for(int j=i+1;j<nums.size();j++){
                if(nums[i]+nums[j]==target){
                    return {i,j};
                }
            }
        }
        return {};
    }
    */
};

int main()
{
    vector<int> v1;
    v1.push_back(2);
    v1.push_back(7);
    Solution obj;
    vector<int> v2 =obj.twoSum(v1,9);
    cout<<v2[0]<<" "<<v2[1]<<endl;
    
}
