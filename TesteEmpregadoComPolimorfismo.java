import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TesteEmpregadoComPolimorfismo {
    public static void main(String[] args) {
        Random gerador = new Random();
        List <Empregado> empregados = new ArrayList<>();
        
        for (int i = 0; i < 10; i++) {
            int tipo = gerador.nextInt(4) + 1;
            switch(tipo){
                case 1:{
                    double salario = 2000 + gerador.nextDouble() * 1000;
                    empregados.add(new EmpregadoAssalariado(salario));
                    break;
                }
                case 2: {
                    double salario = 1500 + gerador.nextDouble() * 1000;
                    double comissao = gerador.nextDouble() * 0.2;
                    empregados.add(
                        new EmpregadoAssalariadoComissionado(
                            salario, comissao
                    ));
                    break;
                }
                case 3: {
                    double salario = 1500 + gerador.nextDouble() * 1000;
                    double comissao = gerador.nextDouble() * 0.2;
                    double bonus = 200;
                    empregados.add(
                        new EmpregadoAssalariadoComissionadoBonificado(
                            salario, comissao, bonus
                    ));
                    break;
                }
                case 4:{
                    double valorHora = 20 + gerador.nextDouble() * 30;
                    double horasTrabalhadas = 100 + gerador.nextDouble() * 100;
                    empregados.add(
                        new EmpregadoHorista(
                            valorHora,
                            horasTrabalhadas
                        )
                    );
                    break;
                }
            }
        }

        //façamos o processamento da folha de pagamento
        for (int i = 0; i < empregados.size(); i++) {
            double salarioFinal = empregados.get(i).calculaSalario();
            System.out.printf ("Empregado %d: %.2f\n", i + 1, salarioFinal);
        }
    }
}
