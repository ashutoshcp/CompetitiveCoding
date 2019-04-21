#include <bits/stdc++.h>
using namespace std;
/*
Starting from point (0,0) on a plane, we have written all non-negative integers 
0, 1, 2,... as shown in the figure. For example, 1, 2, and 3 has been written at 
points (1,1), (2,0), and (3, 1) respectively and this pattern has continued.

You are to write a program that reads the coordinates of a point (x, y), 
and writes the number (if any) that has been written at that point. 
(x, y) coordinates in the input are in the range 0...10000.
*/

int main(){
    int t;
    cin>>t;
    while(t--){
        int x, y;
        cin>>x>>y;
        int result;
        if(x%2==0 && x==y){
            cout<<2*x<<endl;
        }
        else if(x%2!=0 && x==y){
            cout<<2*x-1<<endl;
        }
        else if(x%2==0 && y+2==x){
            cout<<x+y<<endl;
        }
        else if(x%2!=0 && y+2==x){
            cout<<x+y-1<<endl;
        }
        else{
            cout<<"No Number\n";
        }
    }
    return 0;
}

/*
Example

Input:
3
4 2
6 6
3 4

Output:
6
12
No Number
*/