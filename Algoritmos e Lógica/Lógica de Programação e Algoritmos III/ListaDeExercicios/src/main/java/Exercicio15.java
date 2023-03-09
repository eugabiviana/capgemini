import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        //Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;

        Scanner leia = new Scanner(System.in);

        int num;

        System.out.println("Digite um valor: ");
        num = leia.nextInt();

        if (num >= 100 && num <= 200){
            System.out.println("O número "+ num + " está entre 100 e 200!");

        }else {
            System.out.println("O número "+ num + " não está entre 100 e 200!");
        }

    }
}
