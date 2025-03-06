# herança 
- ajudam a criar entidades a partir de outras entidades:

extensão e subtipo de uma superclasse - reaproveita atributos e metodos 

ex:
`java`class A extends B {

}

`C#`
class A: B {

}

`PYTHON`
class A(B) :

# tipos de herança 
*** sIMPLES ***
cada classe filha herda de apenas uma classe mãe 
ex:
funcionario : gerente, vendendo, faxineiro. As 3 classes filhas tem uma unica classe mãe 

*** Multipla***
herda de mais de uma classe mãe 

ex:
estudante / funcionario : estagiario -- o estagiario herda as duas classes mães. 

`òbservação` 
java, C# ñ tem heranças multiplas 
Python e C++ -- sim ! 

ex: Python class A (B, C) :
                 pass

*** conceitos ***
upscast - subir na hierarquia de classe - 
Downcast - desce 

ex: upcast
`java e C#`A a = new B(); pega a filha e transforma na mãe
`python`não existe 

ex: downcast
`java e C#`B a = (B) new A(); // não é muito útil 
*** não posso usar downcast em Poo ***