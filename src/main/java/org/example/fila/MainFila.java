package org.example.fila;

import java.util.LinkedList;

public class MainFila {
    private LinkedList<Integer> items;

    public Fila() {
        this.items = new LinkedList<>();
    }

    public void enqueue(int item) {
        this.items.addLast(item);
    }

    public int dequeue() {
        if (!isEmpty()) {
            return this.items.removeFirst();
        } else {
            System.out.println("Erro: A fila está vazia.");
            return -1; // Valor de retorno padrão para indicar erro
        }
    }

    public int rear() {
        if (!isEmpty()) {
            return this.items.getLast();
        } else {
            System.out.println("Erro: A fila está vazia.");
            return -1; // Valor de retorno padrão para indicar erro
        }
    }

    public int front() {
        if (!isEmpty()) {
            return this.items.getFirst();
        } else {
            System.out.println("Erro: A fila está vazia.");
            return -1; // Valor de retorno padrão para indicar erro
        }
    }

    public int size() {
        return this.items.size();
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public static void main(String[] args) {
        // Exemplo de uso:
        Fila fila = new Fila();

        fila.enqueue(1);
        fila.enqueue(2);
        fila.enqueue(3);

        System.out.println("Frente da fila: " + fila.front());
        System.out.println("Fim da fila: " + fila.rear());
        System.out.println("Tamanho da fila: " + fila.size());

        int dequeueValue = fila.dequeue();
        System.out.println("Elemento removido: " + dequeueValue);

        System.out.println("Frente da fila: " + fila.front());
        System.out.println("Tamanho da fila: " + fila.size());
    }
}

