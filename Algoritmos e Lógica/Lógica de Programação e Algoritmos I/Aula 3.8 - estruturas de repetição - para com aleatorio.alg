algoritmo "Para + aleatorio"

var
aleatorioMax, aleatorioMin, i, incremento: inteiro
inicio

repita
aleatorio 1,100
   leia(aleatorioMax)
   leia(aleatorioMin)
aleatorio off
ate aleatorioMax >= aleatorioMin
limpatela

aleatorio 1,5
   leia(incremento)
aleatorio off
limpatela
escreval("O incremento sorteado foi:" , incremento)
para i de aleatorioMin ate aleatorioMax passo incremento faca
     escreval(i)
fimpara

fimalgoritmo
