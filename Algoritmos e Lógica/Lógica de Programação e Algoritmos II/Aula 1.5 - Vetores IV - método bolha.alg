algoritmo "Vetores - m�todo bolha"

var
   numeros: vetor[1..5] de inteiro
   i, j, aux: inteiro

inicio
      para i de 1 ate 5 faca
           EscrevaL("N�mero ", i)
           leia(numeros[i])
      fimpara
      
      para i de 1 ate 5 faca
           para j de 1 ate 5 faca
                se numeros[j] > numeros[i] entao
                   aux <- numeros[i]
                   numeros[i] <- numeros[j]
                   numeros[j] <- aux
                fimse
           fimpara
      fimpara

fimalgoritmo
