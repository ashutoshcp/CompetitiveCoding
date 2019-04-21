/*
Given a 2 * N Grid of numbers, choose numbers such that the sum of the numbers
is maximum and no two chosen numbers are adjacent horizontally, vertically or diagonally, and return it.

Example:

Grid:
	1 2 3 4
	2 3 4 5
so we will choose
3 and 5 so sum will be 3 + 5 = 8


Note that you can choose more than 2 numbers
*/
#include<bits/stdc++.h>
using namespace std;
int adjacent(vector<vector<int> > &V) {
    assert(V.size() == 2);
    int C = V[0].size();
    int MAXSUM[C][2];
    memset(MAXSUM, 0, sizeof(MAXSUM));
    int ele = max(V[0][0], V[1][0]);
    MAXSUM[0][1] = ele;
    for (int i = 1; i < C; i++) {
        int cur_element = max(V[0][i], V[1][i]);
        MAXSUM[i][0] = max(MAXSUM[i-1][0], MAXSUM[i-1][1]);
        MAXSUM[i][1] = cur_element + MAXSUM[i-1][0];
    }
    return max(MAXSUM[C-1][0], MAXSUM[C-1][1]);
}
int main(){
    vector<vector<int> > V;
    vector<int> x;
    x.push_back(1);
    x.push_back(2);
    x.push_back(3);
    x.push_back(4);
    V.push_back(x);
    x.clear();
    x.push_back(2);
    x.push_back(3);
    x.push_back(4);
    x.push_back(5);
    V.push_back(x);
    cout<<adjacent(V)<<endl;
    return 0;
}
