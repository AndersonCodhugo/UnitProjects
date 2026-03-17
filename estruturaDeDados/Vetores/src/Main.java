import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //01
        //Crie um programa que leia um vetor de 10 números inteiros. Peça ao usuário um número para remover e elimine todas
        //as ocorrências desse número deslocando os elementos do vetor. Mostre o vetor final sem os valores removidos. Não é
         //permitido usar ArrayList nem criar um segundo vetor.

        System.out.println("Qual exercicio deseja executar? ");
        int ex = scanner.nextInt();

        if (ex == 1){
            int[] vetor = new int[10];

            System.out.println("Digite dez números para o vetor: ");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = scanner.nextInt();
            }

            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[j] + " ");
            }

            System.out.println(" ");
            System.out.println("Qual número deseja remover? ");

            int numeroParaRemover = scanner.nextInt();

            for (int k = 0; k < vetor.length; k++) {
                if (numeroParaRemover == vetor[k]) {
                    vetor[k] = 0;
                }
            }

            for (int j = 0; j < vetor.length; j++) {
                if (vetor[j] == 0) {
                    continue;
                }
                System.out.print(vetor[j] + " ");
            }
        }

        //02
        //Faça um programa que leia 8 números inteiros e verifique se o vetor é um palíndromo, ou seja, se permanece igual
        //quando lido da esquerda para a direita e da direita para a esquerda. Exiba uma mensagem informando o resultado.

        if (ex == 2) {
            int[] vetor = new int[8];

            System.out.println("Digite oito números para o vetor: ");
            for (int i = 0; i < vetor.length; i++) {
                vetor[i] = scanner.nextInt();
            }

            System.out.println("Vetor normal:");
            for (int j = 0; j < vetor.length; j++) {
                System.out.print(vetor[j] + " ");
            }

            int[] vetorContrario = new int[8];

            while (true) {
                int count = 0;
                for (int k = vetor.length - 1; k >= 0; k--) {
                    if (count < vetor.length) {
                        vetorContrario[count] = vetor[k];
                        count++;
                    } else {
                        break;
                    }

                }
                break;

            }
            System.out.println("\nVetor invertido:");
            for (int l = 0; l < vetorContrario.length; l++) {
                System.out.print(vetorContrario[l] + " ");
            }

            int comparador = 0;
            for (int m = 0; m < 8; m++) {
                if (vetor[m] == vetorContrario[m]) {
                    comparador++;
                }
            }

            if (comparador == 8) {
                System.out.println("\nSeu vetor é um palíndromo.");
            }
            else {
                System.out.println("\nSeu vetor não é um palíndromo.");
            }
        }

        //03
        //Desenvolva um programa que leia dois vetores A e B com 10 posições cada. Crie um terceiro vetor contendo apenas os
        //valores que aparecem nos dois vetores (interseção). O vetor resultado não pode conter valores repetidos.

        if (ex == 3) {
            int[] vetorUm = new int[10];
            int[] vetorDois = new int[10];
            int[] novoVetor = new int[10];

            System.out.println("Digite 10 números para o primeiro vetor: ");
            for (int i = 0; i < vetorUm.length; i++) {
                int numeros = scanner.nextInt();
                vetorUm[i] = numeros;
            }

            System.out.println("Digite outros 10 números para o segundo vetor: ");
            for (int j = 0; j < vetorUm.length; j++) {
                int numeros = scanner.nextInt();
                vetorDois[j] = numeros;
            }

            for (int count = 0; count < vetorUm.length; count++) {
                for(int i = 0; i < vetorUm.length; i++) {
                    if (vetorUm[count] == vetorDois[i]) {
                        novoVetor[count] = vetorDois[i];
                    }
                }
            }

            System.out.println(Arrays.toString(novoVetor));
        }

        //04
        //Implemente um algoritmo de ordenação manual (Bubble Sort, Selection Sort ou Insertion Sort) para ordenar um vetor
        //de 15 números em ordem decrescente. Mostre o vetor antes e depois da ordenação, além da quantidade de trocas
        //realizadas. Não é permitido usar Arrays.sort().

        if (ex == 4) {
            int[] vetor = {1, 2, 6, 1, 5, 5, 8, 10, 4, 3, 9, 8, 14, 13, 15};
            int trocas = 0;

            System.out.println("Vetor antes da ordenação: " + Arrays.toString(vetor));

            for (int i = 0; i < vetor.length - 1; i++) {
                for (int j = 0; j < vetor.length - 1 - i; j++) {
                    if (vetor[j] < vetor[j + 1]) {
                        int temp = vetor[j];
                        vetor[j] = vetor[j + 1];
                        vetor[j + 1] = temp;
                        trocas++;
                    }
                }
            }

            System.out.println("Vetor depois da ordenação: " + Arrays.toString(vetor));
            System.out.println("Quantidade de trocas: " + trocas);
        }
    }
}