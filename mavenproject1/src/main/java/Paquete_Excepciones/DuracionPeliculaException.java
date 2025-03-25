/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Excepciones;

/**
 *
 * @author ÁLVARO
 */
public class DuracionPeliculaException extends Exception{
    
    
      public DuracionPeliculaException()
    {
        super("Error, la duración de una Pelicula no puede ser negativa o 0");
    }
        public DuracionPeliculaException(String mensaje)
    {
        super(mensaje);
    }
}