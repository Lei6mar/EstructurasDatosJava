package org.example.set;

import org.example.model.Alumno;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Alumno> enlazada = new LinkedList<>();
        System.out.println(enlazada + "ar.size() = " + enlazada.size());
        System.out.println("Está vacía = " + enlazada.isEmpty() );
        enlazada.add(new Alumno("Pato", 5));
        enlazada.add(new Alumno("Pato", 6));
        enlazada.add(new Alumno("Cata", 6));
        enlazada.add(new Alumno("Luis", 4));
        enlazada.add(new Alumno("Pedro", 9));
        enlazada.add( new Alumno("Andres", 10));
        enlazada.add( new Alumno("Zeus", 2));

        System.out.println(enlazada + "ar.size() = " + enlazada.size());

        enlazada.addFirst(new Alumno("Zeuz", 5));
        enlazada.addLast(new Alumno("Atenea", 6));

        System.out.println(enlazada + "ar.size() = " + enlazada.size());

        System.out.println("Primero -->"+enlazada.getFirst());
        System.out.println("Primero -->"+enlazada.peekFirst());
        //get lanza excepción en caso de estar vacía la lista
        System.out.println("Ultimo -->"+enlazada.getLast());
        //peek no lanza excepcion en caso de estar vacía la lista
        System.out.println("Ultimo -->"+enlazada.peekLast());
        System.out.println("Indice 2 -->"+enlazada.get(2));

        Alumno zeus = enlazada.pop();
//        enlazada.removeLast();
        //poll elimina, no lanza excepción en caso de estar vacía
//        enlazada.pollFirst();
        enlazada.addLast(zeus);
        System.out.println("indez of Zeuz = " + enlazada.indexOf(zeus));

        enlazada.remove(2);

        enlazada.set(0, new Alumno("Lalo", 7));
        System.out.println(enlazada + "ar.size() = " + enlazada.size());
    }
}
