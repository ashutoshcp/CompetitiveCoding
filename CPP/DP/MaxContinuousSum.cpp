// code when atleast one non-negative exists
#include<iostream>
using namespace std;
int MaxContinuousSum(int *A, int m){
    int *M, maxsum=0;
    M = new int[m];
    if(A[0]>0)
        M[0]=A[0];
    else
        M[0]=0;
    for(int i=1;i<m;i++){
        if(M[i-1]+A[i]>0)
            M[i]=M[i-1]+A[i];
        else    
            M[i]=0;
    }    

    for(int i=0;i<m;i++)
        maxsum=max(maxsum, M[i]);
    delete []M;
    return maxsum;
}
int MaxContinuousSumBest(int *A, int m){
    int maxsofar=0, maxendinghere=0;
    for(int i=0;i<m;i++){
        maxendinghere+=A[i];
        if(maxendinghere<0){
            maxendinghere=0;
            continue;
        }
        maxsofar=max(maxsofar, maxendinghere);
    }
    return maxsofar;
}
void inputandcall(){
    int m;
    cin>>m;
    int *A;
    A=new int[m];
    for(int i=0; i<m; i++){
        cin>>A[i];
    }
    int sum=MaxContinuousSum(A, m);
    cout<<"Maximum Continuous Sum : "<<sum<<endl;
    sum=MaxContinuousSumBest(A,m);
    cout<<"Maximum Continuous Sum Best : "<<sum<<endl;
}
int main(){
    inputandcall();
    return 0;
}