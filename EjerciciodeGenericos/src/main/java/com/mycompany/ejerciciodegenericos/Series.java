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
public class Series extends Producto {
    
    public int numSerie;
    public Fecha fecha_serie;
    public String genero;
    public final double tipo_IVA = 0.10;
    
    public Series () {
        
        numSerie = 0;
        fecha_serie = new Fecha (0,0,0);
        genero = "Genero";
        
    }
    
    public Series (String nombre, int id, boolean alquilado, double precio, int numSerie, Fecha newFecha, String genero) {
  
        super(nombre,id,alquilado,precio);
        this.numSerie = numSerie;
        this.fecha_serie = newFecha;
        this.genero = genero;
       
    }

    public int getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public Fecha getFecha_serie() {
        return fecha_serie;
    }

    public void setFecha_serie(Fecha fecha_serie) {
        this.fecha_serie = fecha_serie;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

   
    
    @Override
    public double precioIVA() {
        
        return this.precio * (1 + tipo_IVA); 
        
    }
    
    
    
    
    public void Verdatos() {
        
        System.out.println("SEIRE");
        System.out.println("Nombre : " + this.nombreprod);
        System.out.println("ID: " + this.idprod);
        System.out.println("Fecha de lanzamiento: " + this.fecha_serie);
        System.out.println("Precio: " + this.precio + "$" + " Precio con IVA: " + precioIVA());
        System.out.println("Alquilada: " + this.alquilado);
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
}
