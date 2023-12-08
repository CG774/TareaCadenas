package tareas;

import java.text.Normalizer;


public class Ejercicio2 {

    public static void main(String[] args) {
        String cadena = "El día de ayer, Margarita, Julia y Jorge salieron de excursión.";
        cadena = Normalizer.normalize(cadena, Normalizer.Form.NFD)
                         .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        contarVocales(cadena);
    }
    public static String[] contarVocales(String cadenaT) {
        int a = 0, e = 0, i = 0, o = 0, u = 0, total = 0;
        String[] arregloCadena = cadenaT.split("");
        for (String s : arregloCadena) {
            if (s.equalsIgnoreCase("a")) {
                a++;
            } else if (s.equalsIgnoreCase("e")) {
                e++;
            } else if (s.equalsIgnoreCase("i")) {
                i++;
            } else if (s.equalsIgnoreCase("o")) {
                o++;
            } else if (s.equalsIgnoreCase("u")) {
                u++;
            }
        }

        total = a + e + i + o + u;

        System.out.println("El número de 'a' es igual a: " + a +
                "\nEl número de 'e' es igual a: " + e +
                "\nEl número de 'i' es igual a: " + i +
                "\nEl número de 'o' es igual a: " + o +
                "\nEl número de 'u' es igual a: " + u +
                "\nEl total de vocales es igual a: " + total);
        return arregloCadena;
    }
    
}
