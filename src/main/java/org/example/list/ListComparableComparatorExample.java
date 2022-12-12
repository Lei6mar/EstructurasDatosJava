package org.example.list;

import org.example.model.Alumno;

import java.util.*;

public class ListComparableComparatorExample {
    public static void main(String[] args) {
        List<Alumno> sa = new ArrayList<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Pato", 6));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luis", 4));
        sa.add(new Alumno("Pedro", 9));
        sa.add(new Alumno("Andres", 10));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 3));

//        Collections.sort(sa, (a,b) -> a.getNota().compareTo(b.getNota()));
//        sa.sort((a,b) -> a.getNota().compareTo(b.getNota()));
//        sa.sort(Comparator.comparing((Alumno a) -> a.getNombre()).reversed());
//        sa.sort(Comparator.comparing(Alumno::getNombre).reversed());
        sa.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println("sa = " + sa);

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);
    }
}
