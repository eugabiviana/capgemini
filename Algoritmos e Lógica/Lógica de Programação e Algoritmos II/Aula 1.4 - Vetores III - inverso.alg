algoritmo "Exercício - Vetor inverso"

var
   vetorCres, vetorDecr: vetor[1..10] de inteiro
   i, aux: inteiro

inicio
 //O que tentei fazer -_-':
  // i <- 0

//   para i de 1 ate 5 faca
 //     repita
 //     aleatorio 1,30
 //         leia(vetorCres[i])
//          leia(vetorDecr[i])
//      aleatorio off
//      ate vetorCres[i] <= vetorDecr[i]
//   fimpara
   
   //escreval(vetorCres[i])
   
  // para i de 1 ate 5 faca
   //     escreval(vetorDecr[i])
  // fimpara
  
//A RESOLUÇÃO:
    para i de 1 ate 10 faca
         escreval("Numero ",i)
    fimpara
    
    aux <- 11
    
    para i de 1 ate 10 faca
         vetorDecr[aux - 1] <- vetorCres[i]
         vetorCres[i] <- vetorDecr[i]
         escreval(vetorCres[i])
    fimpara
  
fimalgoritmo
