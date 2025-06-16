
package com.mycompany.proyectopoo;
import java.util.Scanner;
import java.util.ArrayList;
public class Tecnico extends Personal{
    
    public Tecnico(String usuario, String contrasena, String nombre, Cargo cargo){
        super(usuario,contrasena,nombre,cargo);
    }
    
    @Override
    public void mostrarMenu(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Seleccione el número de la acción que desea realizar:");
      System.out.println("1. Generar orden de servicios.\n2. Reportar falta de insumos. \n3. Salir.");
      int opcion = sc.nextInt();
      sc.nextLine();
      
       //verificacion de uso de opcion correcta
       while(opcion < 1 && opcion > 3){
           System.out.println("Ingrese el número de una acción valida");
           opcion = sc.nextInt();
           sc.nextLine();
        }
       sc.close();
       
        // llamando los metodos correspondientes a las opciones
        switch(opcion){
          case 1 -> generarOrdenServicio();
          case 2 -> reportarInsumo();
          case 3 -> Sistema.logIn(); //que hace esto?
        }            
    }
    
    
    public void generarOrdenServicio(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el código del cliente");
        int codigoCliente = sc.nextInt();
        sc.nextLine();
        ArrayList<Cliente> clienteSistema = Sistema.getListaClientes();
        while(!clienteSistema.contains(codigoCliente)){ //
            System.out.println("Cliente no encontrado, asegurese de ingresar correctamente el codigo");
            codigoCliente = sc.nextInt();
            sc.nextLine();
        }
        int indice = clienteSistema.indexOf(codigoCliente); //
        Cliente cl = clienteSistema.get(indice);
        System.out.println("Ingrese fecha de realización del servicio, asegurese que tenga el siguiente formato: dd/mm/aaaa");
        String fecha = sc.nextLine();
        String[] listaFecha = fecha.split("/");
        System.out.println("Indique el número del tipo de vehículo: \n1- automóvil. \n2- motocicletas. \n3- bus.");
        int tipoVehiculo = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese la placa del vehículo, asegurese que tenga el formato AAA-999");
        String placa = sc.nextLine();
        int codigoServicio = 0;
        ArrayList<Servicio> serviciosHechos = new ArrayList<>();
        while(codigoServicio != -1){  
            System.out.println("Ingrese el código del servicio a realizar en el vehículo:");
            codigoServicio = sc.nextInt();
            sc.nextLine();
            ArrayList<Servicio> servicioSistema = Sistema.getListaServicios();
            if(servicioSistema.contains(codigoServicio)){ //
                int index = servicioSistema.indexOf(codigoServicio);
                 serviciosHechos.add(servicioSistema.get(index));
                 //pedir que ya no se desea agregar mas y sea igual a -1
                 System.out.println("Este es el ultimo servicio a ingresar, ingrese SI sino NO");
                 Scanner scan = new Scanner(System.in);
                 String resp = scan.nextLine().toUpperCase();
                 if (resp.equals("SI")){
                     codigoServicio = -1;
                }
                 scan.close();
                
            }
            else if(!servicioSistema.contains(codigoServicio)&& codigoServicio!= -1){
                System.out.println("Servicio no encontrado, escriba correctamente el codigo");
            }
            
            }
        double sumaContador =0;
        for (Servicio serv: serviciosHechos){
            sumaContador += serv.getPrecio();
        }
        System.out.println("Valor a pagar: " + sumaContador);
        OrdenServicio orden = new OrdenServicio(cl,this,listaFecha,placa,tipoVehiculo,serviciosHechos);
        sc.close(); /// en la anterior como sabe que es el this o no si solo quiero poner el tecnico con el user y contra 
        mostrarMenu();
    }
    
    
    public void reportarInsumo(){
        System.out.println("Ingrese lo que quiere reportar");
        Scanner sc = new Scanner(System.in);
        String reporte = sc.nextLine();
        System.out.println("¿Desea enviar un correo para notificar el reporte? Si es asi escriba la letra S, de lo contrario escriba N");
        String confirmacion = sc.nextLine();
        while(!confirmacion.equalsIgnoreCase("S") && !confirmacion.equalsIgnoreCase("N")){
            System.out.println("Ingrese una opcion valida");
            confirmacion = sc.nextLine();
        }
        boolean correo = false;
        if(confirmacion.toUpperCase().equals("S")){
            correo = true;
            System.out.println("Correo enivado");
        }
        
        Sistema.addReporte(new ReporteInsumos(this,reporte,correo));
        mostrarMenu();
        
    }
    
}
