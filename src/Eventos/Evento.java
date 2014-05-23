/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Eventos;

import java.util.Calendar;



/**
 *
 * @author DReyes
 */
public class Evento {
    protected int codigo_evento;
    protected String titulo_evento, descripcion;
    protected double renta;
    protected Calendar fecha_evento;
    protected long cantidad_max;
    protected boolean estado_cancelado;
    
    public Evento(int cod, String titulo, String desc, double rent, 
            Calendar fecha, long max){
        codigo_evento = cod;
        titulo_evento = titulo;
        descripcion = desc;
        renta = rent;
        fecha_evento = fecha;
        cantidad_max = max;
        estado_cancelado = false;
    }

    public boolean isEstado_cancelado() {
        return estado_cancelado;
    }

    public void setCodigo_evento(int codigo_evento) {
        this.codigo_evento = codigo_evento;
    }

    public void setTitulo_evento(String titulo_evento) {
        this.titulo_evento = titulo_evento;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setFecha_evento(Calendar fecha_evento) {
        this.fecha_evento = fecha_evento;
    }

    public void setCantidad_max(long cantidad_max) {
        this.cantidad_max = cantidad_max;
    }

    public int getCodigo_evento() {
        return codigo_evento;
    }

    public String getTitulo_evento() {
        return titulo_evento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getRenta() {
        return renta;
    }

    public Calendar getFecha_evento() {
        return fecha_evento;
    }

    public void setEstado_cancelado(boolean estado_cancelado) {
        this.estado_cancelado = estado_cancelado;
    }

    public void setRenta(double renta) {
        this.renta = renta;
    }
    
    @Override
    public String toString(){
        String n;
        if(estado_cancelado){
            n = "cancelado";
        } else {
            n = "activo";
        }
        String fecha = fecha_evento.get(5) + "/" + fecha_evento.get(2) + "/" + fecha_evento.get(1);
        
        return codigo_evento+" - "+titulo_evento+" - "+descripcion+ " - Renta: "
                +renta+" - "+fecha+" - Cantidad max: "+cantidad_max+" - "+n;
    }
}
