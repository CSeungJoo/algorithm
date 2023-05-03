#include <iostream>
using namespace std;
int main() {
    int a, b, c;
    int d;

    cin >> a >> b >> c;

    if((a == b) && (b == c)) {
        d = 10000 + a * 1000;
    }else if((a == b) || (b == c)){
        d = 1000 + b * 100;
    }else if(a == c){
        d = 1000 + a * 100;
    }else {
        d = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        d *= 100;
    }
    cout << d << endl;

    return 0;
}