package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nombres = new String[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre de la persona " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
        }

        // Mostrar los valores guardados
        System.out.println("\nValores guardados en el array:");
        int j = 0;
        while (j < nombres.length) {
            System.out.println(nombres[j]);
            j++;
        }

        // Mostrar el tamaño del array
        System.out.println("\nTamaño del array: " + nombres.length);

        // Solicitar al usuario que ingrese el índice de un elemento a eliminar
        byte indiceAEliminar;
        do {
            System.out.print("\nIngrese el índice del elemento a eliminar [0, 4]: ");
            indiceAEliminar = scanner.nextByte();
        } while (indiceAEliminar < 0 || indiceAEliminar >= nombres.length);

        // Eliminar el elemento del arreglo y realizar desplazamientos si es necesario
        for (int i = (int) indiceAEliminar; i < nombres.length - 1; i++) {
            nombres[i] = nombres[i + 1];
        }
        nombres[nombres.length - 1] = null;

        // Mostrar nuevamente el arreglo
        System.out.println("\nArreglo después de eliminar el elemento:");
        for (String nombre : nombres) {
            if (nombre != null) {
                System.out.println(nombre);
            }
        }

        scanner.close();
    }
}
