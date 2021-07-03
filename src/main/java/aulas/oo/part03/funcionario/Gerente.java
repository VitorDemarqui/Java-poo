package aulas.oo.part03.funcionario;

public class Gerente extends Funcionario{
    private float imposto;

    //faz referencia ao construtor de funcionarios
    public Gerente(float salario) {
        super(salario);
    }

    public String calculaImposto() {
       return "O gerente com o salário: "+this.getSalario()+ " pagará: "+this.getSalario() * 0.01;
    }
}
