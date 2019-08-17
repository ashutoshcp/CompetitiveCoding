#include<stack>
#include<iostream>
#include<algorithm>
using namespace std;
int main() {
    /*stack<int> s;
    s.push(1);
    cout<<s.top()<<endl;*/
    stack<int> s;
    s.emplace();
    cout<<s.top()<<endl;
}