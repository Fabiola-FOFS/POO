# Metodo 
é uma porção de codigo (sub rotina) que é disponibilizada pela classe. Serve para identificar quais serviços e ou ações a classe oferece. São responsaveis por definir e realizar um comportamento. 

`ex criação do metodo`

java e C# 
- visibilidade 
-retorno
-nome
-parametros 

python
-def 
-nome
-parametros 

`dicas para nomear metodos`
- usar verbos
- significativos
- contexto 

*** exemplo *** 
java e C# class Carro {
 void frear 
}

python class Carro :
    def frear ()

#   Metodos especiais: prover os valores iniciais para o objeto e atributos
1. *** construtor *** : constói objetos apartir das classes 

ex: `java e C# `
  class Carro {
    carro () { // o nome do construtor precisa ser o mesmo nome da classe 

    }
}

ex: `python` 
class Carro: 
def__init__(self) :

2 . *** destrutor *** : auxilia na destruição do codigo quando precisar liberar memoria 
ex: 
`java` : class Carro {
    void finalize() {

    }
}

`C#`: class Carro {
    ~ Carro() {

    }
}

`python`: class Carro:
              def__del__(self):

# python não usa sobrecarga