package org.fuerzadon.com.maps.hasduplicates;

public class main {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 2, 3, 7};
        int[] numeros2 = {1,2,3,4,5,6,7};
        int[] numeros3 = {1};
        int[] numeros4 = {5,5,5,5,5,5,5,5,5,5};

        System.out.println("El array "+numeros+" tiene valores repetidos? "+ methods.hasDuplicates(numeros));
        System.out.println("El array "+numeros2+" tiene valores repetidos? "+ methods.hasDuplicates(numeros2));
        System.out.println("El array "+numeros3+" tiene valores repetidos? "+ methods.hasDuplicates(numeros3));
        System.out.println("El array "+numeros4+" tiene valores repetidos? "+ methods.hasDuplicates(numeros4));
    }
}
