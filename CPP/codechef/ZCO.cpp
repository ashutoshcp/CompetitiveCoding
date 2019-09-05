#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
int main(){
    long long n, i, a, ans = -1;
    cin>>n;
    vector<int> arr;
    for(i=0; i<n; i++){
        cin>>a;
        arr.push_back(a);
    }
    sort(arr.begin(), arr.end());
    for(i=0; i<n; i++){
        ans = max(arr[i]*(n-i), ans);
    }
    cout<<ans<<endl;
    return 0;
}