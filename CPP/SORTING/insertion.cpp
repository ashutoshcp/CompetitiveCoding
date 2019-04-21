#include<iostream>
using namespace std;

void print(int *A, int N) {
    for(int i=0; i<N; i++){
        cout<<*(A+i)<<" ";
    }
}

void InsertionSort(int *A, int N){
    int i,j,key;
    for(i=2; i<N; i++){
        key=A[i];
        j=i;
        while(A[j-1]>key && j>=1){
            A[j]=A[j-1];
            j--;
        }
        A[j]=key;
        cout<<"Intermediate : ";
        print(A, N);
        cout<<endl;
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
    InsertionSort(A,N);
    cout<<"Sorted : ";
    print(A,N);
    cout<<endl;
    return 0;
}