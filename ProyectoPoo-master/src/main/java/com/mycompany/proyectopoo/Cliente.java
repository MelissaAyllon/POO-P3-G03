
package com.mycompany.proyectopoo;

public class Cliente extends Administrado{
    private int tipoCliente; //enum
    public Cliente(String nombre, String telefono, String direccion, int tipoCliente){
        super(nombre,telefono,direccion);
        this.tipoCliente = tipoCliente;

    }

    public int getTipoCliente() {
        return tipoCliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public boolean equals(int codigo){  // modificar
        return this.codigo == codigo;
    }
    
    
}
