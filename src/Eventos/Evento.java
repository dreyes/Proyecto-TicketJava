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
    
    public Evento(int cod, String titulo, String desc, double rent, 
            Calendar fecha, long max){
        codigo_evento = cod;
        titulo_evento = titulo;
        descripcion = desc;
        renta = rent;
        fecha_evento = fecha;
        cantidad_max = max;
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
    
}
