import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade = leitor.nextInt(); //estou dizendo ao leitor que ele grave nessa variável o próximo inteiro que for digitado.
        float cotacaoDolar = leitor.nextFloat();
        double cotacaoEuro = leitor.nextDouble();;
        String nome = leitor.nextLine(); //Ler uma frase inteira, até que a pessoa pressione o enter.
        String codigoRua = leitor.next(); //Ler uma palavra.

        System.out.println("Texto que será exibido no console"); //Printa e pula linha
        System.out.print("Texto que será exibido no console"); //Deixa o cursor na linha
    }
}
