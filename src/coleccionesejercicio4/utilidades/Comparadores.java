/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejercicio4.utilidades;

import coleccionesejercicio4.entities.Pelicula;
import java.util.Comparator;

/**
 *
 * @author andre
 */
public class Comparadores {
    
    public static Comparator<Pelicula> ordenarPorDuracionDescendente = new Comparator <Pelicula> (){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t1.getDuracionHoras().compareTo(t.getDuracionHoras());        
        }
    
    };
    public static Comparator<Pelicula> ordenarPorDuracionAscendente = new Comparator <Pelicula> (){
        @Override
        public int compare(Pelicula t, Pelicula t1) {
           return t.getDuracionHoras().compareTo(t1.getDuracionHoras());        
        }
    
    };
    
    public static Comparator<Pelicula> ordenarPorTituloAlfabeticamente = new Comparator <Pelicula> () {
      
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getTitulo().compareTo(t1.getTitulo());
        }
    };
    
     public static Comparator<Pelicula> ordenarPorDirectorAlfabeticamente= new Comparator <Pelicula> () {
      
        @Override
        public int compare(Pelicula t, Pelicula t1) {
          return t.getDirector().compareTo(t1.getDirector());
        }
    };
}
