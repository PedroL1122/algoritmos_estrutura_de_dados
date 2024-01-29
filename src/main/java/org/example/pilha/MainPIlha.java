package org.example.pilha;

import java.util.ArrayList;

public class MainPilha {
    private ArrayList<Integer> items;

    public Pilha() {
        this.items = new ArrayList<>();
    }

    public void push(int item) {
        this.items.add(item);
    }

    public int pop() {
        if (!isEmpty()) {
            int topItem = this.items.remove(size() - 1);
            return topItem;
        } else {
            System.out.println("Erro: A pilha está vazia.");
            return -1; // Valor de retorno padrão para indicar erro
        }
    }

    public int top() {
        if (!isEmpty()) {
            return this.items.get(size() - 1);
        } else {
            System.out.println("Erro: A pilha está vazia.");
            return -1; // Valor de retorno padrão para indicar erro
        }
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public int size() {
        return this.items.size();
    }

    public static void main(String[] args) {
        // Exemplo de uso:
        Pilha pilha = new Pilha();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());

        int popValue = pilha.pop();
        System.out.println("Elemento removido: " + popValue);

        System.out.println("Topo da pilha: " + pilha.top());
        System.out.println("Tamanho da pilha: " + pilha.size());
    }
}

