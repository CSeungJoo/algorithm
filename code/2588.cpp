#include <iostream>
using namespace std;
int main() {
    int a, b;

    cin >> a >> b;

    int value1 = a * (b % 10);
    int value2 = a * ((b/10) % 10);
    int value3 = a * ((b/100) % 10); 

    cout << value1 << "\n" << value2 << "\n" << value3 << "\n" << a * b << endl;

    return 0;
}