/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Paquet_Interfaces;
import Paquete_Excepciones.AlquilarException;
/**
 *
 * @author ÁLVARO
 */
public interface Alquilable 
{
 public void alquilar() throws AlquilarException;
public void devolver();
public boolean isAlquilado();
    
}
