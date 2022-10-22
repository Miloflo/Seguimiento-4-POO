/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package milo.inmuebles;

/**
 *
 * @author camil
 */
public class Local extends Inmueble{
    
    enum tipo {INTERNO,CALLE};
    
    protected tipo tipoLocal;
    public Local(int identificadorInmobiliario, int area, String direccion, tipo tipoLocal) {
        super(identificadorInmobiliario, area, direccion);
        this.tipoLocal=tipoLocal;
    }
    void imprimir(){
        super.imprimir();
        System.out.println("Tipo de local = "+tipoLocal);
    }
}
