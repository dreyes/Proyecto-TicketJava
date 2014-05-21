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
public class EventoDeportivo extends Evento {
    private String n_equipo1, n_equipo2;
    public enum tipoDeporte{FUTBOL, TENNIS, RUGBY, BASEBALL};
    ArrayList<String> jugadores;
    
    public EventoDeportivo(int cod, String titulo, String desc, double rent, 
            Calendar fecha) {
        super(cod, titulo, desc, rent, fecha, 20000);
        jugadores = new ArrayList();
        
    }
}
