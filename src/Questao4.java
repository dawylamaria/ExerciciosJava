import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorHora = 0;
        System.out.print("Digite quanto você ganha por hora trabalhada:");
        valorHora = scan.nextDouble();

        double horasMes = 0;
        System.out.print("Digite a quantidade de horas trabalhadas no mês:");
        horasMes = scan.nextDouble();

        double salarioBruto = 0;
        salarioBruto = valorHora * horasMes;

        double ir = 0;
        double inss = 0;
        double sindicato = 0;
        double salarioLiquido = 0;

        ir = salarioBruto * 0.11;
        inss = salarioBruto * 0.08;
        sindicato = salarioBruto * 0.05;
        salarioLiquido = salarioBruto - ir - inss - sindicato;


        System.out.println("--------------------Tabela-------------------");
        System.out.printf("+Salario Bruto: R$ %.2f", salarioBruto);
        System.out.printf("\n-IR (11%%): R$ %.2f ", ir);
        System.out.printf("\n-INSS (8%%): R$ %.2f", inss);
        System.out.printf("\n-Sindicato (5%%): R$ %.2f", sindicato);
        System.out.printf("\n=Salario liquido: R$ %.2f", salarioLiquido);


    }

}
