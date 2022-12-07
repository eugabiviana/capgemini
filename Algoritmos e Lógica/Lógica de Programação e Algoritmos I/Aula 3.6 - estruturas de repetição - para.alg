algoritmo "Para"

var
   i: inteiro

inicio

para i de 0 ate 10 faca
     Escreval(i)
       se i = 6 entao
          Escreval("Parei de imprimir, porque chegou no parametro",i," solicitado!")
          interrompa
       fimse
fimpara
escreval(" ")
escreval("===================================================")
escreval(" ")
escreval("Impressão de todos os números PARES entre 30 e 50:")
para i de 30 ate 50 faca
       se i % 2 = 0 entao
          Escreval(i)
       fimse
fimpara
fimalgoritmo
