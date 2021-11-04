public class EmpregadoAssalariadoComissionadoBonificado 
    extends EmpregadoAssalariadoComissionado {
    

    private double bonus;
    
    public EmpregadoAssalariadoComissionadoBonificado(
            double s, double c, double b){
        super(s, c);
        this.bonus = b;
    }

    @Override
    public double calculaSalario() {
        //return salario + salario * comissao + bonus;
        return super.calculaSalario() + bonus;
    }
}
