#include<bits/stdc++.h>
using namespace std;
int main(){

    while(true){
        int N;
        cin>>N;
        if (N == -1) {
            break;
        }
        int sum = 0;
        int *A = new int[N];
        for(int i = 0 ; i < N ; i++){
            cin >> A[i];
            sum += A[i];
        }

        if (sum % N != 0) {
            cout << "-1" << endl;   
            continue;
        }

        int average = sum/N;
        int count = 0;
        for(int i = 0 ; i < N ; i++)
        {
            int k = A[i];               
            if (k > average) 
                count += k - average;
        }   
        cout << count << endl;
    }
    return 0;
}
/*
Example : 
5
1 1 1 1 6 -> 4
2
3 4 -> -1
-1 -> stop
*/