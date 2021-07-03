package aulas.oo.part03.funcionario;

public class Funcionario {
    private float salario;

    public Funcionario(float salario){this.salario=salario;}

    public String calculaImposto(){
       return "Funcionario não possui calculo";
    }

    public float getSalario(){
        return salario;
    }
}
