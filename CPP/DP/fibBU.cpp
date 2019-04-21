#include<iostream>
using namespace std;
int fib(int n){
    int fibo[n];
    if(n==0||n==1) {
        return 1;
    }
    fibo[0]=1;
    fibo[1]=1;
    for(int i=2;i<n;i++){
        fibo[i]=fibo[i-1]+fibo[i-2];
    } 
    return fibo[n-1];
}
int main(){
    int n;
    cin>>n;
    cout<<"Fib : "<<fib(n)<<endl;
    return 0;
}