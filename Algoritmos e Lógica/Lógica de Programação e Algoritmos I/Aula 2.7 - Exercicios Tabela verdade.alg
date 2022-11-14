algoritmo "Exercicio - tabela verdade"

var
   lado1, lado2, lado3: inteiro

inicio
   Escreval("lado 1: ")
   leia(lado1)
   Escreval("lado 2: ")
   leia(lado2)
   Escreval("lado 3: ")
   leia(lado3)
   
   se (lado1 > lado2 + lado3) OU (lado2 > lado1 + lado3) OU (lado3 > lado1 + lado2) entao
      Escreval("Não é triângulo!")
   senao
        se (lado1 = lado2) E (lado2 = lado3) entao
           Escreval("Triângulo equilátero!")
        senao
             se (lado1 = lado2) OU (lado2 = lado3) OU (lado1 = lado3) entao
                Escreval("Triânguilo isósceles!")
             senao
                  Escreval("Triângulo escaleno!")
             fimse
        fimse
   fimse

fimalgoritmo
