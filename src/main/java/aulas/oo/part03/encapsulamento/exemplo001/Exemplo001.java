package aulas.oo.part03.encapsulamento.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Pessoa eu = new Pessoa("Marco", 19, 05, 1990);


        //pilar do encapsulamento é colocar as informações e eu definir como irei acessar essa informação
        System.out.println(eu.getNome());
        System.out.println(eu.getDataNascimento());
        System.out.println(eu.calculaIdade());

        eu.setNome("Marco Paulo");

        System.out.println(eu.getNome());

    }
}
