/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inversiones;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/*
 * @author andre
 */
public class Practica {
    String CoordenadaAjedrez;
    Integer PiezaAjedrez;
    
     public static void main(String[] args) {
         
         List <Integer> listaEnteros = new ArrayList();
         //Se utilizan variables Wrapper o envoltorios
         
         for(int iter = 0; iter < 21; iter += 2){
             listaEnteros.add(iter);
         }
         /*
         for(int iter = 0; iter < listaEnteros.size() ; iter ++){
             System.out.println(listaEnteros.get(iter));
         }
        */
         /*
        var iterador = listaEnteros.iterator ();         
        while (iterador.hasNext ()) {
        Integer entero = iterador.next();
        System.out.println (entero);
                }
          */
         Set<Integer > conjuntoEnteros = new HashSet();
         conjuntoEnteros.add(4);
         conjuntoEnteros.add(5);
         conjuntoEnteros.add(7);
         conjuntoEnteros.add(4); // no lo agrega por repetido
         /*
         System.out.println(conjuntoEnteros.size());
         System.out.println("");
         
         for(int iter: conjuntoEnteros){
             System.out.println(iter);
         }
         */
         
         /*
         Queue <Integer> colaEnteros = new PriorityQueue();
         
         colaEnteros.add(3);
         colaEnteros.add(7);
         colaEnteros.offer(11); //igual a add
         colaEnteros.add(9);
         colaEnteros.add(5);
         
         System.out.println(colaEnteros.size());
         System.out.println("*-*-*");
         
         //obtener un elemento del inicio cola:
         System.out.println(colaEnteros.poll());
         //obtener un elemento del final cola:
         System.out.println(colaEnteros.peek());
         */
         
         /*Los mapas permiten establecer una correspondencia entre pares de objetos:
            uno que actua como clave y el otro como valor de esa clave.*/
         
         //creamos un par de clave valor ambos de tipo string
          HashMap<String, String> capitalCities = new HashMap();
          
          //Adicionar elementos
          capitalCities.put("England", "London");
          capitalCities.put("Germany", "Berlin");
          capitalCities.put("Norway", "Oslo");
          capitalCities.put("USA", "Washington DC");
          
          //get nos permite obtener el valor de la clave (Y la clave como tal?)
          //System.out.println(capitalCities.get("Germany"));
          
          //Remover un item
          //capitalCities.remove("England");
          //capitalCities.clear();
          
          //Tamaño del map
          capitalCities.size();
          
          /*Loop Through a HashMap
            Loop through the items of a HashMap with a for-each loop.
            Note: Use the keySet() method if you only want the keys, and 
            use the values() method if you only want the values:*/
          /*
          for (String i : capitalCities.keySet()) { //por que el iterador es un string?
                System.out.println(i);
          }
          for (String i : capitalCities.values()) {
                System.out.println(i);
          }
          System.out.println(capitalCities.keySet());
          System.out.println(capitalCities.values());
          
          //contiene?
          System.out.println(capitalCities.containsKey("Colombia"));         
          System.out.println(capitalCities.containsValue("London"));    
          */
          
          /*          
          //Excepciones
          int [] array = new int [20]; //especificamos su tamaño
                try {
                    array[ 3] = 24;
                    int b = 0;
                    int a = 23/b;
                } 
                catch(ArrayIndexOutOfBoundsException | ArithmeticException ex) {
                System.out.println ("Error de índice en un array");}
          */
          System.out.print("Hemos realizado un cambio 01");
          
          
          
          
                 
          
          
          
          
         
     }
    
}
