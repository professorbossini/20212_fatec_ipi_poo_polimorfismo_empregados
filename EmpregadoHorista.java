public class EmpregadoHorista extends Empregado{
    private double valorHora, horasTrabalhadas;

    public EmpregadoHorista(double valor, double horas) {
        this.valorHora = valor;
        this.horasTrabalhadas = horas;
    }

    @Override
    public double calculaSalario() {
        return valorHora * horasTrabalhadas;
    }
}
