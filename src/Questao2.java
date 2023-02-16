import java.util.Scanner;
public class Questao2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorHoraTrabalhada = 0;
        double horasTrabalhadasMes = 0;

        System.out.println("Digite o valor da hora trabalhada:");
        valorHoraTrabalhada = scan.nextDouble();

        System.out.println("Digite a quantidade de horas trabalhadas no mês:");
        horasTrabalhadasMes = scan.nextDouble();

        double salario = 0;
        salario = valorHoraTrabalhada * horasTrabalhadasMes;

        System.out.printf("Salário: R$ %.2f", salario);



    }

}
