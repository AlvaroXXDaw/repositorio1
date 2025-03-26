/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Excepciones;

/**
 *
 * @author ÁLVARO
 */
public class DuracionCDException extends Exception{
    
    
      public DuracionCDException()
    {
        super("Error, la duración de un CD no puede ser negativa o 0");
    }
        public DuracionCDException(String mensaje)
    {
        super(mensaje);
    }
}
