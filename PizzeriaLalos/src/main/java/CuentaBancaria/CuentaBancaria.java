/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaBancaria;

/**
 *
 * @author Eduardo
 */
public class CuentaBancaria {
    private String Nombre,Cuenta,Password;
    private double Saldo;

    public CuentaBancaria() {
    }
    
    public CuentaBancaria(String Cuenta, String Password, String Nombre, double Saldo) {
        this.Cuenta = Cuenta;
        this.Password = Password;
        this.Nombre=Nombre;
        this.Saldo = Saldo;
    }
    public void Secion(String Nombre,String Cuenta,String Password){
        this.Nombre=Nombre;
        this.Cuenta=Cuenta;
        this.Password=Password;
    }
    public String getNombre(){
        return Nombre;
    }
    
    public String getCuenta(){
        return Cuenta;
    }
    
    public String getPassword(){
        return Password;
    }
    public double Retirar(double Retiro){
        this.Saldo-=Retiro;
        return Retiro;
    }
    
    public double Depositar(double Depositar){
        this.Saldo+=Depositar;
        return Depositar;
    }
    
    public double ConsultarSaldo(){
     return Saldo;
    }
}
