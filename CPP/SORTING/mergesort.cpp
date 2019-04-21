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
void Merge(int *A,int left, int mid, int right){
    int *L,*R;
    L=new int[left];
    R=new int[right];
    int i,j;
    
}
void MergeSort(int *A, int left, int right){
    int mid;
    if(left<right){
        mid = left+right/2;
        MergeSort(A,left,mid);
        MergeSort(A,mid+1,right);
        Merge(A,left,mid+1,right);
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
    MergeSort(A, 0, N-1);
    cout<<"Sorted : ";
    print(A,N);
    cout<<endl;
    return 0;
}