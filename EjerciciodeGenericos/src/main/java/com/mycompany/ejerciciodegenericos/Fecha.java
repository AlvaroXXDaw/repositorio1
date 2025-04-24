/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pack_subclases;

/**
 *
 * @author Samilz
 */
public class Fecha {
 
    public int dia;
    public int mes;
    public int año;

    // Constructor por defecto
    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.año = 2000;
    }

    // Constructor con parámetros
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    // Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAño() {
        return año;
    }

    // Setters
    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAño(int año) {
        this.año = año;
    }

    // Método toString para mostrar la fecha
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + año;
    }
}


