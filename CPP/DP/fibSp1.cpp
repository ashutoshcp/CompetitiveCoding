#include<iostream>
using namespace std;
int fib(int n){
    int a=0, b=1, sum, i;
    for(i=0;i<n;i++){
        sum=a+b;
        a=b;
        b=sum;
    }
    return sum;
}
int main(){
    int t,n;
    cin>>t;
    while(t--){
        cin>>n;
        cout<<"Fib : "<<fib(n)<<endl;
    }    
    return 0;
}