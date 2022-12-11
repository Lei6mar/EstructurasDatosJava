package org.example.set;

import org.example.model.Alumno;

import static java.util.Comparator.comparing;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetComparableExample {

    public static void main(String[] args) {
//        Set<Alumno> sa = new TreeSet<>((a,b) -> b.getNombre().compareTo(a.getNombre()));
        Set<Alumno> sa = new TreeSet<>(comparing(Alumno::getNota).reversed());
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luis", 4));
        sa.add(new Alumno("Pedro", 9));
        sa.add(new Alumno("Andres", 10));
        sa.add(new Alumno("Zeus", 2));

        System.out.println("sa = " + sa);
    }
}
