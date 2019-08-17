#include<iostream>
#include<iomanip>
using namespace std;
void modify(int x, int y, int z) {
    cout << setfill('$');
    cout << setw(sizeof(int)) << x;

    cout << setfill('#');
    cout << setw(sizeof(char)) << y;

    cout << setfill('@');
    cout << setw(sizeof(double)) << z << endl;

}
int main() {
    modify(9,4,18);
    return 0;
}

Pre Order:
+LR
10,5,1,7,40,50
Root -> 10

Post Order:
LR+
//1,7,5,50,40,10
50,40,7,1,5,10

