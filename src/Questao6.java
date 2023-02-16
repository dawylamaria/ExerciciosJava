import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num1 = 0;
        int num2 = 0;
        int num3 = 0;

        System.out.print("Digite o primeiro número:");
        num1 = scan.nextInt();

        System.out.print("Digite o segundo número:");
        num2 = scan.nextInt();

        System.out.print("Digite o terceiro número:");
        num3 = scan.nextInt();

        if(num1 > num2 && num1 > num3) {
            System.out.printf(
                    "%d é o maior número!", num1
            );
        } else if (num2 > num1 && num2 > num3){
            System.out.printf(
                    "%d é o maior número!", num2
            );
        } else{
            System.out.printf(
                    "%d é o maior número!", num3
            );

        } if (num1 < num2 && num1 < num3){
            System.out.printf(
                    "\n%d é o menor número!", num1
            );

        }else if (num2 < num1 && num2 < num3){
            System.out.printf(
                    "%d é o menor número!", num2
            );

        }else {
            System.out.printf(
                    "%d é o menor número!"
            );

        }
    }
}
