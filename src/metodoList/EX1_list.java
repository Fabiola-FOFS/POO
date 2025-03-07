package metodoList;


import java.util.*;

class EX1_list {
    public static void main(String[] args) {
// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:

//     List notas = new ArrayList(); //antes do java 5
//      ArrayList<Double> notas = new ArrayList<>();
//      List<Double> notas = new ArrayList<>  (Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
        /*List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(10d);
        System.out.println(notas);*/
        /*List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
        notas.add(1d);
        notas.remove(5d);
        System.out.println(notas);*/

/* System.out.println("Crie uma lista e adicione as sete notas: ");

        List<Double> notas = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas.toString());

        System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d)); // para encontrar um elemento dentro arraylist, coloco o nome da variavel que armazena a lista e o index é a posição

        System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
        notas.add(4, 8d); // adiconando pelo add digo qual a posição no index e o elemento 
        System.out.println(notas);

        System.out.println("Substitua a nota 5.0 pela nota 6.0: ");
        notas.set(notas.indexOf(5d), 6.0); // pelo set usando o indexof e passando o elemento
        System.out.println(notas);

        System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5d)); // usa o contains para saber ele devolve

        /*System.out.println("Exiba todas as notas na ordem em que foram informados: ");
        for (Double nota : notas) System.out.println(nota);

        System.out.println("Exiba a terceira nota adicionada: " + notas.get(2)); // exibe indice escolhido
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas)); //usa o metodo collection ja que list é uma collection, mais o min e retorna o menor valor na lista

        System.out.println("Exiba a maior nota: " + Collections.max(notas)); // usa o metodo collection ja que list é uma collection, mais o max e retorna o maior valor na lista

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("Exiba a soma dos valores: " + soma); // usa o iterator para passear na lista e ir somando os valores

        System.out.println("Exiba a média das notas: " + (soma/notas.size())); // usa o size 

        System.out.println("Remova a nota 0: ");
        notas.remove(0d);
        System.out.println(notas); // metodo remove

        System.out.println("Remova a nota da posição 0");
        notas.remove(0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()) {
            Double next = iterator1.next();
            if(next < 7) iterator1.remove();
        }
        System.out.println(notas);

        /*System.out.println("Apague toda a lista");
        notas.clear();
        System.out.println(notas); // remover a lista
        
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty()); // isEmpty retorna um boolean dizendo se a lista está vazia ou não
*/

//Para você: Resolva esses exercícios utilizando os métodos da implementação LinkedList:

        System.out.println("Crie uma lista chamada notas2 " +
                "e coloque todos os elementos da list Arraylist nessa nova lista: ");
                List<Double> notas2 = new ArrayList<Double>(); //Generics(jdk 5) - Diamond Operator(jdk 7)
                notas2.add(7.0);
                notas2.add(8.5);
                notas2.add(9.3);
                notas2.add(5.0);
                notas2.add(7.0);
                notas2.add(0.0);
                notas2.add(3.6);
                System.out.println(notas2.toString());

       System.out.println("Mostre a primeira nota da nova lista sem removê-lo: " + notas2.get(0));

       System.out.println("Mostre a primeira nota da nova lista removendo-o: " +  notas2.remove(0));
       System.out.println(notas2);

    }
}