
package Logica;

import java.util.Scanner;

/**
 *
 * @author fwscg
 */
public class CuentaBancaria {
    //Atributos de la clase
    private String cliente;//Nombre completo del cliente
    private String usuario;
    private int numeroCuenta;
    private double saldo;
    private String curp;
    private String correo; 
    private String password; 
        public static String nombreBanco= "PIZZERIA LALO'S";

    public CuentaBancaria(String cliente, String usuario, int numeroCuenta, double saldo, String curp, String correo, String password) {
        this.cliente = cliente;
        this.usuario = usuario;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.curp = curp;
        this.correo = correo;
        this.password = password;
    }
    public CuentaBancaria(){
  }
 //Procesos para realizar
    public void retirar(double cantidadRetiro){
    saldo=saldo-cantidadRetiro;
    }
    public void depositar(double cantidadDeposito){
    saldo=saldo+cantidadDeposito;
    }
    public double consultarSaldo(){
        return saldo;
    }
    //datos del cliente 
    public String nombreCliente(){
        return cliente;
    }
    public int numeroCuenta(){
        return numeroCuenta;
    }
    //procesos de interfaz en consola
    public void bienvenida(String cliente){
System.out.println("Bienvenido "+cliente+" a nuestro " + CuentaBancaria.nombreBanco );
        System.out.println(" ¿Qué acción desea realizar?");
        System.out.println("1.Consultar saldo");
        System.out.println("2.Retirar");
        System.out.println("3.Depositar");
        System.out.println("4.Salir");
    }
   public void procesosAccion(CuentaBancaria clienteX){//se crea un objeto cliente molde para realiza procesos
    Scanner entrada = new Scanner(System.in);
    
    boolean eleccionAccion =true;
    while (eleccionAccion){
        bienvenida(clienteX.nombreCliente());
        int eleccionProceso = entrada.nextInt();
    switch (eleccionProceso) 
        {
        case 1:
            System.out.println("Nombre del cliente: " + clienteX.nombreCliente() + "\t\tNumero de cuenta: " + clienteX.numeroCuenta());
            System.out.println("---------------------------------------------------------------");//Texto de ubicacion
            double consultaSaldo = clienteX.consultarSaldo();
            System.out.println("Total actual en la cuenta: $ " + consultaSaldo);
            System.out.println();
            break;
        case 2:
            System.out.println("Nombre del cliente: " + clienteX.nombreCliente() + "\t\tNumero de cuenta: " + clienteX.numeroCuenta());
            System.out.println("---------------------------------------------------------------");//Texto de ubicacion
            System.out.println("¿Cuánto desea retirar?");
            System.out.println("Total actual en la cuenta: $ " + clienteX.consultarSaldo());//se muestra su saldo al cliente antes de hacer un retiro
            double retiro = entrada.nextDouble();//se pide la cantidad de retiro
            System.out.println("Retiro exitosa");
            System.out.println("De su saldo actual usted retiro " + retiro);
            clienteX.retirar(retiro);//se realiza el retiro en su cuenta
            System.out.println("Su saldo actual es: " + clienteX.consultarSaldo());
            System.out.println();
        case 3:
            System.out.println("Nombre del cliente: " + clienteX.nombreCliente() + "\t\tNumero de cuenta: " + clienteX.numeroCuenta());
            System.out.println("---------------------------------------------------------------");//Texto de ubicacion
            System.out.println("¿Cuánto desea depositar?");
            System.out.println("Total actual en la cuenta: $ " + clienteX.consultarSaldo());//Se le muestra al cliente su saldo antes de hacer un deposito
            double deposito = entrada.nextDouble();//se pide la cantidad del deposito
            System.out.println("Transación exitosa");
            System.out.println("Usted deposito " + deposito);
            clienteX.depositar(deposito);//Se realiza el deposito en la cuenta
            System.out.println("Su saldo actual es: " + clienteX.consultarSaldo());
            System.out.println();
            break;
        case 4:
            eleccionAccion = false;        
            System.out.println("Saliendo...");
                    break;
        default:
            System.out.println("Digite un numero correcto (del 1 al 3)");
            break;
        }
    }
   }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public static String getNombreBanco() {
        return nombreBanco;
    }

    public static void setNombreBanco(String nombreBanco) {
        CuentaBancaria.nombreBanco = nombreBanco;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

 
   
}
