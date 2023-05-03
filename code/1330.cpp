#include <iostream>
using namespace std;
int main() {
    int a, b;

    cin >> a >> b;
    string c = (a < b) ? "<" : (a > b) ? ">": "==";
    cout << c << endl;
}