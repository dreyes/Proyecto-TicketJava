/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Eventos;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author DReyes
 */
public  final class EventoDeportivo extends Evento {
    private String n_equipo1, n_equipo2;
    private tipoDeporte deporte;
    
    public enum tipoDeporte{FUTBOL, TENNIS, RUGBY, BASEBALL};
    ArrayList<String> jugadores_equipo1;
    ArrayList<String> jugadores_equipo2;
    
    public EventoDeportivo(int cod, String titulo, String desc, double rent, 
            Calendar fecha, String equipo1, String equipo2, String tipo) {
        
        super(cod, titulo, desc, rent, fecha, 20000);
        
        jugadores_equipo1 = new ArrayList();
        jugadores_equipo2 = new ArrayList();
        
        n_equipo1 = equipo1;
        n_equipo2 = equipo2;
        
        if(tipo.equalsIgnoreCase("Futbol"))
            deporte = tipoDeporte.FUTBOL;
        else if(tipo.equalsIgnoreCase("Tennis"))
            deporte = tipoDeporte.TENNIS;
        else if(tipo.equalsIgnoreCase("Baseball"))
            deporte = tipoDeporte.BASEBALL;
        else if(tipo.equalsIgnoreCase("Rugby"))
            deporte = tipoDeporte.RUGBY;
    }

    public String getN_equipo1() {
        return n_equipo1;
    }

    public void setN_equipo1(String n_equipo1) {
        this.n_equipo1 = n_equipo1;
    }

    public String getN_equipo2() {
        return n_equipo2;
    }

    public void setN_equipo2(String n_equipo2) {
        this.n_equipo2 = n_equipo2;
    }

    public tipoDeporte getDeporte() {
        return deporte;
    }

    public void setDeporte(String tipo) {
         if(tipo.equalsIgnoreCase("Futbol"))
            deporte = tipoDeporte.FUTBOL;
        else if(tipo.equalsIgnoreCase("Tennis"))
            deporte = tipoDeporte.TENNIS;
        else if(tipo.equalsIgnoreCase("Baseball"))
            deporte = tipoDeporte.BASEBALL;
        else if(tipo.equalsIgnoreCase("Rugby"))
            deporte = tipoDeporte.RUGBY;
    }

    public ArrayList<String> getJugadores_equipo1() {
        return jugadores_equipo1;
    }

    public void setJugadores_equipo1(ArrayList<String> jugadores_equipo1) {
        this.jugadores_equipo1 = jugadores_equipo1;
    }

    public ArrayList<String> getJugadores_equipo2() {
        return jugadores_equipo2;
    }

    public void setJugadores_equipo2(ArrayList<String> jugadores_equipo2) {
        this.jugadores_equipo2 = jugadores_equipo2;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Evento Deportivo - "+deporte+" - "
                +n_equipo1+" vrs "+n_equipo2;
    }
}
