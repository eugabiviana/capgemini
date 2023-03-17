package Classes;

public class Pessoa {

    //atributos
    float peso;
    float altura;

    //métodos (sempre colocar o nome dos métodos no infinitivo)
    public float calcularIMC(){
        float imc = peso / (altura * altura);
        return imc;
    }


}
