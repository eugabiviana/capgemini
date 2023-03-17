package Classes;

public class Pessoa {

    //atributos
    public float peso;
    public float altura;

    //métodos (sempre colocar o nome dos métodos no infinitivo)
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }
}
