Possibilita um relacionamento entre classes e objetos no qual pode pedir ajuda a outras classes/objetos para integrar o conceito a que se destina. 

classes e objetos interagem entre si

### 🔹 **Conceito de Associação em POO com Java**  

A **associação** em **Programação Orientada a Objetos (POO)** representa o relacionamento entre duas classes, onde uma classe pode usar ou depender de outra. Esse relacionamento pode ser de diferentes tipos:

---

## 🏷 **Tipos de Associação em POO**
1. **Associação Simples (Unidirecional ou Bidirecional)**  
   - Uma classe usa outra sem pertencer a ela.  
2. **Composição (forte acoplamento)**  
   - Uma classe contém outra como parte essencial de sua estrutura.  
3. **Agregação (fraco acoplamento)**  
   - Uma classe pode conter outra, mas ambas existem independentemente.

---

## 🟢 **1. Associação Simples (Unidirecional e Bidirecional)**
**📌 Exemplo:** Um **Aluno** pertence a uma **Escola** (Unidirecional).  
```java
class Escola {
    private String nome;

    public Escola(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Aluno {
    private String nome;
    private Escola escola; // Associação

    public Aluno(String nome, Escola escola) {
        this.nome = nome;
        this.escola = escola;
    }

    public void mostrarEscola() {
        System.out.println(nome + " estuda na escola " + escola.getNome());
    }
}

public class TesteAssociacao {
    public static void main(String[] args) {
        Escola escola = new Escola("Colégio Central");
        Aluno aluno = new Aluno("Lucas", escola);
        aluno.mostrarEscola();
    }
}
```
**🔍 Explicação:**
- A classe `Aluno` **contém** uma instância de `Escola`, mas `Escola` existe independentemente.
- **Unidirecional**, pois apenas `Aluno` tem referência para `Escola`.

---

## 🟡 **2. Agregação (Fraco Acoplamento)**
**📌 Exemplo:** Um **Professor** pode dar aula em várias **Escolas**, mas pode existir sem elas.

```java
import java.util.ArrayList;
import java.util.List;

class Professor {
    private String nome;
    private List<Escola> escolas = new ArrayList<>(); // Lista de escolas

    public Professor(String nome) {
        this.nome = nome;
    }

    public void adicionarEscola(Escola escola) {
        escolas.add(escola);
    }

    public void mostrarEscolas() {
        System.out.print(nome + " trabalha em: ");
        for (Escola escola : escolas) {
            System.out.print(escola.getNome() + " ");
        }
        System.out.println();
    }
}

public class TesteAgregacao {
    public static void main(String[] args) {
        Escola escola1 = new Escola("Escola A");
        Escola escola2 = new Escola("Escola B");

        Professor professor = new Professor("Ana");
        professor.adicionarEscola(escola1);
        professor.adicionarEscola(escola2);
        
        professor.mostrarEscolas();
    }
}
```
**🔍 Explicação:**
- Um `Professor` pode estar associado a várias `Escolas`, mas `Professor` pode existir sem elas.
- Se uma `Escola` for removida, o `Professor` continua existindo.

---

## 🔴 **3. Composição (Forte Acoplamento)**
**📌 Exemplo:** Um **Carro** tem um **Motor**, e o motor NÃO pode existir sem o carro.

```java
class Motor {
    private int potencia;

    public Motor(int potencia) {
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }
}

class Carro {
    private String modelo;
    private Motor motor; // Composição (Motor faz parte de Carro)

    public Carro(String modelo, int potenciaMotor) {
        this.modelo = modelo;
        this.motor = new Motor(potenciaMotor); // O motor é criado dentro do carro
    }

    public void mostrarInfo() {
        System.out.println("O carro " + modelo + " tem motor de " + motor.getPotencia() + " CV.");
    }
}

public class TesteComposicao {
    public static void main(String[] args) {
        Carro carro = new Carro("Ferrari", 500);
        carro.mostrarInfo();
    }
}
```
**🔍 Explicação:**
- O `Motor` é criado **dentro** do `Carro` e não pode existir sem ele.
- Se o `Carro` for destruído, o `Motor` também será.

---

## **🔎 Resumo**
| Tipo         | Característica | Exemplo |
|-------------|--------------|---------|
| **Associação Simples** | Uma classe usa outra, mas ambas existem separadamente. | Aluno → Escola |
| **Agregação** | Uma classe contém outra, mas ambas podem existir separadamente. | Professor → Escolas |
| **Composição** | Uma classe contém outra, e a existência é dependente. | Carro → Motor |

---

## 🚀 **Conclusão**
A **associação** permite modelar relações entre objetos na POO, variando o grau de dependência entre as classes. O uso correto depende da necessidade do sistema.

📌 **Quer um exemplo mais avançado? Como um sistema com várias associações?** 😃