package aulas.oo.part02.construtores.Exercicio;

public class Carro {

    private String variante;
    private String modelo;
    private String marca;
    private Integer ano;

    public Carro (String modelo,String marca,Integer ano){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public void setVariante(String variante){
        this.variante = variante;
    }

    public String getCarro(){
        if(variante == null){
            variante = "não possui";
        }
        return "Modelo: " + modelo + " marca: "+marca+" ano: "+ano+" variante: "+variante;
    }

}
