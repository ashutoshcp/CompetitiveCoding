/*
Say you have an array for which the ith element is the price of a given stock on day i.

If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock), design an algorithm to find the maximum profit.

Example :

Input : [1 2]
Return :  1
*/
#include<bits/stdc++.h>
using namespace std;
int maxProfit(const vector<int> &A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    if(A.size()<=1){
        return 0;
    }
    int mn=A[0]; // minimum so far
    int result=0;
    for(int i=1; i<A.size(); i++){
        result = max(result, A[i]-mn);
        mn = min(mn, A[i]);
    }
    return result;
}
int main(){
    vector<int> A;
    A.push_back(1);
    A.push_back(2);
    cout<<maxProfit(A)<<endl;
    return 0;
}