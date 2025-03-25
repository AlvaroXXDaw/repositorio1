/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Excepciones;

/**
 *
 * @author ÁLVARO
 */
public class AlquilarException extends Exception
{
    
    public AlquilarException()
    {
        super("Ërror, al intentar alquilar unproducto");
    }
        public AlquilarException(String mensaje)
    {
        super(mensaje);
    }
    
}
