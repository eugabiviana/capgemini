algoritmo "Exerc�cio - Vetor inverso"

var
   vetorCres, vetorDecr: vetor[1..10] de inteiro
   i, aux: inteiro
   
   num1, num2, num3: vetor[1..5] de inteiro
   opcao: literal

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
  
//A RESOLU��O:
  //  escreval("Ordem crescente:")
//    para i de 1 ate 10 faca
//         escreval("Numero ",i)
//    fimpara
    
//    aux <- 11
    
 //   escreval(" ")
//    escreval("Ordem decrescente:")
 //   para i de 1 ate 10 faca
//         vetorDecr[aux - 1] <- vetorCres[i]
 //        escreval("N�mero", aux - i)
//    fimpara

      para i de 1 ate 5 faca
         escreval("1 - Numeros ",i)
         leia(num1[i])
      fimpara
      
      para i de 1 ate 5 faca
         escreval("2 - Numeros ",i)
         leia(num2[i])
      fimpara
      
      escreval("1 - Soma")
      escreval("2 - Subtra��o")
      escreval("3 - Multiplica��o")
      escreval("4 - Divis�o")
      leia(opcao)
      
      se opcao = "1" entao
         para i de 1 ate 5 faca
              num3[i] <- num1[i] + num2[i]
         fimpara
         escreval(num3[i])
      fimse
           se opcao = "2" entao
              para i de 1 ate 5 faca
                 num3[i] <- num1[i] - num2[i]
              fimpara
           fimse
      //senao
           se opcao = "3" entao
               para i de 1 ate 5 faca
                    num3[i] <- num1[i] * num2[i]
               fimpara
           fimse
      //senao
           se opcao = "4" entao
              para i de 1 ate 5 faca
                 num3[i] <- num1[i] / num2[i]
              fimpara
           fimse
      //fimse

  
fimalgoritmo
