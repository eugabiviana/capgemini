package Heranca;

public class Main {
    public static void main(String[] args) {

        Vendedor v = new Vendedor();

        Motorista m = new Motorista();
    }
}

/**
 * A heran�a � usada para n�o haver repeti��o de c�digo, como no caso da aula 4.w, onde vendedor e motorista t�m as mesmas
 * informa��es.
 * ao digitar 'v.' aqui na Main, consigo chamar os atribuitos de Funcionario para a classe Vendedor (por causa do super)
 */