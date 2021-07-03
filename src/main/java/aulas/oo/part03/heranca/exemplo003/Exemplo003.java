package aulas.oo.part03.heranca.exemplo003;

public class Exemplo003 {

    public static void main(String[] args) {

        //instancia a classe veiculo para calculo veiculo
        Veiculo generico = new Veiculo();
        generico.setValorVenal(1000.0);
        System.out.println(generico.calculaImposto()); //10.0

        //instancia a classe carro para calculo
        Veiculo carro = new Carro();
        carro.setValorVenal(1000.0);
        System.out.println(carro.calculaImposto()); //70.0

        //instancia a classe moto para calculo
        Veiculo moto = new Motocicleta();
        moto.setValorVenal(1000.0);
        System.out.println(moto.calculaImposto()); //30.0

    }

}
