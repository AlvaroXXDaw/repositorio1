/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete_Subclases;
import Paquet_Interfaces.Vendible;
import Paquete_Clases.Producto;
import Paquete_Excepciones.AlquilarException;
import Paquete_Excepciones.DuracionPeliculaException;
/**
 *
 * @author ÁLVARO
 */
public class Pelicula extends Producto implements Vendible
{
private static int contPeliculas=0;
    public String idioma;
    public double duracion;
    public String genero;
    private boolean vendido = false;

public Pelicula(Pelicula x)
{
    super(x.Nombre);
this.Nombre= x.Nombre;
    this.Precio=x.Precio;
    this.idioma=x.idioma;
    contPeliculas++;
}
    public Pelicula(String idioma, double duracion, String genero, String nombre) {
        super(nombre);
        this.idioma = idioma;
       this.setDuracion(duracion);
        this.genero = genero;
      
        contPeliculas++;
    }






    public static int getContPeliculas() {
        return contPeliculas;
    }

    public static void setContPeliculas(int contPeliculas) {
        Pelicula.contPeliculas = contPeliculas;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double dur) {
        try {
            if (dur<=0) 
            {
                throw new DuracionPeliculaException("Error");
            } else 
            {
                   this.duracion = duracion;
            }
        } catch (DuracionPeliculaException e) 
        {System.out.println("Numero menor de 0");
        }
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    public double getPrecio()
{
return 2;

}

    @Override
    public String toString() {
        return "Pelicula{" + "idioma=" + idioma + ", duracion=" + duracion + ", genero=" + genero + '}';
    }
     public void alquilar() throws AlquilarException
     {
         if (this.isAlquilado()) 
         {
             System.out.println("Ya esta alquilada");    
         }
        else if (this.isRetirado()) 
         {
             System.out.println("esta retirada");    
         }
       else 
        { this.alquilado=true;}
     }

    @Override
    public void vender(int precio) {
        if (!this.vendido) 
        {
        this.vendido=true;
        contPeliculas--;
        }
 // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isVendido() {
        return this.vendido; 
    }
     
     
     
  
    
    public enum Idiomas {
    ESPAÑOL, INGLES, FRANCES, ALEMAN
}

public enum GeneroPelis {
    ACCION, COMEDIA, DRAMA, TERROR, CIENCIA_FICCION
}


}
