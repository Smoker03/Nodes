import java.util.ArrayList;

public class List {

    //Clase para saber la posicion de los nodos
    static class Node {
        Object value;//El objeto que va a contener el nodo
        Node next;//La referencia al siguiente nodo
        Node previous;//La referencia al antrior nodo
    }

    //pointer helpers
    private Node first;//Puntero en la primera posicion del nodo
    private Node last;//Puntero en la segunda posicion del nodo
    private int numNodes = 0;//El numero de nodos en total

    //Añade un objeto a la ultima posicion de los nodos
    public void append(Object o) {
        var nuevo = new Node();//Crea un nuevo nodo
        nuevo.value = o;//El valor del bojeto que contendra el nodo va a ser el valor del objeto "o" ingresado como parametro
        nuevo.previous = last;//El ultimo nodo apunta al ultimo nodo de la lista
        if (last != null) {//Revisa si la lista no esta vacia
            last.next = nuevo;//El ultimo nodo apunta al nuevo nodo
        } else {//La lista esta vacia
            first = nuevo;//El nuevo nodo va a ser el primero
        }
        last = nuevo;//El nuevo nodo va a ser el ultimo
        numNodes++;//Contador del numemro de nodos
    }

    //Añade un objeto en la primera posicion de los nodos
    public void prepend(Object o) {
        var nuevo = new Node();//Crea un nuevo nodo
        nuevo.value = o;//El valor del bojeto que contendra el nodo va a ser el valor del objeto "o" ingresado como parametro
        nuevo.next = first;//El nuevo nodo apunta al primer nodo en la lista
        if (first != null) {//Revisa si la lista no esta vacia
            first.previous = first;//El primer nodo apunta al nuevo nodo
        } else {//La lista esta vacia
            last = nuevo;//El nuevo nodo va a ser el ultimo
        }
        first = nuevo;//El nuevo nodo va a ser el primero
        numNodes++;//Contador del numero de nodos
    }

    //Elimina el nodo en la ultima posicion
    public void deleteLastNode() {
        if (last != null) {//La lista no esta vacia
            last = last.previous;//El anterior nodo pasa a ser el ultimo nodo
            numNodes--;//Elimina el que solia ser el ultimo nodo
        }
    }

    //Elimina el nodo en la primera posicion
    public void deleteFirstNode() {
        if (first != null) {//La lista no esta vacia
            first = first.next;//El siguiente nodo pasa a ser el primero
            numNodes--;//Elimina el que solia ser el primer nodo
        }
    }

    //Retorno del objeto que se encuentra en la primera posicion de la lista
    public Object valueFirstNode() {
        if (first != null) {//La lista no esta vacia
            return first.value;//Retorna el objeto del primer nodo
        }
        return null;
    }

    //Retorno del objeto que se encuentra en la ultima posicion de la lista
    public Object valueLastNode() {
        if (last != null) {//La lista no esta vacia
            return last.value;
        }
        return null;
    }

    //Retorna el numero de nodos de la lista
    public int size() {
        return numNodes;
    }

    //Elimina todos los nodos contenidos en la lista
    public void clear() {
        first = null;
        last = null;
        numNodes = 0;
    }

    //Metodo para mostrar todos los nodos almacenados en la lista
    public java.util.List<Object> toList() {
        var elements = new ArrayList();
        if (first != null) {
            var cursor = first;
            do {
                elements.add(cursor.value);
                cursor = cursor.next;
            } while (cursor != null);

        }
        return elements;
    }
}