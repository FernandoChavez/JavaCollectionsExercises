package org.fuerzadon.com.maps.textanalysis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TextAnalysis {

    private String texto;
    private Map<String, Integer> conteoPalabras = new HashMap<>();
    private Map<Character, Integer> conteoCaracteres = new HashMap<>();

   public TextAnalysis(String texto){
       this.texto=texto.toLowerCase();
       procesarTexto();;
   }

   private void procesarTexto(){

       // Divide por espacios o signos (no letras/dígitos)
       String [] palabras = texto.split("\\W+");
       for(String palabra : palabras){
           if(!palabra.isEmpty()){
               conteoPalabras.put(palabra, conteoPalabras.getOrDefault(palabra, 0 )+1);

           }
       }

       //procesar caracteres
       for(char c : texto.toCharArray()){
           if(Character.isLetter(c)){
               conteoCaracteres.put(c, conteoCaracteres.getOrDefault(c, 0)+1);
           }

       }
   }

   public void mostrarFrecuenciaPalabras(){
       for(Map.Entry<String, Integer> entry : conteoPalabras.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
   }

   public void mostrarFrecuenciaCaracteres (){
       for(Map.Entry<Character, Integer> entry : conteoCaracteres.entrySet()){
           System.out.println(entry.getKey() + " : " + entry.getValue());
       }
   }

   public String palabraMasFrecuente(){
       int max = Integer.MIN_VALUE;
       String word="";
       for(Map.Entry<String, Integer> entry : conteoPalabras.entrySet()){
           if(entry.getValue()>max){
               word=entry.getKey();
               max = entry.getValue();
           }
       }
       return word;
   }


   public List<String> palabrasUnicas(){
       List<String> unicas = new ArrayList<>();
       for(Map.Entry <String, Integer> entry : conteoPalabras.entrySet()){
           if(entry.getValue()==1){
               unicas.add(entry.getKey());
           }
       }
       return unicas;
   }

    public int buscarPalabras(String palabra){
       return conteoPalabras.getOrDefault(palabra, 0);
    }

}
