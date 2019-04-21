#include<iostream>
using namespace std;
int LCSCall(int *A,int m, int *B, int n){
    int LCS[m+1][n+1];
    // for(int i=0;i<=m;i++){
    //     for(int j=0; j<=n; j++){
    //         if(i==0 || j==0){
    //             LCS[i][j]=0;
    //         } else if(A[i-1]==B[j-1]){
    //             LCS[i][j]=1+LCS[i-1][j-1];
    //         }else {
    //             LCS[i][j]=max(LCS[i-1][j],LCS[i][j-1]);
    //         } 
    //     }
    // }
    for(int i=m;i>=0;i--){
        for(int j=n; j>=0; j--){
            if(i==m || j==n){
                LCS[i][j]=0;
            } else {
                LCS[i][j]=LCS[i+1][j+1];
                if(A[i]==B[j])
                    LCS[i][j]++;
                LCS[i][j]=max(LCS[i][j], max(LCS[i][j+1], LCS[i+1][j]));
            }
        }
    }
    cout<<"DP\n";
    for(int i=0;i<=m;i++){
        for(int j=0;j<=n;j++){
            cout<<LCS[i][j]<<" ";
        }
        cout<<endl;
    }
    return LCS[0][0];
}
void inputandcall(){
    int m, n;
    cin>>m>>n;
    int *A, *B;
    A=new int[m];
    B=new int[n];
    for(int i=0; i<m; i++){
        cin>>A[i];
    }
    for(int i=0; i<n; i++){
        cin>>B[i];
    }
    int len=LCSCall(A, m, B, n);
    cout<<"Length of common sequence : "<<len<<endl;
}
int main(){
    inputandcall();
    return 0;
}