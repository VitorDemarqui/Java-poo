package aulas.oo.part03.heranca.exemplo001;

public class Carro extends Veiculo {

    //o que tem de mais especifico que só o carro tem e herda os valores que veiculo que é marca e modelo

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }
}
