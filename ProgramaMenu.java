package programaMenu.java;

import java.util.Scanner;

public class ProgramaMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Concatenar dos palabras");
            System.out.println("2. Visualizar el número de palabras de una frase");
            System.out.println("3. Contar cuántas veces aparece una letra en una frase");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Funcionalidad 1 en desarrollo...");
                    System.out.print("Ingrese la primera palabra: ");
                    String palabra1 = scanner.nextLine();
                    System.out.print("Ingrese la segunda palabra: ");
                    String palabra2 = scanner.nextLine();
                    System.out.println("Resultado: " + palabra1 + palabra2);
                    break;
                case 2:
                    System.out.println("Funcionalidad 2 en desarrollo...");
                    System.out.print("Ingrese una frase: ");
                    String frase = scanner.nextLine();
                    String[] palabras = frase.trim().split("\\s+");
                    System.out.println("Número de palabras en la frase: " + palabras.length);
                    break;
                case 3:
                    System.out.println("Funcionalidad 3 en desarrollo...");
                    System.out.print("Ingrese una frase: ");
                    String frase2 = scanner.nextLine();
                    System.out.print("Ingrese la letra a buscar: ");
                    char letra = scanner.nextLine().charAt(0);
                    int contador = 0;

                    for (char c : frase2.toCharArray()) {
                        if (c == letra) {
                            contador++;
                        }
                    }
                    System.out.println("La letra '" + letra + "' aparece " + contador + " veces en la frase.");
                    break;
                case 4:
                    System.out.print("¿Está seguro de que desea salir? (s/n): ");
                    String confirmacion = scanner.nextLine();
                    if (confirmacion.equalsIgnoreCase("s")) {
                        salir = true;
                        System.out.println("¡Hasta luego!");
                    }
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }

        scanner.close();
    }

	}


