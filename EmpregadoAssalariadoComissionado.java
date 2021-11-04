public class EmpregadoAssalariadoComissionado extends EmpregadoAssalariado {
    
    private double comissao;

    public EmpregadoAssalariadoComissionado (double s, double c){
        super(s);
        this.comissao = c;
    }

    @Override
    public double calculaSalario() {
        double salarioBase = super.calculaSalario();
        return salarioBase + salarioBase * comissao;
    }

    public double getComissao() {
        return comissao;
    }
}
