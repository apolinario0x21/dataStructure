# Implementação de Pilha (Stack) em Java

## 📝 Descrição
Implementação de uma estrutura de dados Pilha (LIFO - Last In, First Out) utilizando lista encadeada em Java. Esta versão genérica (Stack<T>) pode armazenar qualquer tipo de objeto.

## 🏗️ Estrutura do Projeto
```bash
src/
└── ds/
    └── stack/
        ├── Node.java     # Classe do nó da pilha
        ├── Stack.java    # Implementação completa da pilha
        └── App.java      # Exemplos de uso
```

## ⚙️ Funcionalidades Principais
- Métodos Essenciais
```java
- push(T) - Adiciona elemento no topo
- pop()	- Remove e retorna elemento do topo	
- peek() - Retorna elemento do topo (sem remover)
- size() - Retorna quantidade de elementos	
- isEmpty() - Verifica se a pilha está vazia
```
Recursos Adicionais:
- 💡 Tratamento de erros com IllegalStateException (pilha vazia)
- 🛡️ Validação de null no método push()
- 📝 Representação textual com toString()

## 🚀 Como Usar
1. Criação da Pilha
```bash
Stack<String> stack = new Stack<>();
```
2. Operações Básicas
```bash
// Empilhando
stack.push("Primeiro");
stack.push("Segundo");

// Consultando
String topo = stack.peek(); // "Segundo"

// Desempilhando
String elemento = stack.pop(); // "Segundo"

// Verificações
if(stack.isEmpty()) {
    System.out.println("Pilha vazia!");
}
```

## 📌 Exemplo Completo
```java
public class App {
    public static void main(String[] args) {
        Stack<Integer> numeros = new Stack<>();
        
        // Empilhando valores
        numeros.push(10);
        numeros.push(20);
        numeros.push(30);
        
        System.out.println(numeros); // [30, 20, 10]
        
        // Desempilhando
        System.out.println(numeros.pop()); // 30
        System.out.println(numeros.pop()); // 20
        
        // Consultando
        System.out.println("Topo atual: " + numeros.peek()); // 10
        System.out.println("Tamanho: " + numeros.size()); // 1
    }
}
```

### 📊 Complexidade das Operações da Pilha

| Operação   | Método      | ⚡ Complexidade | 💥 Tratamento de Erros                     |
|------------|-------------|----------------|--------------------------------------------|
| Inserção   | `push(T)`   | O(1)           | Não aceita null `IllegalArgumentException` |
| Remoção    | `pop()`     | O(1)           | Pilha vazia `IllegalStateException` |
| Consulta   | `peek()`    | O(1)           | Pilha vazia `IllegalStateException` |
| Verificação| `isEmpty()` | O(1)           | ✅ Nenhum                           |
| Tamanho    | `size()`    | O(1)           | ✅ Nenhum                           |

## ⚠️ Tratamento de Erros
A pilha lança exceções em casos específicos:

```java
try {
    stack.pop(); // Lança IllegalStateException se vazia
    stack.push(null); // Lança IllegalArgumentException
} catch (IllegalStateException e) {
    System.out.println("Erro: " + e.getMessage());
}
```

