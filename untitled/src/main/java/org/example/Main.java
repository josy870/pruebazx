package org.example;
import java.util.Arrays;

public class Main {
    public static boolean sonAnagramas(String palabra1, String palabra2) {
        // Eliminar espacios y convertir a minúsculas para una comparación consistente
        String str1 = palabra1.replaceAll("\\s", "").toLowerCase();
        String str2 = palabra2.replaceAll("\\s", "").toLowerCase();

        // Si las longitudes son diferentes, no pueden ser anagramas
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convertir las cadenas a arreglos de caracteres
        char[] array1 = str1.toCharArray();
        char[] array2 = str2.toCharArray();

        // Ordenar los arreglos de caracteres
        Arrays.sort(array1);
        Arrays.sort(array2);

        // Comparar los arreglos ordenados
        return Arrays.equals(array1, array2);
    }

    public static void main(String[] args) {
        String palabraA = "congreso";
        String palabraB = "sogrecon";

        if (sonAnagramas(palabraA, palabraB)) {
            System.out.println("'" + palabraA + "' y '" + palabraB + "' son anagramas.");
        } else {
            System.out.println("'" + palabraA + "' y '" + palabraB + "' no son anagramas.");
        }
    }
}
