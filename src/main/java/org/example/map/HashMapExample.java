package org.example.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put(null, "John");
        persona.put("nombre", "John");
        persona.put("apellido", "Roe");
        persona.put("email", "john.doe@mail.com");
        persona.put("edad", "30");

        System.out.println("persona = " + persona);
        
        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

//        String apellidoPaterno = persona.remove("apellido");
        boolean b = persona.remove("apellido", "Roe");
        System.out.println("eliminado = " + b);
        System.out.println("persona = " + persona);


        boolean b2 = persona.containsKey("apellido");
        boolean b3 = persona.containsValue("30");
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);

        Collection<String> valores = persona.values();
        for(String valor: valores){
            System.out.println("valor = " + valor);
        }

        Set<String> llaves = persona.keySet();
        for(String llave : llaves){
            System.out.println("llave = " + llave);
        }

        for(Map.Entry<String, String> par: persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        for(String llave : persona.keySet()){
            String valor = persona.get(llave);
            System.out.println( llave +" = " + valor);
        }
        
        persona.forEach((llave, valor) -> {
            System.out.println( llave +" ===> " + valor);
        });
    }
}
