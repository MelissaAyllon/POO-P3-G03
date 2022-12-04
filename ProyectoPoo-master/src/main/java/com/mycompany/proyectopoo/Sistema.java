package com.mycompany.proyectopoo;
import java.util.ArrayList;
import java.util.Scanner;

  public class Sistema {
    private static ArrayList<Personal> listaUsuarios = new ArrayList<>();
    private static ArrayList<Cliente> listaClientes = new ArrayList<>();
    private static ArrayList<Servicio> listaServicios = new ArrayList<>();
    private static ArrayList<Proveedor> listaProveedores = new ArrayList<>();
    private static ArrayList<OrdenServicio> listaOrdenes = new ArrayList<>();
    private static ArrayList<ReporteInsumos> listaReportes = new ArrayList<>();
    

    
    public void inicializarSistema(){
      //creacion de los objetos personal
      listaUsuarios.add(new Admin("admin1","12345678","Administrador",Cargo.ADMIN));
      listaUsuarios.add(new Tecnico("alopez","al123456","Alvaro Lopez",Cargo.TECNICO));
      listaUsuarios.add(new Cobranza("mcastro","mc123456","Maria Castro",Cargo.COBRANZA));
      listaUsuarios.add(new Tecnico("mbarcos","mb123456","Mario Barcos",Cargo.TECNICO));
      
      //creacion de objetos cliente
      
      //creacion de objetos servicio
      
      //creacion de objetos proveedores
      
      //creacion de objetos ordene de servicio
      
      //creacion de objetos reporte de insumos
      
    }
    
    
    
    public static boolean logIn(){
      boolean registrado = false;
      while(!registrado){
        System.out.println("Ingrese usuario: ");
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        
        System.out.println("Ingrese contrasena: ");
        String contra = sc.nextLine();
        
            
        }
      return
    }

    public static ArrayList<Personal> getListaUsuarios() {
        return listaUsuarios;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public static void addCliente(Cliete c){
        listaClientes.add(c);
    }

    public static ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }
    
    public static void setPrecioServicio(int indice, double nuevoPrecio){
        Servicio servCamb = listaServicios.get(indice);
        servCamb.setPrecio(nuevoPrecio);
        listaServicios.add(indice,servCamb);
    }

    
   
    public static void addServicio(Servicio s){
        listaServicios.add(s);
    }
    
    public static ArrayList<Proveedor> getListaProveedores() {
        return listaProveedores;
    }

    public static void addProveedor(Proveedor p){
        listaProveedores.add(p);
    }
    
    public static ArrayList<OrdenServicio> getListaOrdenes() {
        return listaOrdenes;
    }

    public static void addOrdenServicio(OrdenServicio o){
        listaOrdenes.add(o);
    }
    
    public static ArrayList<ReporteInsumos> getListaReportes() {
        return listaReportes;
    }
    
    public static void addReporte(ReporteInsumos r){
        listaReportes.add(r);
    }
  }
    
