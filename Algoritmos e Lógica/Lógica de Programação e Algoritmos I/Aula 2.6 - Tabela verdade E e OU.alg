algoritmo "Tabela verdade"

var
   i, j: inteiro
   afirmacao: logico

inicio
      i <- 10
      j <- 21
      //Tabela verdade do E:
      //sim E sim = SIM
      //sim E n�o = N�O
      //n�o E sim = N�O
      //n�o E n�o = N�O
       se (i = 10) E (j = 20) entao
          Escreval("TABELA E: Fa�a algo.")
       senao
          Escreval("TABELA E: N�o fa�a nada.")
       fimse
      
      //Tabela verdade do OU:
      //sim OU sim = SIM
      //sim OU n�o = SIM
      //n�o OU sim = SIM
      //n�o OU n�o = N�O
      se (i = 10) OU (j = 20) entao
          Escreval("TABELA OU: Fa�a algo.")
       senao
            Escreval("TABELA OU: N�o fa�a nada.")
       fimse

      

fimalgoritmo
