#include <iostream>
using namespace std;

int main() {
    int grade[9][9] = {0};

    grade[0][0] = 5;
    grade[4][4] = 8;
    grade[8][8] = 9;

    cout << "--- MEU SUDOKU ---" << endl;

    for(int i = 0; i < 9; i++) {
        for(int j = 0; j < 9; j++) {
            cout << grade[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}