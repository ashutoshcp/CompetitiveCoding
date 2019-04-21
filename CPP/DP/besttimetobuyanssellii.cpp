#include<bits/stdc++.h>
using namespace std;
int maxProfit(const vector<int> &A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    if(A.size()<=1)
        return 0;
    int gain=0;
    for(int i=0; i<A.size()-1; i++){
        if(A[i+1]-A[i]>0)
            gain+=(A[i+1]-A[i]);
    }
    return gain;
}
int main(){
    vector<int> A;
    A.push_back(1);
    A.push_back(2);
    A.push_back(3);
    cout<<maxProfit(A)<<endl;
    return 0;
}
