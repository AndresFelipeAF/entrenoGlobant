/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesejercicio4.entities;

/**
 *
 * @author andre
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Double duracionHoras;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracionHoras) {
        this.titulo = titulo;
        this.director = director;
        this.duracionHoras = duracionHoras;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracionHoras(Double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Double getDuracionHoras() {
        return duracionHoras;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", duracionHoras=" + duracionHoras + '}';
    }
    
    
}
