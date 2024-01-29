package org.example.listaEncadeada;

public class MainListaEncadeada {
    private Node head;
    private int size;

    public MainListaEncadeada() {
        this.head = null;
        this.size = 0;
    }

    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
        }
        size++;
    }

    public Node pop() {
        if (head == null) {
            System.out.println("Erro: A lista está vazia.");
            return null;
        }

        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        if (previous != null) {
            previous.next = null;
        } else {
            head = null;
        }

        size--;
        return current;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > size) {
            System.out.println("Erro: Índice inválido.");
            return;
        }

        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }

            node.next = current.next;
            current.next = node;
        }

        size++;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Erro: Índice inválido.");
            return;
        }

        if (index == 0) {
            head = head.next;
        } else {
            Node current = head;
            Node previous = null;

            for (int i = 0; i < index; i++) {
                previous = current;
                current = current.next;
            }

            previous.next = current.next;
        }

        size--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Erro: Índice inválido.");
            return null;
        }

        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        return current;
    }

    public int size() {
        return size;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        lista.push(new Node(1));
        lista.push(new Node(2));
        lista.push(new Node(3));

        System.out.println("Lista original:");
        lista.printList();

        Node poppedNode = lista.pop();
        System.out.println("Nó removido: " + poppedNode.data);

        System.out.println("Lista após a remoção:");
        lista.printList();

        Node newNode = new Node(4);
        lista.insert(1, newNode);

        System.out.println("Lista após a inserção:");
        lista.printList();

        System.out.println("Elemento no índice 1: " + lista.elementAt(1).data);

        lista.remove(1);

        System.out.println("Lista após a remoção do índice 1:");
        lista.printList();
    }
}