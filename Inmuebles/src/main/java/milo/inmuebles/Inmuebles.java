/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package milo.inmuebles;

/**
 *
 * @author camil
 */
public class Inmuebles {

    public static void main(String[] args) {
        ApartamentoFamiliar apto1=new ApartamentoFamiliar(103067,120,"Avenida Santander 45-45",3,2,200000);
        System.out.println("Datos apartamento");
        apto1.calcularPrecioVenta(apto1.valorArea);
        apto1.imprimir();
        System.out.println("Datos apartamento");
        Apartaestudio aptoestu1 = new Apartaestudio(12354,50,"Ävenida Caracas 30-15",1,1);
        aptoestu1.calcularPrecioVenta(aptoestu1.valorArea);
        aptoestu1.imprimir();
    }
}
