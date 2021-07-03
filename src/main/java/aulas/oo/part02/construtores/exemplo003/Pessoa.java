package aulas.oo.part02.construtores.exemplo003;

public class Pessoa {

    //se tiver um construtor com parametro devemos tanbem criar um construtor sem parametro
    // caso desejemos instanciar sem parametro
    public Pessoa(String nome) {
        this.nome = nome;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
