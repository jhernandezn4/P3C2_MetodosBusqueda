package org.umg;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] arreglo = { 2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
        int elemento = 14;
        int indiceBusquedaBinaria = busquedaBinaria(arreglo, elemento);
        int indiceBusquedaSecuencial=busquedaSecuencial(arreglo,elemento);


        System.out.println(String.format("El %s según la busqueda binaria se encuentra en el indice %s",elemento,indiceBusquedaBinaria));
        System.out.println(String.format("El %s según la busqueda secuencial se encuentra en el indice %s",elemento,indiceBusquedaSecuencial));

    }
    public static int busquedaBinaria(int[] arreglo, int elemento) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;
        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;
            if (arreglo[medio] == elemento) {
                return medio;
            }
            if (arreglo[medio] < elemento) {
                izquierda = medio + 1;
            }
            else {
                derecha = medio - 1;
            }
        }
        return -1;
    }
    public static int busquedaSecuencial(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

}