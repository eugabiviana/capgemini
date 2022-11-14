algoritmo "Tabela verdade"

var
   i, j: inteiro
   afirmacao: logico

inicio
      i <- 10
      j <- 21
      //Tabela verdade do E:
      //sim E sim = SIM
      //sim E não = NÃO
      //não E sim = NÃO
      //não E não = NÃO
       se (i = 10) E (j = 20) entao
          Escreval("TABELA E: Faça algo.")
       senao
          Escreval("TABELA E: Não faça nada.")
       fimse
      
      //Tabela verdade do OU:
      //sim OU sim = SIM
      //sim OU não = SIM
      //não OU sim = SIM
      //não OU não = NÃO
      se (i = 10) OU (j = 20) entao
          Escreval("TABELA OU: Faça algo.")
       senao
            Escreval("TABELA OU: Não faça nada.")
       fimse

      

fimalgoritmo
