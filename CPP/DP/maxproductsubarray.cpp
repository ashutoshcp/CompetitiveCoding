/*
Find the contiguous subarray within an array (containing at least one number) which has the largest product.
Return an integer corresponding to the maximum product possible.

Example :

Input : [2, 3, -2, 4]
Return : 6 

Possible with [2, 3]
*/
/*
curmax : 6 curmin : 3
curmax : -2 curmin : -12
curmax : 4 curmin : -48
Max Product : 6
*/
#include<bits/stdc++.h>
#define pb push_back
using namespace std;
int maxProduct(const vector<int> &A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    assert(!A.empty());
    int curmax=A[0], curmin=A[0], result = A[0];
    for(int i=1; i<A.size(); i++){
        int mx = curmax;
        int mn = curmin;
        curmax = max(A[i], max(mx*A[i], mn*A[i]));
        curmin = min(A[i], min(mn*A[i], mx*A[i]));
        result = max(curmax, result);
        // cout<<"curmax : "<<curmax<<" curmin : "<<curmin<<endl;
    }
    return result;
}
int main(){
    vector<int> A;
    A.pb(2);
    A.pb(3);
    A.pb(-2);
    A.pb(4);
    cout<<"Max Product : "<<maxProduct(A)<<endl;
    return 0;
}