/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquete_Excepciones;

/**
 *
 * @author ÁLVARO
 */
public class NoMas50ProductosVideoClubException extends Exception{
    
    
       public NoMas50ProductosVideoClubException()
    {
        super(" Error,el Video Club no puede tener más de 50 productos");
    }
        public NoMas50ProductosVideoClubException(String mensaje)
    {
        super(mensaje);
    }
    
}
