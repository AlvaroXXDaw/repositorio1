/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack_ejecutable;

import pack_Interfaces.Alquilable;

/**
 *
 * @author Samilz
 */
public abstract class Producto implements Alquilable {
    
    public String nombreprod;
    public int idprod;
    public boolean alquilado;
    public double precio;

    
    public Producto () {
        
        nombreprod = "Producto";
        idprod = 0;
        alquilado = true;
        precio = 0.0;
        
    }
    
    public Producto (String nombre, int id, boolean alquilado, double precio) {
       
        this.nombreprod = nombre;
        this.idprod = id;
        this.alquilado = alquilado;
        this.precio = precio;
        
    }
    
 
    public void Alquilar(){
        
        if (alquilado == false)
            this.alquilado = true;
 
        
    }
    
   
    public void Devolver() {
    
        if (alquilado == true) 
            this.alquilado =false;

    }
    
    
   
    public boolean estaAlquilado(){
        
        return alquilado;
    }
    
  
 
    public String getNombreprod() {
        return nombreprod;
    }

    public void setNombreprod(String nombreprod) {
        this.nombreprod = nombreprod;
    }

    public int getIdprod() {
        return idprod;
    }

    public void setIdprod(int idprod) {
        this.idprod = idprod;
    }

    public boolean isAlquilado() {
        return alquilado;
    }

    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public double precioIVA() {
        
        return this.precio;
        
    }
}
