/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author ST.TECMOBILE
 */
public class CuentaBancaria {
    //ATRIBUTOS
    String nombre, apellido, tipocuenta;
    double saldo; 
//CONSTRUCTOR VACIO 
    public CuentaBancaria() {
    }
    

    public CuentaBancaria(String nombre, String apellido, String tipocuenta, double saldo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipocuenta = tipocuenta;
        this.saldo = saldo;
    }
    //METODOS
    public void depositar(double monto){
        saldo = saldo + monto;
        System.out.println("El deposito Fue exitos. Nuevo Saldo$" + saldo);
    }
    public void retirar(double monto){
        if(monto <= saldo){
            saldo = saldo - monto;
            System.out.println("El retiro Fue exitos. Nuevo Saldo$" + saldo);        
        }else{
            System.out.println("Saldo insuficiente!!");
        }
    }
    public void mostrarSaldo(){
        System.out.println("========DATOS CUENTA BANCARIA======");
        System.out.println("Nombre del titular:" + nombre + apellido);
        System.out.println("Saldo: $" + saldo);
    }
}
