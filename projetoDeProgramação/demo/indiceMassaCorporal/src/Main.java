import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("---Calculo de IMC---");

        System.out.println("Digite seu sexo(M/F): "); //aqui se pede o sexo do usuario
        String sexo = reader.nextLine();

        System.out.println("Digite o seu peso em KG: "); //aqui se lê o peso
        float peso = Float.valueOf(reader.nextLine());

        System.out.println("Agora digite sua altura em cm: "); //a leitura da altura é aqui
        float altura = Float.valueOf(reader.nextLine());
        float alturaEmMetros = altura/100; //transformação da altura em centimetros para metros para o calculo preciso

        float indiceDeMassa = peso / (alturaEmMetros * alturaEmMetros); //calculo do IMC aqui mesmo

        System.out.println("Seu IMC é de:" + indiceDeMassa);

        if (sexo.equals("F")) { //verifica o sexo para um imc especifico
            if (indiceDeMassa <= 19.1) {
                System.out.println("Você está abaixo do peso.");
            } else if (indiceDeMassa > 19.1 && indiceDeMassa <= 25.8) {
                System.out.println("Você está no peso ideal.");
            } else if (indiceDeMassa > 25.9 && indiceDeMassa <= 27.3) {
                System.out.println("Você está um pouco acima do peso.");
            } else if (indiceDeMassa > 27.4 && indiceDeMassa <= 32.3) {
                System.out.println("Você está acima do peso.");
            } else {
                System.out.println("Você está obeso.");
            }
        }

        if (sexo.equals("M")) { //verifica o sexo para um imc especifico
            if (indiceDeMassa <= 20.7) {
                System.out.println("Você está abaixo do peso.");
            } else if (indiceDeMassa > 20.7 && indiceDeMassa <= 26.4) {
                System.out.println("Você está no peso ideal.");
            } else if (indiceDeMassa > 26.5 && indiceDeMassa <= 27.8) {
                System.out.println("Você está um pouco acima do peso.");
            } else if (indiceDeMassa > 27.9 && indiceDeMassa <= 31.1) {
                System.out.println("Você está acima do peso.");
            } else {
                System.out.println("Você está obeso.");
            }
        }

        //Codigo by Anderson Hugo
    }
}