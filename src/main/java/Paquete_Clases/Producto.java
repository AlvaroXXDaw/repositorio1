/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Clases;

import Paquet_Interfaces.Alquilable;
import Paquet_Interfaces.Retirable;

/**
 *
 * @author ÁLVARO
 */
public abstract class Producto implements Alquilable,Retirable{
    public int id;
    public String Nombre;
    public double Precio;
    public static int contProductos=0;
    public boolean alquilado;
    public boolean retirado;
    
    public Producto(String nombre)
    {
    contProductos++;
    this.Precio=0;
    this.id=contProductos;
    
    }

    public Producto(int id, String Nombre, double Precio, boolean alquilado, boolean retirado) {
        this.id = id;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.alquilado = alquilado;
        this.retirado = retirado;
    }
    
       
    public static int getContProductos()
    {
    return contProductos;
    }
    
    public abstract double getPrecio();
    
    public int getId()
    {
    return this.id;
    }
     public String getNombre()
    {
    return this.Nombre;
    }
     
     public void setNombre(String Nom)
     {
     this.Nombre=Nom;
     }
    
     
     
     public void devolver()
     {
     this.alquilado=false;    
     }
     
     public boolean isAlquilado()
     {
     return this.alquilado;
     }
     
      public void retirar()
      {
          if (this.alquilado==false && this.retirado==false) 
          {
          this.retirado=true;
          contProductos--;
          } else if (alquilado==true) 
          {
              System.out.println("Producto ya alquilado");    
          } else if (this.retirado==true) 
          {
              System.out.println("producto retirado");    
          }
      }
public boolean isRetirado()
{
return this.retirado;
}


}
