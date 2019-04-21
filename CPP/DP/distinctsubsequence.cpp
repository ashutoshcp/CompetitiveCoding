/*
Given two sequences S, T, count number of unique ways in sequence S, to form a subsequence that is identical to the sequence T.

 Subsequence : A subsequence of a string is a new string which is formed from the original string by deleting some (can be none ) of the characters without disturbing the relative positions of the remaining characters. (ie, "ACE" is a subsequence of "ABCDE" while "AEC" is not). 
Example :
 S = "rabbbit" T = "rabbit" 

Return 3. And the formations as follows:

S1= "ra_bbit" 
S2= "rab_bit" 
S3="rabb_it"
"_" marks the removed character.
*/
#include<bits/stdc++.h>
using namespace std;
int numDistinct(string S, string T) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int m=S.size();
    int n=T.size();
    int x=max(m, n);
    int dp[x+1];
    memset(dp, 0, sizeof(dp));
    dp[0]=1;
    for(int i=1; i<=m;i++)
    for(int j=n;j>=1;j--){
        if(S.at(i-1)==T.at(j-1))
            dp[j]+=dp[j-1];
    }
    return dp[n];
}
int main(){
    cout<<numDistinct("rabbbit", "rabbit")<<endl;    
    return 0;
}
