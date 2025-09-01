public class somaVetorRec {
    public static void main(String[] args) {
        int[] vetor = {1, 3, 5, 7, 11};
        int soma = 0;
        for (int i =0; i<vetor.length; i++){
            soma = soma + vetor[i];
        }
        System.out.println(soma);
    }
}
s