package tareas;

import java.text.Normalizer;

public class Ejercicio3 {

    public static void main(String[] args) {
        String cadena = "El día de ayer, Margarita, Julia y Jorge salieron de excursión.";
        cadena = Normalizer.normalize(cadena, Normalizer.Form.NFD)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
        
        String[] arregloC = contarVocales(cadena);
        contarPalabras(cadena);
        reemplazarLetras(cadena);
        mostrarCadenaAlReves(arregloC);
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

    public static void contarPalabras(String cadena) {
        String[] palabras = cadena.split("\\s+");
        int cantidadPalabras = palabras.length;
        System.out.println("Cantidad de palabras: " + cantidadPalabras);
    }

    public static void reemplazarLetras(String cadena) {
        String cadenaReemplazada = cadena.replace('o', '$').replace('a', '@');
        System.out.println("Cadena con letras reemplazadas: " + cadenaReemplazada);
    }

    public static void mostrarCadenaAlReves(String[] arregloC) {
        StringBuilder cadenaAlReves = new StringBuilder();
        for (int i = arregloC.length - 1; i >= 0; i--) {
            cadenaAlReves.append(arregloC[i]);
        }
        System.out.println("Cadena al revés: " + cadenaAlReves.toString());
    }
}
