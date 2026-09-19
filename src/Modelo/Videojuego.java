/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author guada
 */
public class Videojuego {
    
    private String titulo;
    private String genero;
    private double precio;
    
    public Videojuego(String titulo, String genero, double precio) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public double getPrecio() {
        return precio;
    }
    
}
