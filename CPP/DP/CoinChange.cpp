/*
You are given a set of coins S. In how many ways can you make sum N assuming you have infinite amount of each coin in the set.

Note : Coins in set S will be unique. Expected space complexity of this problem is O(N).

Example :

Input : 
	S = [1, 2, 3] 
	N = 4

Return : 4

Explanation : The 4 possible ways are
{1, 1, 1, 1}
{1, 1, 2}
{2, 2}
{1, 3}	
Note that the answer can overflow. So, give us the answer % 1000007
*/
#include<bits/stdc++.h>
using namespace std;
#define mod 1000007
int coinchange2(vector<int> &A, int B) {
    int m=A.size();
    if(m==0 || B==0){
        return 0;
    }
    int *dp;
    dp = new int[B+1];
    for(int i=0;i<=B;i++)
        dp[i]=0;
    dp[0]=1;
    for(int i=0;i<m;i++)
        for(int j=A[i];j<=B;j++){
            dp[j]+=dp[j-A[i]];
            dp[j]=dp[j]%mod;
            if(dp[j]<0)
                dp[j]+=mod;
        }   
    for(int i=0;i<=B;i++)
        cout<<dp[i]<<" ";
    cout<<endl;        
    return dp[B];
}
int main(){
    vector<int> A;
    int B=0;
    A.push_back(1);
    A.push_back(2);
    A.push_back(3);
    cout<<coinchange2(A,B)<<endl;
    return 0;
}