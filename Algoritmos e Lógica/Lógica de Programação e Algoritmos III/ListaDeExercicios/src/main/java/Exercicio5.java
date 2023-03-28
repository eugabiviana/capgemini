import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        //Escreva um algoritmo que leia o nome de um aluno e as notas das três provas que ele obteve no semestre.
        // No final, informar o nome do aluno e a sua média (aritmética);

        String nome;
        double nota1;
        double nota2;
        double nota3;
        double media;

        Scanner leia = new Scanner(System.in);

        char desejaRepetir = 's';

        while (desejaRepetir == 's' || desejaRepetir == 'S'){

            System.out.println("Digite o nome do aluno a ser cadastrado:");
            nome = leia.nextLine();
            System.out.println("Digite a primeira nota:");
            nota1 = leia.nextDouble();
            System.out.println("Digite a segunda nota:");
            nota2 = leia.nextDouble();
            System.out.println("Digite a terceira nota:");
            nota3 = leia.nextDouble();

            media = (nota1 + nota2 + nota3)/3;

            System.out.println("A média do aluno " + nome + " é igual a: " + media);

            System.out.println("Deseja fazer mais cadastro? S - Sim/ N - Não");
            desejaRepetir = leia.next().charAt(0); //aqui ele lê só a primeira letra digitada
        }
    }
}
