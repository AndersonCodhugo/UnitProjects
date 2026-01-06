#include <iostream>
#include <locale.h>

using namespace std;


//comentários são iguais ao java
bool isAlive { true };
string Name { "Vecna" };
int Level { 14 };

int main() {
    setlocale(LC_ALL, "Portuguese");
    cout << "Olá mundo!\n";
    cout << "Meu nome é " << Name;
    cout << "\n";
    cout << "Estou nível: " << Level;
    cout << "\n";

    if (isAlive == true)
    {
        cout << "Sim estou vivo.";
    }else if (isAlive == false)
    {
        cout << "Já estou morto.";
    }
    
}