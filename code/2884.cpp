#include <iostream>
using namespace std;
int main() {
    int h, m;

    cin >> h >> m;

    if(m < 45) {
        if(h == 0) {
            h = 24;
        }
        h -= 1;
        m += 60 - 45;
    }else {
        m -= 45;
    }
    cout << h << " " << m << endl;

    return 0;
}