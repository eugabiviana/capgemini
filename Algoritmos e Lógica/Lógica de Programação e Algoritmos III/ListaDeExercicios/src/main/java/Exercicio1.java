import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        //Fa�a um algoritmo que receba dois n�meros e exiba o resultado da sua soma;

        int num1 = 0;
        int num2 = 0;
        int resultado = 0;

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um n�mero:");
        num1 = leia.nextInt();
        System.out.println("Digite outro n�mero:");
        num2 = leia.nextInt();

        resultado = num1 + num2;

        System.out.println("O resultado da soma: " + num1 + " + " + num2 + " = " + resultado + ".");
    }
}
