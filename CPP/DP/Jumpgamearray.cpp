/*
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

For example:
A = [2,3,1,1,4], return 1 ( true ).

A = [3,2,1,0,4], return 0 ( false ).

Return 0/1 for this problem
*/
#include<bits/stdc++.h>
using namespace std;
int canJump(vector<int> &A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    if(A.size() <= 1)
        return true;
    int max = A[0]; //max stands for the largest index that can be reached.
    for(int i=0; i<A.size(); i++){
        //if not enough to go to next
        if(max <= i && A[i] == 0) 
            return false;
        //update max    
        if(i + A[i] > max){
            max = i + A[i];
        } 
        //max is enough to reach the end
        if(max >= A.size()-1) 
            return true;
    } 
    return false;    
}
int main(){
    vector<int>A;
    A.push_back(2);
    A.push_back(3);
    A.push_back(1);
    A.push_back(1);
    A.push_back(4);
    cout<<canJump(A)<<endl;
    return 0;
}