#include <iostream>
using namespace std;
int N;
int main(){

    cin >> N;

    for(int i = 0; i < N/4; i++){
        cout << "long ";
        if(i == N/4 - 1) {
            cout << "int" << endl;
        }
    }
}