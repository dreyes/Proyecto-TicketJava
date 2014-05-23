/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Eventos;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

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

    public ArrayList<Evento> getEventos() {
        return eventos;
    }
    
    public boolean crearEvento(String cod, String titulo, String desc, String rent, 
            Calendar fecha, String tipo, String equipo1, String equipo2, 
            String tipoDeporte, String tipoMusica){
        int codigo = Integer.parseInt(cod);
        double renta = Double.parseDouble(rent);
        if(buscarEvento(codigo) == null){
            if(tipo.equalsIgnoreCase("Deportivo")){
                eventos.add(new EventoDeportivo(codigo,titulo,desc,renta,fecha, 
                        equipo1, equipo2, tipoDeporte));
            }else if(tipo.equalsIgnoreCase("Musical")){
                eventos.add(new EventoMusical(codigo,titulo,desc,renta,fecha,tipoMusica));
            }else if (tipo.equalsIgnoreCase("Religioso")){
                eventos.add(new EventoReligioso(codigo,titulo,desc,renta,fecha));
            }
            return true;
        }
        return false;
    }
    
    public boolean eliminarEvento(String cod){
        Calendar f = new GregorianCalendar();
        int codigo = Integer.parseInt(cod);
        Evento x = buscarEvento(codigo);
        if(x != null){
            x.setEstado_cancelado(true);
            double n = x.getRenta();
            if (x.getFecha_evento().getTimeInMillis()-f.getTimeInMillis() <= 86400000) {
                if(x instanceof EventoDeportivo || x instanceof EventoMusical)
                    x.setRenta(n*0.5);
            } else {
                x.setRenta(0);
            }
            return true;
        }
        return false;
    }
    
    public boolean editarEvento(String cod, String titulo, String desc, String rent, 
            Calendar fecha, String tipo, String n_equipo1, String n_equipo2, 
            String tipoDeporte, String tipoMusica, ArrayList equipo1, 
            ArrayList equipo2, ArrayList equipom, String convert){
        
        int codigo = Integer.parseInt(cod);
        double renta = Double.parseDouble(rent);
        
        Evento x = buscarEvento(codigo);
        if (x != null) {
            
            x.setCodigo_evento(codigo);
            x.setTitulo_evento(titulo);
            x.setDescripcion(desc);
            x.setRenta(renta);
            x.setFecha_evento(fecha);
            
            if (tipo.equalsIgnoreCase("Deportivo")) {
                
                ((EventoDeportivo)x).setN_equipo1(n_equipo1);
                ((EventoDeportivo)x).setN_equipo2(n_equipo2);
                ((EventoDeportivo)x).setDeporte(tipoDeporte);
                ((EventoDeportivo)x).setJugadores_equipo1(equipo1);
                ((EventoDeportivo)x).setJugadores_equipo2(equipo2);
                
            } else if (tipo.equalsIgnoreCase("Musical")) {
                
                ((EventoMusical)x).setMusica(tipoMusica);
                ((EventoMusical)x).setEquipo_sonido(equipom);
                
            } else if (tipo.equalsIgnoreCase("Religioso")) {
                
                int i = Integer.parseInt(convert);
                ((EventoReligioso)x).setPers_convert(i);
                
            }
            
            return true;
            
        }
        
        return false;
    }
    
    public int getTipo(Evento eve){
        if(eve instanceof EventoDeportivo)
            return 0;
        else if(eve instanceof EventoMusical)
            return 1;
        else if(eve instanceof EventoReligioso)
            return 2;
        return -1;
    }
}
