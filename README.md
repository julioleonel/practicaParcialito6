# practicaParcialito6
ejercicios de practica para el parcialito

# Enunciado

    ingresar palabras por argumentos y contar cuantas vocales tiene

# Codigo

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

# Teoria 

    palabra = palabra.toLowerCase(); 
Sirve para considerar mayusculas y minusculas


    char caracter = palabra.charAt(i);
 charAt es un método que permite acceder a caracteres individuales dentro de una cadena de caracteres (String).

 # Terminal (argumentos 'hola como andas')

     La palabra 'hola' tiene 2 vocales.
    La palabra 'como' tiene 2 vocales.
    La palabra 'andas' tiene 2 vocales.



