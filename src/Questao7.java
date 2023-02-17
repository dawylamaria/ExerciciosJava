//Questao 7 da lista de exercicios
import java.util.Scanner;
public class Questao7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int valor;

        System.out.print("Digite o valor da tabuada que deseja calcular:");

        valor = scan.nextInt();

        for (int i = 1; i < 11; i++){
            System.out.println(valor + " x "  + i + " = " + (valor * i));
        }

    }
}
