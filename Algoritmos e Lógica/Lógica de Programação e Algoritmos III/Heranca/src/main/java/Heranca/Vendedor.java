package Heranca;

import java.util.Date;

public class Vendedor extends Funcionario {

    private int totalItensVendidos;
    private float comissaoPorItem;

    //Constructor
    public Vendedor() {
        super(); //me d� acesso a todos os atributos de funcion�rio aqui em vendedor. Sem isso n�o consigo chamar o obj na Main!
    }

    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

    //Getters and Setters
    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
}

/**
 * O vendedor passa a ter todas as informa��es de Funcion�rio quando extendo a classe aqui para dentro!
 * Se eu tirar o super();, ele passa a n�o ter nenhum atributo al�m dos dois criados aqui na classe.
 * Quando coloco super.getSalario, estou pedindo permiss�o para a classe superior (no caso FUNCION�RIO), para pegar a
 * informa��o de l� e modificar aqui.
 */
