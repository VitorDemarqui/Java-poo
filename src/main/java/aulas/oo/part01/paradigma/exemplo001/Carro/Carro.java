package aulas.oo.part01.paradigma.exemplo001.Carro;

public class Carro {
    private int quantidadePessoas = 0;


    public String entrarPessoa(int NumPessoas){

        quantidadePessoas += NumPessoas;
        return NumPessoas +" Estão entrando no carro";
    }

    public String removerPessoa(int NumPessoas){

        quantidadePessoas -= NumPessoas;
        return NumPessoas +" Estão saindo do carro";
    }

    public int getPessoas(){
        return quantidadePessoas;
    }

}
