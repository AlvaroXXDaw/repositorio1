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
public class Pelicula extends Producto {
    
    public int num_Pelicula;
    public String genero;
    public Fecha fecha_Pelicula;
    public int duracion;
    public final double tipo_IVA = 0.21;
    
    
    public Pelicula () {
        
        this.num_Pelicula = 0;
        this.genero = "genero";
        this.fecha_Pelicula = new Fecha (0,0,0);
        this.duracion = 90;
       
    }
    
    public Pelicula (String nombre, int id, boolean alquilado, double precio, int numPelicula ,Fecha fechanew, int duracion,String genero) {
       
        super(nombre, id, alquilado, precio);
        this.num_Pelicula = numPelicula;
        this.genero = genero;
        this.fecha_Pelicula = fechanew;
        this.duracion = duracion;
    }

    public int getNum_Pelicula() {
        return num_Pelicula;
    }

    public void setNum_Pelicula(int num_Pelicula) {
        this.num_Pelicula = num_Pelicula;
    }

    public Fecha getFecha_Pelicula() {
        return fecha_Pelicula;
    }

    public void setFecha_Pelicula(Fecha fecha_Pelicula) {
        this.fecha_Pelicula = fecha_Pelicula;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    
    @Override
    public double precioIVA() {
        
        return precio * (1+tipo_IVA);
        
    }
    

    
    public void Verdatos() {
        
        System.out.println("Peliculas");
        System.out.println("----------------");
        System.out.println("Nombre: " + this.nombreprod);
        System.out.println("Genero: " + this.genero);
        System.out.println("Duracion: " + this.duracion);
        System.out.println("Fecha de salida: " + this.fecha_Pelicula);
        System.out.println("Precio sin IVA: " + this.precio + "$ " + "Precio con IVA: " + precioIVA());
        System.out.println("Alquilada: " + this.alquilado);
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
