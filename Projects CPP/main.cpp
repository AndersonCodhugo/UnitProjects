#include <iostream>
#include <locale.h>

using namespace std;


//comentários são iguais ao java
int HealthLevel { 0 };
bool isAlive { HealthLevel > 0 };
string Name { "Vecna" };
int Level { 14 };

//testando condicionais e novas formas de definição de variaveis
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
//espaço para loopings
}