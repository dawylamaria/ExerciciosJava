import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double nota1 = 0;
        double nota2 = 0;

        System.out.print("Digite sua primeira nota:");
        nota1 = scan.nextDouble();

        System.out.print("Digite sua segunda nota:");
        nota2 = scan.nextDouble();

        double media = 0;

        media = (nota1 + nota2) / 2 ;

        if (media >= 7.0 && media < 10){
            System.out.println(
                    "Aprovado!"
            );

        } else if (media < 7.0){
            System.out.println(
                    "Reprovado!"
            );

        } else {
            System.out.println(
                    "Aprovado com Distinção!"
            );
        }


    }
}
