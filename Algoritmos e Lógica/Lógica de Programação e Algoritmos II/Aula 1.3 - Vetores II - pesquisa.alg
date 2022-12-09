algoritmo "Vetores - pesquisa"

var
   nomes: vetor[1..5] de literal
   i, sucesso: inteiro
   pesquisa: literal
inicio

   para i de 1 ate 5 faca
        escreval("Digite o seu nome: ")
        leia(nomes[i])
   fimpara
   limpatela
   
   escreval("Informe o nome que deseja encontrar: ")
   leia(pesquisa)
   
   sucesso <- 0
   
   para i de 1 ate 5 faca
        se nomes[i] = pesquisa entao
           sucesso <- 1
        fimse
   fimpara
   
   se sucesso = 1 entao
      escreval("Cliente encontrado!")
   senao
      escreval("Cliente não encontrado!")
   fimse
fimalgoritmo
