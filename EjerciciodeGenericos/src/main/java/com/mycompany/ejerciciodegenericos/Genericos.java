/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciodegenericos;

import java.util.ArrayList;
import java.util.List;
import pack_ejecutable.Producto;

/**
 *
 * @author alvar
 */
public class Genericos<T extends Producto>  {
 List<T>lista;   
 
 public Genericos()
 {
 this.lista= new ArrayList<T>();
 }
 
 public Genericos(ArrayList<T>L)
 {
 this.lista= L;
 }
 
 
 public boolean EstaVacia()
 {
     if (this.lista.isEmpty()==true) 
     {
         return true;
     } else 
     {
         return false;
     }
 }
 
 public void añadir(T obj)
 {
 this.lista.add(obj);
 }
 
public T primero() {
    if (!lista.isEmpty()) {
        return lista.get(0);
    } else {
        throw new IllegalArgumentException("La lista está vacía.");
    }
}
 public T extraer() {
    T primerElemento = primero(); 
    lista.remove(0);             
    return primerElemento;         
}

    @Override
    public String toString() {
        return "Genericos{" + "lista=" + lista + '}';
    }

 
}
