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
public class AdmEventos {
    ArrayList<Evento> eventos;
    
    public AdmEventos(){
        eventos = new ArrayList();
    }
    
    public Evento buscarEvento(int codigo) {
        
        for( Evento n : eventos){
            if(n.codigo_evento == codigo)
                return n;
        }
        return null;
    }
    
    public boolean crearEvento(String cod, String titulo, String desc, String rent, 
            Calendar fecha, String tipo){
        int codigo = Integer.parseInt(cod);
        double renta = Double.parseDouble(rent);
        if(buscarEvento(codigo) == null){
            if(tipo.equalsIgnoreCase("Deportivo")){
                eventos.add(new EventoDeportivo(codigo,titulo,desc,renta,fecha));
            }else if(tipo.equalsIgnoreCase("Musical")){
                eventos.add(new EventoMusical(codigo,titulo,desc,renta,fecha));
            }else if (tipo.equalsIgnoreCase("Religioso")){
                eventos.add(new EventoReligioso(codigo,titulo,desc,renta,fecha));
            }
            return true;
        }
        return false;
    }
    
    public boolean eliminarEvento(String cod){
        int codigo = Integer.parseInt(cod);
        Evento x = buscarEvento(codigo);
        if(x != null){
            eventos.remove(x);
            return true;
        }
        return false;
    }
    
}
