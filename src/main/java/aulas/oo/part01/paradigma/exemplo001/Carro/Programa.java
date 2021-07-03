package aulas.oo.part01.paradigma.exemplo001.Carro;

public class Programa {

    public static void main(String[] args){
        Carro fiesta = new Carro();

        System.out.println("Tem "+ fiesta.getPessoas() +" pessoas no carro");

        fiesta.entrarPessoa(3);

        System.out.println("Tem "+fiesta.getPessoas()+" pessoas no carro");

        fiesta.removerPessoa(2);

        System.out.println("Tem "+fiesta.getPessoas()+" pessoas no carro");


    }

}
