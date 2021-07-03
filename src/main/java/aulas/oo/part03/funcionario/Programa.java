package aulas.oo.part03.funcionario;

public class Programa {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario(1000);
        System.out.println(funcionario.calculaImposto());

        Funcionario gerente = new Gerente(1000);
        System.out.println(gerente.calculaImposto());

        Funcionario supervisor = new Supervisor(1000);
        System.out.println(supervisor.calculaImposto());

        Funcionario atendente = new Atendente(1000);
        System.out.println(atendente.calculaImposto());
    }

}
