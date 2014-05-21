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
public class EventoMusical extends Evento {
    public enum tipoMusica{POP, ROCK, RAP, CLASICA, REGGAETON, OTRO};
    ArrayList<String> equipo;
    
    public EventoMusical(int cod, String titulo, String desc, double rent, 
            Calendar fecha) {
        super(cod, titulo, desc, rent, fecha, 25000);
        renta += renta*0.3;
        equipo = new ArrayList();
        
    }
}
