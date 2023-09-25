/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CuentaBancaria;

import java.util.Scanner;

/**
 *
 * @author Eduardo
 */
public class ControladorCuentaBancaria {
    public static void main(String[] args){
        /**codigo desabilitado
         * solo corre en interfaz
         */
        /*Scanner leer=new Scanner(System.in);
    
        int Cuenta=0,Password=0;
        String Nombre=null;
        double Deposito,Retiro,Saldo=0;
        int Opc = 0;
        boolean Secion=false;
        CuentaBancaria Cliente=new CuentaBancaria(Cuenta,Password,Nombre,Saldo);
        System.out.println("CREE SU CUENTA BANCARIA");
        System.out.println("Ingrese su nombre: ");
        Nombre=leer.nextLine();
        System.out.println("Ingrese su numero de cuenta: ");
        Cuenta=leer.nextInt();
        System.out.println("Ingrese su constraseña: ");
        Password=leer.nextInt();
        Cliente.Secion(Nombre,Cuenta,Password);  
        while(Secion != true){
            System.out.println("\nINICIO DE SECION, INGRESE LO QUE SE LE PIDE");
            System.out.println("Ingrese El numero de cuenta: ");
            Cuenta=leer.nextInt();
            System.out.println("Ingrese su contrasena: ");
            Password=leer.nextInt();
            if(Cliente.getCuenta()==Cuenta && Cliente.getPassword()==Password){
                System.out.println("--------------SECION EXITOSA------------------");
                System.out.println("BIENVENIDO "+Cliente.getNombre());
                System.out.println("ENTRANDO....");
                Secion=true;
                while(Opc!=4){
                    System.out.println("1.-DEPOSITAR");
                    System.out.println("2.-RETIRAR");
                    System.out.println("3.-CONSULTAR SALDO");
                    System.out.println("4.-Salir");
                    Opc=leer.nextInt();
                    if(Opc>=1&&Opc<=4){
                        switch(Opc){
                            case 1: System.out.println("-------------DEPOSITAR-------------");
                            System.out.println("Ingrese la cantidad que desea depositar");
                            Deposito=leer.nextDouble();
                            System.out.println("Usted deposito $"+Cliente.Depositar(Deposito));
                            
                            break;
                            case 2: System.out.println("-------------RETIRAR-------------");
                            System.out.println("Ingrese la cantidad que desee retirar");
                            Retiro=leer.nextDouble();
                            System.out.println("Usted retiro $"+Cliente.Retirar(Retiro));
                            break;
                            case 3: System.out.println("-------------CONSULTAR SALDO-------------");
                            System.out.println("Usted tiene de saldo $"+Cliente.ConsultarSaldo());
                            
                            break;
                            case 4: System.out.println("-------------SALIR-------------");
                            System.out.println("SALIENDO....");
                            Opc=4;
                            
                            break;}
                    }else{
                        System.err.println("Esa opcion no se encuentra en los parametros sugeridos, seleccione lo que se le indica.");
                    }
                }
            }else{
                System.err.println("El numero de cuenta o la contrasena no coinciden");
            }
        }*/
    }    
}
