# Implementação de Lista Duplamente Encadeada em Java

## 📝 Descrição

Este projeto implementa uma lista duplamente encadeada genérica em Java, com todas as operações básicas necessárias para manipulação da estrutura de dados.

## 🏗️ Estrutura do Projeto
```bash
src/
└── ds/
└── doublyLinkedList/
├── Node.java        # Classe que representa um nó da lista
├── DoublyLinkedList.java # Implementação da lista
└── App.java         # Exemplo de uso
```

## ⚙️ Funcionalidades Implementadas 
- Métodos Principais
```bash
- addFirst(T value) - add elemento no início
- addLast(T value) - add elemento no final
- removeFirst() - remove elemento do início
- removeLast() - remove elemento do final
- size() - retorna o tamanho do elemento
- isEmpty() - confirma se a lista está vazia
- display() - mostra a lista
```

## 🚀 Como Usar
1. Cria uma lista:
```bash
DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
```

2. Adiciona elemento da lista:
```bash
list.addFirst(10);
list.addLast(20);
```

3. Remove elemento da lista:
```bash
int primeiro = list.removeFirst();
int ultimo = list.removeLast();
```

4. Valida o estado da lista:
```bash
if (list.isEmpty()) {
System.out.println("Lista vazia!");
}
System.out.println("Tamanho: " + list.size());
```

## ✅ Exemplo Completo
```bash
DoublyLinkedList<String> names = new DoublyLinkedList<>();
names.addLast("Alfa");
names.addLast("Bravo");
names.addFirst("Charlie");

names.display(); // [ Charlie Alfa Bravo ]

names.removeFirst();
names.removeLast();
names.display(); // [ Alfa ]
```

## 📊 Complexidade das Operações
| Operação       | Complexidade | 
|----------------|--------------|
| `addFirst`     | O(1)         | 
| `addLast`      | O(1)         | 
| `removeFirst`  | O(1)         | 
| `removeLast`   | O(1)         | 
| `size`         | O(1)         | 
| `isEmpty`      | O(1)         | 

## ⚠️ Tratamento de Erros
- Lança IllegalStateException ao tentar remover de lista vazia

```bash
try {
emptyList.removeFirst();
} catch (IllegalStateException e) {
System.out.println(e.getMessage());
}
```