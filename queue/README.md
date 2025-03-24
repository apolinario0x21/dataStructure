# Implementação de Fila (Queue) em Java

## 📝 Descrição
Implementação de uma estrutura de dados do tipo Fila (Queue) em Java, seguindo o princípio FIFO (First In, First Out). Esta implementação utiliza lista encadeada e é genérica, podendo armazenar qualquer tipo de objeto.

## 🏗️ Estrutura do Projeto
```bash
src/
└── ds/
├── queue/
│   ├── Node.java        # Classe que representa um nó da fila
│   ├── Queue.java       # Implementação da fila
│   └── App.java         # Programa de exemplo
```
## ⚙️ Funcionalidades Implementadas
- Métodos Principais
```bash
- enqueue(T value) - Insere elemento no final da fila
- dequeue() - Remove e retorna elemento do início da fila
- peek() - Retorna (sem remover) o primeiro elemento
- size() - Retorna quantidade de elementos
- isEmpty() - Valida se a fila está vazia
- display() - Mostra todos os elementos
```

## 🚀 Como Usar
1. Criar uma fila:
```bash
Queue<String> fila = new Queue<>();
```

2. Adicionar elementos:
```bash
fila.enqueue("Primeiro");
fila.enqueue("Segundo");
```

3. Remover elemento:
```bash
String primeiro = fila.dequeue();
```

4. Verificar elementos:
```bash
 if (!fila.isEmpty()) {
    System.out.println("Próximo: " + fila.peek());
}
```

## 📌 Exemplo Completo

```bash
Queue<Integer> numeros = new Queue<>();

numeros.enqueue(10);
numeros.enqueue(20);
numeros.enqueue(30);

numeros.display();  // [ 10 20 30 ]
int primeiro = numeros.dequeue();  // 10

Valida o primeiro elemento
System.out.println("Próximo: " + numeros.peek());  // 20
System.out.println("Tamanho: " + numeros.size());  // 2
```

## 📊 Complexidade das Operações

|  ⚙️ Operação   | Complexidade |
|-------------|--------------|
| `enqueue()` | O(1)         |
| `dequeue()` | O(1)         |
| `peek()`    | O(1)         |
| `size()`    | O(1)         |
| `isEmpty()` | O(1)         |

## ⚠️ Tratamento de Erros
- Lança IllegalStateException nas operações:
dequeue() quando a fila está vazia
peek() quando a fila está vazia

Exemplo de tratamento:
```bash
try {
    fila.dequeue();
} catch (IllegalStateException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

