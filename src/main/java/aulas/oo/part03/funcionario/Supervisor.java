package aulas.oo.part03.funcionario;

public class Supervisor extends Funcionario{
    public Supervisor(float salario) {
        super(salario);
    }


    public String calculaImposto() {
        return "O supervisor com o salário: "+this.getSalario()+ " pagará: "+this.getSalario() * 0.05;
    }
}
