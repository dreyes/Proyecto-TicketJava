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
public final class EventoMusical extends Evento {
    public enum tipoMusica{POP, ROCK, RAP, CLASICA, REGGAETON, OTRO};
    ArrayList<String> equipo_sonido;
    private tipoMusica musica;
    
    
    public EventoMusical(int cod, String titulo, String desc, double rent, 
            Calendar fecha, String tipo) {
        super(cod, titulo, desc, rent, fecha, 25000);
        renta += renta*0.3;
        equipo_sonido = new ArrayList();
        
        if(tipo.equalsIgnoreCase("POP"))
            musica = tipoMusica.POP;
        else if(tipo.equalsIgnoreCase("ROCK"))
            musica = tipoMusica.ROCK;
        else if(tipo.equalsIgnoreCase("RAP"))
            musica = tipoMusica.RAP;
        else if(tipo.equalsIgnoreCase("CLASICA"))
            musica = tipoMusica.CLASICA;
        else if(tipo.equalsIgnoreCase("REGGAETON"))
            musica = tipoMusica.REGGAETON;
        else if(tipo.equalsIgnoreCase("OTRO"))
            musica = tipoMusica.OTRO;
    }

    public ArrayList<String> getEquipo_sonido() {
        return equipo_sonido;
    }

    public void setEquipo_sonido(ArrayList<String> equipo_sonido) {
        this.equipo_sonido = equipo_sonido;
    }

    public tipoMusica getMusica() {
        return musica;
    }

    public void setMusica(String tipo) {
        if(tipo.equalsIgnoreCase("POP"))
            musica = tipoMusica.POP;
        else if(tipo.equalsIgnoreCase("ROCK"))
            musica = tipoMusica.ROCK;
        else if(tipo.equalsIgnoreCase("RAP"))
            musica = tipoMusica.RAP;
        else if(tipo.equalsIgnoreCase("CLASICA"))
            musica = tipoMusica.CLASICA;
        else if(tipo.equalsIgnoreCase("REGGAETON"))
            musica = tipoMusica.REGGAETON;
        else if(tipo.equalsIgnoreCase("OTRO"))
            musica = tipoMusica.OTRO;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Evento Musical - "+musica;
    }
    
}
