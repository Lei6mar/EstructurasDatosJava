package org.example.list;

import org.example.model.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Alumno> ar = new ArrayList<>();
        System.out.println(ar + "ar.size() = " + ar.size());
        System.out.println("Está vacía = " + ar.isEmpty() );
        ar.add(new Alumno("Pato", 5));
        ar.add(new Alumno("Pato", 6));
        ar.add(new Alumno("Cata", 6));
        ar.add(new Alumno("Luis", 4));
        ar.add(new Alumno("Pedro", 9));
        ar.add(2, new Alumno("Andres", 10));
        ar.set(1, new Alumno("Zeus", 2));

        System.out.println(ar + "ar.size() = " + ar.size());

        ar.remove(new Alumno("Andres", 10));
//        ar.remove(2);
        System.out.println(ar + "ar.size() = " + ar.size());

        boolean b = ar.contains(new Alumno("Pato", 5));
        System.out.println("La lista contiene a Jano = " + b);

        Object a[] = ar.toArray();
        for(int i=0; i<a.length; i++){
            System.out.println("Desde el arreglo = " + a[i]);
        }

    }
}
