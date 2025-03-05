# Programação orientada a objetos 

- programação orientada a objetos POO tem uma representação mais realista. Mecanismos mais avançados. Modelagem de dados e interação entre eles.
foca no: o que fazer ? 

- ao contrário de PE, programação estruturada que tem um enfoque mais simplista. foca no : como fazer?

# vantagens 

1. coesão
2. melhor acoplamento -- flexiveis
3. menos gap semantico -- 
4. coletor de lixo -- mecanismo que vão limpando objetos que ñ são utilizados para deixar a memoria livre

# Resumo:
objetos que representam entidades do mundo real, elas se relacionam entre si.

***Programação*** Orientada a Objetos (POO) é um paradigma de programação que organiza o software em "objetos", que são instâncias de classes. Essa abordagem busca modelar o mundo real, facilitando a compreensão, a manutenção e a reutilização do código. A POO é baseada em quatro conceitos fundamentais:

1. **Classe**: Uma classe é uma estrutura que define um tipo de objeto. Ela encapsula dados (atributos) e métodos (funções) que operam sobre esses dados. Por exemplo, uma classe `Carro` pode ter atributos como `cor`, `modelo` e `ano`, e métodos como `acelerar()` e `frear()`.

2. **Objeto**: Um objeto é uma instância de uma classe. Ao criar um objeto, você aloca espaço na memória e pode usar os atributos e métodos definidos na classe. Por exemplo, um objeto `carro1` pode ser uma instância da classe `Carro`, com atributos específicos como `cor = "vermelho"` e `modelo = "Fusca"`.

3. **Encapsulamento**: Esse conceito refere-se à ocultação dos detalhes internos de uma classe, permitindo que os atributos e métodos sejam acessados apenas através de métodos públicos (getters e setters). Isso protege os dados e mantém a integridade do objeto.

4. **Herança**: A herança permite que uma classe (classe filha) herde atributos e métodos de outra classe (classe pai). Isso promove a reutilização de código e a criação de hierarquias de classes. Por exemplo, você pode ter uma classe `Veiculo` como classe pai e `Carro` e `Moto` como classes filhas que herdam suas características.

5. **Polimorfismo**: O polimorfismo permite que diferentes classes implementem métodos com o mesmo nome, mas com comportamentos diferentes. Isso significa que um método pode ser chamado em diferentes tipos de objetos e se comportar de maneira apropriada para cada um.

Esses princípios ajudam a criar sistemas mais organizados e moduláveis, facilitando a colaboração entre desenvolvedores e a manutenção do software ao longo do tempo. A POO é amplamente utilizada em diversas linguagens de programação, como Java, C++, Python e C#.

### Pilares ### 
*** Abstração ***
Processo pelo qual se isola as caracteriscticas de um objeto considerando o que ha em comum entre certos tipos de objetos. 

*** Reuso ***
Capacidade de criar novas unidades de codigo apartir de outras já existentes

*** Encapsulamento *** 
capacidade de `esconder` complexidades e `proteger` dados . 