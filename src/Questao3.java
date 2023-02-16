import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double temperatura = 0;

        System.out.print("Informe a temperatura em Fahrenheit que deseja converter para Celsius:");
        temperatura = scan.nextDouble();

        double tempCelsius = 0;

        tempCelsius = 5 * (temperatura - 32) / 9 ;

        System.out.printf("A temperatura em graus Celsius é: %.2f",tempCelsius);


    }
}
