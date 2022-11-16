algoritmo "Enquanto"

var
   maisNovo, maisVelho, qtdEntrevistados, idadeInformada: inteiro
   porcentagemMenorIdade, mediaIdade, qtdMenorIdade, somaIdades: real

inicio
   maisNovo <- 9999
   maisVelho <- 0
   qtdEntrevistados <- 0
   qtdMenorIdade <- 0
   
   enquanto qtdEntrevistados < 5 faca
      escreval("Por favor, informe a sua idade: ")
      leia(idadeInformada)
      
      se idadeInformada >= maisVelho entao
         maisVelho <- idadeInformada
      fimse
      se idadeInformada < maisNovo entao
         maisNovo <- idadeInformada
      fimse
      se idadeInformada < 18 entao
         qtdMenorIdade <- qtdMenorIdade + 1
      fimse
    somaIdades <- somaIdades + idadeInformada
    qtdEntrevistados <- qtdEntrevistados + 1
    fimenquanto
    
    escreval("Mais novo: ", maisNovo)
    escreval("Mais velho: ", maisVelho)
    porcentagemMenorIdade <- (qtdMenorIdade / 5) * 100
    escreval("Porcentagem de menores de idade: ", porcentagemMenorIdade, "%.")
    mediaIdade <- somaIdades / 5
    escreval("Média das idades: ", mediaIdade)
fimalgoritmo
