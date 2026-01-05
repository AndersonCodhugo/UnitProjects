#include <iostream>
#include <locale.h>

using namespace std;

int main() {
    setlocale(LC_ALL, "Portuguese");
    cout << "Olá mundo!\n";
    cout << "Meu nome é Anderson\n";
    cout << "Tudo bem com você?";
}