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
public final class EventoReligioso extends Evento {
    private int pers_convert;
    
    public EventoReligioso(int cod, String titulo, String desc, double rent, 
            Calendar fecha) {
        super(cod, titulo, desc, rent, fecha, 30000);
        renta += renta + 2000;
        pers_convert = 0;
    }

    public int getPers_convert() {
        return pers_convert;
    }

    public void setPers_convert(int pers_convert) {
        this.pers_convert = pers_convert;
    }
    
    @Override
    public String toString(){
        return super.toString()+" - Evento Deportivo - "+pers_convert;
    }
    
}
