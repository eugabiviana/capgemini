algoritmo "Passo"
//Na lógica do programa, já fica implicito que o passo é um, para sobrescrever o padrão, mudo o número para o passo desejado.
//
var
i, w, start, end: inteiro
inicio
escreval("Impressão de todos os números entre 0 e 10:")
//Na lógica do programa, já fica implicito que o passo é 1.
   para i de 0 ate 10 faca
        escreval(i)
   fimpara
   escreval(" ")
   escreval("===================================================")
   escreval(" ")
   escreval("Impressão de todos os números PARES entre 0 e 10:")
//Para sobrescrever o padrão, mudo o número para o passo desejado, deixando explícito no código.
   para i de 0 ate 10 passo 2 faca
        escreval(i)
   fimpara
   escreval(" ")
   escreval("===================================================")
   escreval(" ")
   escreval("Impressão de todos os números decrescentes entre 10 e 0:")
//Também posso inverter a ordem e colocar para escrever o número decrescente.
   para i de 10 ate 0 passo -1 faca
        escreval(i)
   fimpara
   
//Sem valores fixos:
   escreval(" ")
   escreval("===================================================")
   escreval(" ")
   escreval("Impressão de números solicitados ao usuário:")
   escreval(" ")
   escreval("Começo em: ")
   leia(start)
   escreval("Fim em: ")
   leia(end)
   escreval("Decremento de: ")
   leia(w)
   
   para i de start ate end passo w faca
        escreval(i)
   fimpara
fimalgoritmo
