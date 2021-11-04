public class EmpregadoAssalariado extends Empregado{
    
    private double salario;

    public EmpregadoAssalariado (double salario) {
        this.salario = salario;
    }

    @Override //isso é uma anotação
    public double calculaSalario() {
        return salario;
    }

}


