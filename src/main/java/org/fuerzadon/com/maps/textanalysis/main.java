package org.fuerzadon.com.maps.textanalysis;

public class main {
    public static void main(String[] args) {

        String texto = "Hola mundo hola mundo Java HashMap practica mundo";

        TextAnalysis analizador = new TextAnalysis(texto);

        analizador.mostrarFrecuenciaPalabras();
        analizador.mostrarFrecuenciaCaracteres();

        System.out.println("La palabra que mas se repite es: " + analizador.palabraMasFrecuente());
        System.out.println("Las palabras unicas son: "+analizador.palabrasUnicas());
        System.out.println("Las veces que se repite la palabra 'manzana' son: "+analizador.buscarPalabras("manzana"));

    }
}
