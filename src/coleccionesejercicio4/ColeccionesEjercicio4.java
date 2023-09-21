/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejercicio4;

import coleccionesejercicio4.services.ServicioPeliculas;

/**
 *
 * @author andre
 */
public class ColeccionesEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ServicioPeliculas sp = new ServicioPeliculas();
        
        sp.buclePeliculas();
        sp.mostrarPeliculas();
        System.out.println("lsita mayores a 1 hora");
        sp.mostrarPeliculasMayor1Hora();
        System.out.println("lista ordenada ascendente");
        sp.ordenarDuraciónAscendente();
        sp.mostrarPeliculas();
        System.out.println("lista acomodado por duracion descendente");
        sp.ordenarDuraciónDescendente();
        sp.mostrarPeliculas();
        System.out.println("lista acomodado por director");
        sp.ordenarPorDirector();
        sp.mostrarPeliculas();
        System.out.println("lista acomodado por titulo");
        sp.ordenarPorTitulo();
        sp.mostrarPeliculas();
        
    }
    
}
