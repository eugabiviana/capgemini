package Heranca;

import java.util.Date;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;

    //Constructor
    public Vendedor() {
        super(); //me d� acesso a todos os atributos de funcion�rio aqui em vendedor. Sem isso n�o consigo chamar o obj na Main!
    }
}

//O vendedor passa a ter todas as informa��es de Funcion�rio quando extendo a classe aqui para dentro!
