
package com.mycompany.proyectopoo.Administrable;

public class Proveedor extends Administrado{
    
    public Proveedor(String nombre, String telefono, String direccion){
        super(nombre,telefono,direccion);
        
    } 
    
    public String toString(){
        return (codigo +" "+nombre + " "+ direccion+ " "+ telefono);
    }
}
