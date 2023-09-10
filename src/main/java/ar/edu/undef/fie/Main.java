package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No se proporcionaron palabras como argumentos.");
            return;
        }

        for (String palabra : args) {
            int contadorVocales = 0;
            palabra = palabra.toLowerCase(); // Convertir la palabra a minúsculas para considerar todas las vocales.

            for (int i = 0; i < palabra.length(); i++) {
                char caracter = palabra.charAt(i);
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    contadorVocales++;
                }
            }

            System.out.println("La palabra '" + palabra + "' tiene " + contadorVocales + " vocales.");
        }
    }
}
