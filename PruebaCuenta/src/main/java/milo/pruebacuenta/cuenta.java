/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milo.pruebacuenta;

/**
 *
 * @author camil
 */
public class cuenta {
    protected float saldo; 
/* Atributo que define el número de consignaciones realizadas en 
una cuenta bancaria */
protected int numeroConsignaciones = 0;
// Atributo que define el número de retiros de una cuenta bancaria
protected int numeroRetiros = 0;
// Atributo que define la tasa anual de intereses de una cuenta bancaria
protected float tasaAnual;
/* Atributo que define la comisión mensual que se cobra a una 
cuenta bancaria */
protected float comisionMensual = 0;

public cuenta(float saldo, float tasaAnual) {
this.saldo = saldo;
this.tasaAnual = tasaAnual;
}

public void consignar(float cantidad) {
saldo = saldo + cantidad; 

numeroConsignaciones = numeroConsignaciones + 1;
}
public void retirar(float cantidad) {
float nuevoSaldo = saldo - cantidad;

if (nuevoSaldo >= 0) {
saldo -= cantidad;
numeroRetiros = numeroRetiros + 1;
} else {
System.out.println("La cantida a retirar excede el saldo actual.");
}
}
/**
* Método que calcula interés mensual de la cuenta a partir de la tasa 
* anual aplicada
*/
public void calcularInterés() {
float tasaMensual = tasaAnual / 12; /* Convierte la tasa anual en 
mensual */
float interesMensual = saldo * tasaMensual;
saldo += interesMensual; /* Actualiza el saldo aplicando el interés 
mensual */
}
/**
* Método que genera un extracto aplicando al saldo actual una 
* comisión y calculando sus intereses
*/
public void extractoMensual() {
saldo -= comisionMensual;
calcularInterés();
}

}
