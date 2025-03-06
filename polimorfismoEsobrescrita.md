*** o conceito mais importante de POO ***

a MESMA ação se comportando diferente

### Conceitos de **Polimorfismo** e **Sobrescrita** em POO com Java

#### 1️⃣ **Polimorfismo**  
O **polimorfismo** permite que uma classe tenha diferentes formas de comportamento ao chamar um mesmo método em objetos distintos. Ele pode ser de dois tipos:
- **Polimorfismo de Sobrecarga (compile-time):** Vários métodos com o mesmo nome, mas assinaturas diferentes.
- **Polimorfismo de Sobrescrita (runtime):** Uma subclasse redefine um método da superclasse para fornecer sua própria implementação.

#### 2️⃣ **Sobrescrita de Métodos**  
A **sobrescrita** (**override**) ocorre quando uma subclasse redefine um método herdado da superclasse, mantendo a mesma assinatura (nome e parâmetros), mas alterando seu comportamento.

---

### **Exemplo em Java**
Vamos demonstrar a sobrescrita e o polimorfismo:

```java
// Superclasse
class Animal {
    void fazerSom() {
        System.out.println("O animal faz um som.");
    }
}

// Subclasse que sobrescreve o método
class Cachorro extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O cachorro late: Au Au!");
    }
}

// Outra subclasse
class Gato extends Animal {
    @Override
    void fazerSom() {
        System.out.println("O gato mia: Miau!");
    }
}

// Classe principal para testar o polimorfismo
public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal meuAnimal; // Variável do tipo genérico (superclasse)

        meuAnimal = new Cachorro(); // Cachorro assume a forma de Animal
        meuAnimal.fazerSom(); // Chama o método da subclasse Cachorro

        meuAnimal = new Gato(); // Gato assume a forma de Animal
        meuAnimal.fazerSom(); // Chama o método da subclasse Gato
    }
}
```

### **Explicação**
1. Criamos uma superclasse `Animal` com um método `fazerSom()`.
2. As subclasses `Cachorro` e `Gato` sobrescrevem esse método com implementações próprias.
3. No método `main()`, utilizamos **polimorfismo** ao referenciar diferentes objetos (`Cachorro` e `Gato`) com a variável `meuAnimal`, permitindo que cada um execute sua própria versão de `fazerSom()`.

---

### **Resumo**
✅ **Polimorfismo:** Permite que um mesmo método tenha comportamentos diferentes dependendo do objeto.  
✅ **Sobrescrita:** Uma subclasse redefine um método da superclasse para alterar seu comportamento.  
✅ **Benefício:** Flexibilidade e reutilização de código na programação orientada a objetos.  

Quer ver um exemplo com **interfaces** ou **classes abstratas**? 🚀