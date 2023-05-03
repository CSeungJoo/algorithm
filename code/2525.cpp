#include <iostream>
using namespace std;
int main() {
    int A, B, C;

    cin >> A >> B >> C;
    check:
    if(C >= 60) {
        C -= 60;
        A += 1;
        if(A >= 24) A -= 24;
        goto check;
    }
    B += C;
    if(B >= 60) {
        B -= 60;
        A += 1;
        if(A >= 24) A -= 24;
    }
    cout << A << " " << B << endl;
}