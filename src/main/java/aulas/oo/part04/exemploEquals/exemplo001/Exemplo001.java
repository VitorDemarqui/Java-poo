package aulas.oo.part04.exemploEquals.exemplo001;

public class Exemplo001 {

    public static void main(String[] args) {

        Veiculo carro1 = new Carro("Palio", "Fiat", 20000.0);
        Veiculo carro2 = new Carro("Palio", "Fiat", 20000.0);

        //nao ta dizendo o que considera a mesma coisa
        System.out.println(carro1.equals(carro2)); //false
    }

}
