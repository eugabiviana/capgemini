package Heranca;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();

        Motorista m = new Motorista();
    }
}

/**
 * A herança é usada para não haver repetição de código, como no caso da aula 4.w, onde vendedor e motorista têm as mesmas
 * informações.
 * ao digitar 'v.' aqui na Main, consigo chamar os atribuitos de Funcionario para a classe Vendedor (por causa do super)
 */