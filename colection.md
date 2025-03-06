# collection
é um objeto composto por ( variaveis primitivas e objetos) dentro de uma unidade. 

*** função *** 
serve para armazenar e processar conjuntos de dados de forma eficiente. 

*** composição ***
`interfaces`: é um contrato que quando assumido por uma classe deve ser implementado. 

`classes (implementações)`: são as materializações, a codificaçao das interfaces.

`algoritmos`: é uma sequencia logica, de instruções afim de resolver um problema

### **Collections em Programação Orientada a Objetos (POO) com Java**  

A **Java Collections Framework (JCF)** é um conjunto de classes e interfaces da biblioteca padrão do Java que facilita o armazenamento, manipulação e processamento de dados em estruturas de dados eficientes.

---

## 🔹 **Principais Interfaces da Java Collections Framework**
A JCF é baseada em algumas interfaces principais:

| Interface  | Característica |
|------------|--------------------------------|
| **List**   | Mantém a ordem dos elementos e permite duplicatas. |
| **Set**    | Não permite elementos duplicados. |
| **Queue**  | Implementa uma fila (FIFO ou LIFO). |
| **Map**    | Estrutura de pares **chave-valor** (não faz parte de `Collection`). |

---

## 📌 **Principais Implementações das Interfaces**
| Interface  | Implementações |
|------------|--------------------------------|
| `List`  | `ArrayList`, `LinkedList`, `Vector` |
| `Set`   | `HashSet`, `LinkedHashSet`, `TreeSet` |
| `Queue` | `PriorityQueue`, `ArrayDeque` |
| `Map`   | `HashMap`, `LinkedHashMap`, `TreeMap` |

---

## ✨ **Exemplo com List (ArrayList)**  
```java
import java.util.ArrayList;
import java.util.List;

public class ExemploList {
    public static void main(String[] args) {
        // Criando uma lista de Strings
        List<String> lista = new ArrayList<>();

        // Adicionando elementos
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Percorrendo a lista com um loop for-each
        for (String linguagem : lista) {
            System.out.println(linguagem);
        }

        // Removendo um elemento
        lista.remove("Python");

        System.out.println("Após remoção: " + lista);
    }
}
```
### 🔍 **Explicação**
1. `ArrayList<String>` cria uma lista dinâmica.
2. `add()` adiciona elementos à lista.
3. `remove()` exclui um elemento.
4. A iteração pode ser feita com `for-each`.

---

## 🚀 **Exemplo com Map (HashMap)**  
```java
import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        // Criando um HashMap (chave-valor)
        Map<String, Integer> idades = new HashMap<>();

        // Adicionando pares chave-valor
        idades.put("Alice", 25);
        idades.put("Bob", 30);
        idades.put("Carlos", 22);

        // Acessando valores pela chave
        System.out.println("Idade de Alice: " + idades.get("Alice"));

        // Iterando sobre o Map
        for (Map.Entry<String, Integer> entrada : idades.entrySet()) {
            System.out.println(entrada.getKey() + " tem " + entrada.getValue() + " anos.");
        }
    }
}
```

### 🔍 **Explicação**
1. `HashMap<String, Integer>` cria um mapa com **chave-valor**.
2. `put()` adiciona elementos.
3. `get()` retorna valores com base na chave.
4. `entrySet()` permite percorrer os pares chave-valor.

---

## 🛠 **Quando Usar Cada Estrutura?**
- **`ArrayList`** → Lista ordenada, acesso rápido por índice.
- **`LinkedList`** → Melhor para inserções e remoções frequentes.
- **`HashSet`** → Coleção sem elementos repetidos, busca rápida.
- **`TreeSet`** → Mantém a ordem natural dos elementos.
- **`HashMap`** → Chave-valor com busca rápida.
- **`TreeMap`** → Chave-valor ordenado.

---

## **📌 Conclusão**
A **Java Collections Framework** fornece estruturas eficientes para manipular dados, tornando o código mais otimizado e reutilizável. O uso correto de **List, Set, Queue e Map** ajuda a escolher a melhor estrutura para cada problema.

---

Quer um exemplo prático mais avançado, como **ordenar listas** ou **usar streams**? 🚀