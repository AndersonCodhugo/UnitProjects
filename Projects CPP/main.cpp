#include <iostream>
using namespace std;

bool isSafe(int grade[9][9], int line, int column, int num) {

    for (int x = 0; x < 9; x++) {

        if (grade[line][x] == num || grade[x][column] == num) {
            return false;
        }
    }

    int lineBegin = line - (line % 3);
    int columnBegin = column - (column % 3);

    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (grade[i + lineBegin][j + columnBegin] == num) {
                return false;
            }
        }
    }
    return false;
}

int main() {
    int grade[9][9] = {0};

    grade[0][0] = 5;
    grade[4][4] = 8;
    grade[8][8] = 9;

    cout << "--- MY SUDOKU ---" << endl;

    for(int i = 0; i < 9; i++) {
        for(int j = 0; j < 9; j++) {
            cout << grade[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}