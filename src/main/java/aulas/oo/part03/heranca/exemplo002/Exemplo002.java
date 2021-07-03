package aulas.oo.part03.heranca.exemplo002;

public class Exemplo002 {

    public static void main(String[] args) {

        //neste caso usamos o metodo acelera no veiculo porque é interessante para a moto e o carro ter acesso a esta açaõ
        //entao os dois herdam o metodo acelerar

        Carro carro = new Carro();
        carro.acelera();

        Motocicleta moto = new Motocicleta();
        moto.acelera();

    }

}
