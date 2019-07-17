#include<iostream>
#include<algorithm>
using namespace std;
int max(int a, int b) {
    if(a > b) {
        return a;
    }
    return b;
}
void printHist(int arr[], int n) {
    int maxVal = arr[0];
    for(int i=0; i<n; i++) {
        maxVal = max(arr[i], maxVal);
    }
    for(int i=maxVal; i>=0; i--) {
        cout.width(2);
        cout<<right<<i<<" | ";
        for(int j=0; j<n; j++) {
            if(arr[j] >= i) {
                cout<<" x ";
            } else {
                cout<<"   ";
            }
        }
        cout<<"\n";
    }
    for(int i=0; i<n+3; i++) {
        cout<<"---";
    }
    cout<<"\n";
    cout<<"     ";
    for(int i=0; i<n; i++) {
        cout.width(2);
        cout<<right<<arr[i]<<" ";
    }
    cout<<"\n";
}

int main() {
    int arr[10] = {15, 9, 12, 4, 5, 2, 8, 5, 3, 1};
    int n = sizeof(arr) / sizeof(arr[0]);
    printHist(arr, n);
    return 0; 
}