package aulas.oo.part03.heranca.exemplo001;

public class Veiculo {
    //é o que tem em comum em carro e motocicleta
    //os dois irão herdar veiculo
    private String modelo;
    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
