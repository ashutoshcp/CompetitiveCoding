#include<bits/stdc++.h>
using namespace std;
int minDistance(string A, string B) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int m=A.length(), n=B.length();
    int dp[m+1][n+1];
    for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            if(i==0){
                dp[i][j]=j;
            }                
            else if(j==0){
                dp[i][j]=i;
            }
            else if(A.at(i-1)==B.at(j-1)){
                dp[i][j]=dp[i-1][j-1];
                // cout<<A.at(i)<<" "<<B.at(j)<<endl;
            }                
            else{
                dp[i][j] = 1 + min(dp[i][j-1], min(dp[i-1][j], dp[i-1][j-1]));
                //                  insert          delete      replace
            }
        }
    }
    // for(int i=0;i<=m;i++){
    //     for(int j=0;j<=n;j++){
    //         cout<<dp[i][j]<<" ";
    //     }
    //     cout<<endl;
    // }
    return dp[m][n];
}
int main(){
    // string a,b;
    // cin>>a;cin>>b;
    cout<<minDistance("a", "b")<<endl;    
    return 0;
}
