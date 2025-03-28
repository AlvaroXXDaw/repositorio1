/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_Subclases;

import Paquete_Clases.Producto;
import Paquete_Excepciones.AlquilarException;
import Paquete_Excepciones.DuracionCDException;

/**
 *
 * @author ÁLVARO
 */
public class cd extends Producto{
 public static int contCD;
 public int duracion;
 public String genero;

    public cd() {
    }

    public cd(int duracion, String genero,String nombre,int id, String Nombre, double Precio, boolean alquilado, boolean retirado) 
    {
     super( id,  Nombre,  Precio,  alquilado,  retirado);       
        this.setDuracion(duracion);
        this.genero = genero;
    }

    public cd(cd c) {
        super(c.id,c.Nombre,c.Precio,c.alquilado,c.retirado);
        
       this.setDuracion(c.duracion);
        this.genero=c.genero;
    }

    public cd(int id, String Nombre, double Precio, boolean alquilado, boolean retirado) {
        super(id, Nombre, Precio, alquilado, retirado);
    }

    public double getPrecio()
{
return 1;
}
    
    public static int getNumcd()
    {
    return contCD;
    }
 
    public int getDuracion()
    {
    return this.duracion;
    
    }
  public String getGenero()
  {
  return this.genero;
  
  }

    public void setDuracion(int duracion) {
       
        try {
            if (duracion<=0) 
        {
        throw new DuracionCDException();    
        } else 
            {
                this.duracion=duracion;
        }
        } catch (Exception e) {System.out.println("Error general"); this.duracion=1;
        }
        
        
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        super.toString();
        return "cd{" + "duracion=" + duracion + ", genero=" + genero + '}';
    }

    @Override
    public void alquilar() throws AlquilarException {
        if (this.isAlquilado()) 
         {
             System.out.println("Ya esta alquilada");    
         }
        else if (this.isRetirado()) 
         {
             System.out.println("esta retirada");    
         }
       else 
        { this.alquilado=true;} // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 
    
    
    
    
    
    

}
