package aulas.oo.part03.funcionario;

public class Atendente extends Funcionario{

    public Atendente(float salario) {
        super(salario);
    }

    public String calculaImposto() {
        return "O atendente com o salário: "+this.getSalario()+ " pagará: "+this.getSalario() * 0.01;
    }
}
