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
      Escreval("N�o � tri�ngulo!")
   senao
        se (lado1 = lado2) E (lado2 = lado3) entao
           Escreval("Tri�ngulo equil�tero!")
        senao
             se (lado1 = lado2) OU (lado2 = lado3) OU (lado1 = lado3) entao
                Escreval("Tri�nguilo is�sceles!")
             senao
                  Escreval("Tri�ngulo escaleno!")
             fimse
        fimse
   fimse
   
   //Nesse caso: se (lado1 > lado2 + lado3) OU (lado2 > lado1 + lado3) OU (lado3 > lado1 + lado2) entao
   //quando o programa l� os dois primeiros blocos, ele j� julga em V ou F, n�o chegando a processar a terceira condi��o.
   //Isso torna desnecess�rio escrev�-lo, ficando ent�o:
   //se (lado1 > lado2 + lado3) OU (lado2 > lado1 + lado3) entao
   //Essa regra tamb�m serve para o E.

fimalgoritmo
