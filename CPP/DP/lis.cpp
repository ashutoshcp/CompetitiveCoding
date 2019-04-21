#include<bits/stdc++.h>
using namespace std;
int lis(const vector<int> &A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int n=A.size();
    int *lis, i, j, max = 0;
    lis = new int[n];
    for (i = 0; i < n; i++ )
        lis[i] = 1;
 
    for (i = 1; i < n; i++ )
        for (j = 0; j < i; j++ )
            if ( A[i] > A[j] && lis[i] < lis[j] + 1)
                lis[i] = lis[j] + 1;
 
    for (i = 0; i < n; i++ )
        if (max < lis[i])
            max = lis[i];
 
    delete []lis;
 
    return max;
}
int main(){
    vector<int> A;
    A.push_back(0);
    A.push_back(8);
    A.push_back(4);
    A.push_back(12);
    A.push_back(2);
    A.push_back(10);
    A.push_back(6);
    A.push_back(14);
    A.push_back(1);
    A.push_back(9);
    A.push_back(5);
    A.push_back(13);
    A.push_back(3);
    A.push_back(11);
    A.push_back(7);
    A.push_back(15);
    cout<<lis(A)<<endl;    
    return 0;
}
