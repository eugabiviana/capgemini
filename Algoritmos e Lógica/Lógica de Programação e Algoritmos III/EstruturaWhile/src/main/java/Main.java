import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int totalAlunos = 10;

        while (totalAlunos > 0){

            String nomeAluno = leia.nextLine();
            int idadeAluno = leia.nextInt();

            System.out.println("O nome do aluno é: " +nomeAluno+ " e a idade é: " +idadeAluno);

            totalAlunos = totalAlunos - 1;

        }
    }
}
