/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejercicio4.services;

import coleccionesejercicio4.entities.Pelicula;
import coleccionesejercicio4.utilidades.Comparadores;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ServicioPeliculas {
    Scanner read = new Scanner(System.in);
    ArrayList <Pelicula> listaPeliculas = new ArrayList();
    
    
    public void crearPelicula(){
        Pelicula p = new Pelicula();
        System.out.println("Ingresar titulo de pelicula");
        p.setTitulo(read.next());
        System.out.println("Ingresar director de la pelicula");
        p.setDirector(read.next());
        System.out.println("Ingresar duración de pelucla en horas");
        p.setDuracionHoras(read.nextDouble());
        
        agregarLista(p);
    }
    
    public void agregarLista(Pelicula p){
        listaPeliculas.add(p);
        
    }
    
    public void buclePeliculas(){
        String respuesta;
        do {
            crearPelicula();
            
            System.out.println("Desea crear otra pelicula?");
            
            respuesta = read.next();
            
        } while (!respuesta.equals("no")); 
    }
    
    public void mostrarPeliculas(){
        for (Pelicula val : listaPeliculas) {
            System.out.println(val.toString());
        }
    }
    
    public void mostrarPeliculasMayor1Hora(){
        for (Pelicula val : listaPeliculas) {
            if (val.getDuracionHoras()>1) {
                System.out.println(val.toString());
            }
        }
    }
           
    public void ordenarDuraciónDescendente(){
        Collections.sort(listaPeliculas,Comparadores.ordenarPorDuracionDescendente);
    }
    
     public void ordenarDuraciónAscendente(){
        Collections.sort(listaPeliculas,Comparadores.ordenarPorDuracionAscendente);
    }
     
     public void ordenarPorTitulo(){
         Collections.sort(listaPeliculas,Comparadores.ordenarPorTituloAlfabeticamente);
     }
     public void ordenarPorDirector(){
         Collections.sort(listaPeliculas, Comparadores.ordenarPorDirectorAlfabeticamente);
     }
    
   
    
}
