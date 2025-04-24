/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack_ejecutable;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samilz
 */
public class Cliente {
    
    public String dni;
    public String nombre;
    public String apellidos;
    public ArrayList <Producto> productosAlquilados;
    
    
    
    public Cliente() {
     
     this.dni = "12345678A";
     this.nombre = "Nombre_Cliente";
     this.apellidos = "Apellidos_Cliente";
     this.productosAlquilados = new ArrayList();
   
     
     
 }
 
    public Cliente(String dni, String nombre, String apellidos) {
     
     this.dni = dni;
     this.nombre = nombre;
     this.apellidos = apellidos;
       this.productosAlquilados = new ArrayList();

 }
 
 
    public String getDNI(){
     return this.dni;
 }
 
    public void setDNI(String dni){
     this.dni = dni;
 }
 
    public String getNombre(){
     return this.nombre;
    
}

    public void setNombre(String nombre){
        this.nombre = nombre;
}

    public String getApellidpos() {
        return this.apellidos;
    
    }

    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }


    public void alquilarProducto(Producto producto) {
    
        if (!producto.estaAlquilado()) {
            producto.Alquilar();
            productosAlquilados.add(producto);
            System.out.println("Producto alquilado: " + producto.nombreprod);
        
      } else {
            System.out.println("El producto ya esta alquilado:" + producto.nombreprod);
        }
}
    
    public void devoverProducto (Producto producto){
        
        if (producto.estaAlquilado()) {
            
            producto.Devolver();
            productosAlquilados.remove(producto);
            System.out.println("Producto devuelto:" + producto.nombreprod);
            
        } else {
            System.out.println("El producto no estaba alquilado: " + producto.nombreprod);
        }

    }
    
    
    
    public double costoAlquiler() {
        
        double total = 0;
        
        for( Producto producto : productosAlquilados){
            
            total += producto.precioIVA();
        }
        return total;
        
    }
    
    
    public void mostrarProductosAlquilados() {
        
        for (Producto producto : productosAlquilados) {
            System.out.println("Lista de productos alquilados por el cliente: " + this.nombre);
            System.out.println("- " + producto.nombreprod + " (Precio con IVA:" + producto.precioIVA()+ " )");
        }
        
    }


    
    
    
    
    
    
    
    
}
