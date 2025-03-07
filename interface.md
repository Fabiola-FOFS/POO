Interface Collection

*** interface List ***

a chamada dela se dá : java.util.List 
`caracteristicas`: posso usar elementos duplicados, garante a ordem. 

# tipos de implementação:

`àrrayList`: usa um array para criar a lista, melhor para operações de pesquisa, mais moroso para fazer exclusão, implementa a inteface List


`vector`:

`LinkedList`: usa uma lista duplamente ligada, melhor para operações de inserção e exclusão, implementa a interface List e Queue


*** interface Set ***
* não permite duplicados
* não possui indice 

`HashSet`: implementa diretamente a interface Set, 
usa HashMap para armazenar elementos, 
não mantém a ordem dos elementos, 
melhor performance
permite 1 elemento nulo


`LinkedHashSet`: implementa derivando de HashSet
usa o LinkedHashSet para armazenar elementos,
mantém na ordem de inserção de elementos
permite 1 elemento nulo

*** Interface Map ***
caracteristicas :
* não deriva das collections
* elementos unicos para cada valor 

`Hastable`: implementa Map

`HashMap`: itera de forma aleatória, 
permite chaves nulas
implementa Map
sincroniza apenas através do collections.synchronizedMap()
estrutura de dados se dá: List of Buckets

`LinkedHashMap`: itera na ordem de inserção, 
permite chaves nulas
implementa Hashmap, e map
sincroniza apenas através do collections.synchronizedMap()
estrutura de dados se dá: Doubly Linked

`treeMap`: itera na ordem natural, (numerica, alfabetica etc)
ñ permite chaves nulas
implementa NavigableMap, SortedMap e Map 
sincroniza apenas através do collections.synchronizedMap()
estrutura de dados se dá: em arvore