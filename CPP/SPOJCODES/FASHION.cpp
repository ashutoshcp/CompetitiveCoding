#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin>>t;
    while(t--){
        int N;
        cin>>N;
        int *hotMen = new int[N];
        int *hotWomen = new int[N];
        for(int i=0; i<N; i++){
            cin>>hotMen[i];
        }
        for(int i=0; i<N; i++){
            cin>>hotWomen[i];
        }
        sort(hotMen, hotMen+N);
        sort(hotWomen, hotWomen+N);
        long answer = 0;
        for(int i=0; i<N; i++){
            answer += long(hotMen[i]*hotWomen[i]);
        }
        cout<<answer<<endl;
    }
    return 0;
}
/*
Example

Input:
2
2
1 1
3 2
3
2 3 2
1 3 2

Output:
5
15
*/