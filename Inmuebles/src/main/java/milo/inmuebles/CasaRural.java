/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milo.inmuebles;

/**
 *
 * @author camil
 */
public class CasaRural extends Casa {
    
    protected static double valorArea  = 1500000;
    
    protected int distaciaCabera;
    
    protected int altitud;
    
    public CasaRural(int identificadorInmobiliario, int area, String direccion, int numeroHabitaciones, int numeroBaños, int numeroPisos, int distanciaCabera, int altitud) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBaños, numeroPisos);
        this.distaciaCabera=distanciaCabera;
        this.altitud=altitud;
    }
    
    void imprimir(){
        super.imprimir();
        System.out.println("Distancia a la cabecera municipal ="+numeroHabitaciones + " km");
        System.out.println("Altitud sobre el nivel del mar = "+ altitud + " metros.");
        System.out.println();
    }
    
}
