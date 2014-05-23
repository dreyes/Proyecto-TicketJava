/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TicketJavaGUI;

/**
 *
 * @author DReyes
 */
public interface EventUserInterface {
    public void EventoCreado(String cod);
    public boolean EventoEliminado(String cod);
    public boolean EventoEditado(String cod1, String cod2);
}
