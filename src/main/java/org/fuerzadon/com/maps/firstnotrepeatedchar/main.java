package org.fuerzadon.com.maps.firstnotrepeatedchar;

public class main {
    public static void main(String[] args) {

        //Objetivo: Dada una cadena, encuentra el primer carácter que no se repite usando un HashMap.

        String texto = "swiss";
        String texto2 = "amsjtamsj";

        Character result = methods.firstNotRepeatedChar(texto2);

        if(result!= null){
            System.out.println("El primer caracter no repetido es: " + result);
        }else{
            System.out.println("Todos los caracteres se repiten");
        }
    }
}
