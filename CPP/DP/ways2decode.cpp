#include<bits/stdc++.h>
using namespace std;
bool isTwoDigitCode(char a, char b) {  
   return (a=='1' || (a=='2' && b<='6'));  
 }  
int numDecodings(string A) {
    // Do not write main() function.
    // Do not read input, instead use the arguments to the function.
    // Do not print the output, instead return values as specified
    // Still have a doubt. Checkout www.interviewbit.com/pages/sample_codes/ for more details
    int len = A.length();  
     
   int w1 = (len <= 0) ? 0 : 1, w2 = w1;  
   for (int i=1; i<=len; ++i) {  
     char c = A[i-1];
     int temp = w2; // w1 = count[i-2], temp = w2 = count[i-1]

     // update w2 to be count[i]
     if ( c == '0' )  w2 = 0;  
     if ( i-1 > 0 && isTwoDigitCode(A[i-2], c) ) {  
       w2 += w1;  
     }  
     if ( w2 == 0 ) return 0;  // invalid

     // set w1 = temp = count[i-1], i.e. A[(i+1)-2]
     w1 = temp;
   }  
   return w2;  
}

int main(){
    string A="12345675420";
    cout<<numDecodings(A)<<endl;    
    return 0;
}
