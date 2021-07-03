package aulas.oo.part04.exemploSuper;

public class Carro extends Veiculo {

    public Carro(String modelo, String marca, double valorVenal) {
        //super faz referencia a classe estendida que é a veiculo
        //cuidado pois todas as classes extende a object se nao tiver estendendo dnenhuma classe vai setar o super
        super(modelo, marca, valorVenal);
    }

    public Carro(String modelo, String marca, double valorVenal, int quantidadeDePortas) {
        super(modelo, marca, valorVenal);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    private int quantidadeDePortas;

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    public void setQuantidadeDePortas(int quantidadeDePortas) {
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public double calculaImposto() {
        return this.getValorVenal() * 0.07;
    }
}
