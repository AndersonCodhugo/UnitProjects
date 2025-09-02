public class maiTamagoshi {
    public static void main(String[] args) {
        tamagoshi meuTamagoshi = new tamagoshi("Anderson", 0.0, 100, 21);
        tamagoshi seuTamagoshi = new tamagoshi("Emanoel", 99.0, 15, 23);

        System.out.println(meuTamagoshi);
        System.out.println(seuTamagoshi);

        System.out.println("Tamagoshis com alterações");

        meuTamagoshi.setName("Andinho");
        seuTamagoshi.setName("Mugrilo");

        meuTamagoshi.setFome(34);
        seuTamagoshi.setFome(23);

        meuTamagoshi.setIdade(45);
        seuTamagoshi.setIdade(11);

        meuTamagoshi.setSaude(75);
        seuTamagoshi.setSaude(0);



        System.out.println("Nome: " + meuTamagoshi.getName());
        System.out.println("Idade: " + meuTamagoshi.getIdade());
        System.out.println("Saúde: " + meuTamagoshi.getSaude());
        System.out.println("Fome: " + meuTamagoshi.getFome());

        System.out.println("---------------");

        System.out.println("Nome: " + seuTamagoshi.getName());
        System.out.println("Idade: " + seuTamagoshi.getIdade());
        System.out.println("Saúde: " + seuTamagoshi.getSaude());
        System.out.println("Fome: " + seuTamagoshi.getFome());
    }
}
