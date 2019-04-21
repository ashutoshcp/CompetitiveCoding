#include<iostream>
using namespace std;

void print(int *A, int N) {
    for(int i=0; i<N; i++){
        cout<<*(A+i)<<" ";
    }
}

void swapA(int *a, int *b){
    int t=*a;
    *a=*b;
    *b=t;
}
void Selectionsort(int *A, int N){
    int i,j,min,temp;
    for(i=0; i<N;i++){
        min = i;
        for(j=i+1; j<N; j++){
            if(A[j]<A[min])
                min=j;
        }
        //swap the elements
        swapA((A+i), (A+min));
        cout<<"After "<<i+1<<"th iteration : ";
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
    Selectionsort(A,N);
    cout<<"Sorted : ";
    print(A,N);
    cout<<endl;
    return 0;
}