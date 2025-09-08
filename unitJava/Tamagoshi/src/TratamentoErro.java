import java.util.ArrayList;

public class TratamentoErro {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(5);
        numeros.add(7);

        System.out.println(numeros);

        try {
            System.out.println(numeros.get(5));
        }
        catch (IndexOutOfBoundsException erro) {
            System.out.println("Não existe número nesse index.");
            System.out.println(erro.getMessage());
            System.out.println(erro.getCause());
            System.out.println(erro.toString());
        }
    }
}
