/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack_subclases;

import pack_ejecutable.Producto;

/**
 *
 * @author Samilz
 */
public class Videojuego extends Producto {
    
    public int numvideojuego;
    public String genero;
    public final double tipo_IVA =0.04; 

    
    public Videojuego () {
        
        numvideojuego = 0;
        genero = "genero";

    }
    
    
    public Videojuego(String nombre, int id, boolean alquilado, double precio, int numvideojuego, String genero) {
        super(nombre,id,alquilado,precio);
        this.numvideojuego = numvideojuego;
        this.genero = genero;
    }
    
   

    public int getNumvideojuego() {
        return numvideojuego;
    }

    public void setNumvideojuego(int numvideojuego) {
        this.numvideojuego = numvideojuego;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    
    @Override
    public double precioIVA () {
        
        return this.precio * (1+tipo_IVA);
        
    }
    
   
    @Override
    public String toString() {
        return super.toString() + " Videojuego{" + "numvideojuego=" + numvideojuego + ", genero=" + genero + " .El precio con IVA del 0,4% es de " + precioIVA();
    }
    
    
    
    
    
    
    
    
    
}
