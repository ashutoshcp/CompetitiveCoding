#include<iostream>
using namespace std;

void print(int *A, int N) {
    for(int i=0; i<N; i++){
        cout<<*(A+i)<<" ";
    }
}


void ShellSort(int *A, int N){
    int i,j,key,h;
    
    for(h=1; h=N/9; h=3*h+1);

    for(;h>0; h/=3){
        cout<<"h = "<<h<<" : ";
        print(A, N);
        cout<<endl;
        for(i=h+1; i<N; i++){
            key=A[i];
            j=i;
            while(j>h && A[j-h]>key){
                A[j]=A[j-h];
                j-=h;
            }
            A[j]=key;
            cout<<"Intermediate : ";
            print(A, N);
            cout<<endl;
        }
    }
}
int main(){
    int N;
    cin>>N;
    int *A;
    A = new int[N];
    int i;
    for(i=0; i<N; i++)
        cin>>A[i];
    cout<<"Initial : ";
    print(A,N);
    cout<<endl;
    ShellSort(A,N);
    cout<<"Sorted : ";
    print(A,N);
    cout<<endl;
    return 0;
}