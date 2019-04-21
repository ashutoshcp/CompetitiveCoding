#include<bits/stdc++.h>
using namespace std;
int main(){
  vector<int> A;
  int j;
  int n;
  cin>>n;
  for(j=0;j<n;j++){
    int x;
    cin>>x;
    A.push_back(x);
  }
      for(int i = 0; i<n; i++){
          if(A[i]>0 && A[i]<n){
                  int t = A[A[i]-1];
                  A[A[i]-1]=A[i];
                  A[i] = t;
				  i--;
          }
      }
      int i;
      for(i=0;i<n;i++)
          if(A[i]!=i+1){
            break;
          }

      cout<<i+1<<endl;
}
