/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

Example :
Given array A = [2,3,1,1,4]

The minimum number of jumps to reach the last index is 2. (Jump 1 step from index 0 to 1, then 3 steps to the last index.)

If it is not possible to reach the end index, return -1.
*/
#include<bits/stdc++.h>
using namespace std;
int jump(vector<int> &A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int steps = 0, mx=0, next=0;  
    for (int i=0; i<A.size()-1 && next<A.size()-1; ++i) {  
     mx = max(mx, i+A[i]);  
     if (i == next) {  // ready to jump  
       if (mx == next) return -1; // unreachable  
       next = mx;  
       ++steps;  
     }  
   }  
   return steps;  
}

int main(){
    vector<int> A;
    A.push_back(2);
    A.push_back(3);
    A.push_back(1);
    A.push_back(1);
    A.push_back(4);
    cout<<"Min jumps : "<<jump(A);
    return 0;
}