import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba “N” números e mostre positivo, negativo ou zero para cada número;

        Scanner leia = new Scanner(System.in);

        char desejaContinuar = 'S';

        while (desejaContinuar == 'S' || desejaContinuar == 's') {

            System.out.println("Digite um número: ");
            int num = leia.nextInt();

            if (num == 0)
            {
                System.out.println("O número é igual a 0!");
            }else {
                if (num > 0) {
                    System.out.println("O número é positivo!");
                } else {
                    System.out.println("O número é negativo!");
                }
            }

            System.out.println("Deseja continuar? S - Sim/ N - Não");
            desejaContinuar = leia.next().charAt(0);
        }
    }
}