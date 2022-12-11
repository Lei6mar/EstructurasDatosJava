package org.example.set;

import org.example.model.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class HashSetUnicidadExample {
    public static void main(String[] args) {
        Set<Alumno> sa = new TreeSet<>();
        sa.add(new Alumno("Pato", 5));
        sa.add(new Alumno("Pato", 6));
        sa.add(new Alumno("Cata", 6));
        sa.add(new Alumno("Luis", 4));
        sa.add(new Alumno("Pedro", 9));
        sa.add(new Alumno("Andres", 10));
        sa.add(new Alumno("Zeus", 2));
        sa.add(new Alumno("Zeus", 3));

        System.out.println("sa = " + sa);
    }
}
