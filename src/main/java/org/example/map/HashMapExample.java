package org.example.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put(null, "John");
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellido", "Roe");
        persona.put("email", "john.doe@mail.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);
        
        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);
    }
}
