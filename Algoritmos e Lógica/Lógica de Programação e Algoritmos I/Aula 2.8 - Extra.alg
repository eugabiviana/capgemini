algoritmo "Extra"

var
   altura, peso, imc: real

inicio
      Escreval("Digite a sua altura: ")
      Leia(altura)
      Escreval("Digite o seu peso: ")
      Leia(peso)
      imc <- peso/ altura ^ 2 //^ = elevado a, nesse caso, elevado ao quadrado.
      
      se imc < 19 entao
         escreval("Abaixo do peso.")
      senao
           se imc < 24 entao
              escreval("Peso ideal")
           senão
                escreval("Acima do peso.")
           fimse
      fimse

fimalgoritmo
