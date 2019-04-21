#include <iostream>
using namespace std;
void print(int *A, int N) {
    for(int i=0; i<N; i++){
        cout<<*(A+i)<<" ";
    }
}
void bubblesort(int *A, int N){
    bool swapt = false;
    int pass = 0, j;
    for(pass=0; pass<N-1; pass++) {
        swapt = false;
        for(j=0; j<N-pass-1; j++) {
            if(A[j]>A[j+1]){
                int t = A[j];
                A[j] = A[j+1];
                A[j+1] = t;
                swapt = true;
                cout<<"\tIntermediate swapped : ";
                print(A,N);
                cout<<endl;
            }
        }
        if(swapt != true ) {
            break;
        }
        cout<<"Intermediate : ";
        print(A,N);
        cout<<endl;
    }
    cout<<"\n******  "<<pass+1<<" ********\n";
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
    bubblesort(A,N);
    cout<<"Sorted : ";
    print(A,N);
    cout<<endl;
    return 0;
}