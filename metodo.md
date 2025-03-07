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

Ótima pergunta! Vamos entender o **static** e quando ele deve ser usado.  

---

### **O que significa `static` em Java?**
O modificador **`static`** significa que o membro pertence **à classe e não a um objeto específico**.  

Ou seja, **um método `static` pode ser chamado sem precisar criar um objeto da classe**.

🔹 **Exemplo:**  
```java
class Exemplo {
    static void metodoEstatico() {
        System.out.println("Este é um método estático.");
    }
}

// Chamando o método sem instanciar a classe
public class Teste {
    public static void main(String[] args) {
        Exemplo.metodoEstatico(); // Não precisa de objeto
    }
}
```
🔹 **Saída:**  
```
Este é um método estático.
```
---
## **Por que o `main` é `static`?**
O método `main` em Java é declarado como:  
```java
public static void main(String[] args) {
```
✅ **Motivo:** Quando o programa começa, **não há nenhum objeto criado ainda**. Como `static` pertence à classe e não a um objeto, o Java pode executar `main` diretamente sem precisar instanciar nada.

---
## **Quando usar `static`?**
Use `static` quando o método ou variável **não precisar de uma instância específica da classe**.

### **Casos comuns para usar `static`**
1️⃣ **Métodos utilitários** (não dependem de atributos de instância)  
```java
class Util {
    static int soma(int a, int b) {
        return a + b;
    }
}

public class Teste {
    public static void main(String[] args) {
        System.out.println(Util.soma(5, 3)); // 8
    }
}
```
✔️ O método `soma` não depende de um objeto, então faz sentido ser `static`.  

---

2️⃣ **Constantes globais**  
```java
class Config {
    static final String NOME_APP = "Meu Aplicativo";
}
```
✔️ A constante `NOME_APP` pertence à classe, não faz sentido cada objeto ter uma cópia própria dela.  

---

3️⃣ **Variáveis compartilhadas entre todos os objetos**  
```java
class Contador {
    static int total = 0; // Compartilhado por todos os objetos

    Contador() {
        total++;
    }
}

public class Teste {
    public static void main(String[] args) {
        new Contador();
        new Contador();
        System.out.println("Total de objetos criados: " + Contador.total);
    }
}
```
✔️ O valor de `total` **não é reiniciado** para cada objeto, porque ele pertence à classe.  

---

## **Quando **NÃO** usar `static`?**
1️⃣ **Quando um método precisa acessar atributos de instância**  
❌ ERRADO:  
```java
class Pessoa {
    String nome;
    
    static void imprimirNome() {
        System.out.println(nome); // ERRO!
    }
}
```
🚨 O método `static` **não pode acessar atributos de instância (`nome`)** porque ele pertence à classe, e `nome` pertence a um objeto.

---

2️⃣ **Quando o comportamento muda de objeto para objeto**  
```java
class Carro {
    String modelo;
    
    void exibirModelo() {
        System.out.println("Modelo: " + modelo);
    }
}
```
✔️ Aqui **não usamos `static`**, porque cada carro pode ter um modelo diferente.

---

### **Resumo**
✅ Use `static` quando:  
✔ O método ou variável pertence à classe, não ao objeto.  
✔ Métodos utilitários (como `Math.pow()`).  
✔ Variáveis globais ou compartilhadas (`static int contador`).  
✔ Constantes (`static final`).  

🚫 **NÃO use `static` quando:**  
❌ O método depende de atributos de instância.  
❌ Cada objeto deve ter seu próprio valor (exemplo: `Carro.modelo`).  

Agora ficou mais claro? 😃🚀