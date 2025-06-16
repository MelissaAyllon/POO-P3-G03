
package com.mycompany.proyectopoo;

import java.util.ArrayList;
import java.util.List;

public class OrdenServicio {
    private String[] fecha = new String[3];
    private int tipoVehiculo;
    private String placaVehiculo;
    private Cliente cliente;
    private Tecnico tecnico;
    private ArrayList<Servicio> listaServiciosRealizados;
    
    public OrdenServicio(Cliente cliente, Tecnico tecnico, String[] fecha, String placaVehiculo, int tipoVehiculo, List<Servicio> listaServiciosRealizados){
        this.cliente = cliente;
        this.tecnico = tecnico;
        this.fecha = fecha;
        this.placaVehiculo = placaVehiculo;
        this.tipoVehiculo = tipoVehiculo;
        this.listaServiciosRealizados =listaServiciosRealizados;
    }

    public String[] getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public List<Servicio> getListaServiciosRealizados() {
        return listaServiciosRealizados;
    }
    
    public boolean equals(int codigo, String[] fechaIns){  /// no creo que ste bien
        if(cliente.equals(codigo)){
            if(fecha[1].equals(fechaIns[0]) && fecha[2].equals(fechaIns[1]))
                return true;
        }
        return false;
    }
    
    public boolean equals(String[] fechaIns){  // no se si esta pueda estar bien
        return (fecha[1].equals(fechaIns[0]) && fecha[2].equals(fechaIns[1]));
    }
}
