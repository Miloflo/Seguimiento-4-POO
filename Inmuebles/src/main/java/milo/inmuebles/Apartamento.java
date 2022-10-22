/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milo.inmuebles;

/**
 *
 * @author camil
 */
public class Apartamento extends InmuebleVivienda {
    
    public Apartamento(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños) {
        
        
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños);
    }
    void imprimir(){
        super.imprimir();
    }
}
