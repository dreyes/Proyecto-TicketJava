package Usuarios;

import java.util.ArrayList;

public final class Administrador extends Usuario
{
    final static String tipo = "Administrador";
    
    ArrayList<String> ids = new ArrayList();
    
    public Administrador(String nombre,String password, String userName, int edad) 
    {
        super(nombre,password,userName,edad);
        
    }

    @Override
    public String toString() {
        return super.toString() + " " + tipo;
    }
    
    public final boolean agregarId(String cod){
        //int codigo = Integer.parseInt(cod);
        //ids.add(codigo);
        ids.add(cod);
        return true;
    }

    public ArrayList<String> getIds() {
        return ids;
    }
    
    public final boolean buscarId(String cod){
        //int codigo = Integer.parseInt(cod);
        //for(Integer i: ids){
            //if(i == codigo){
       for(String i: ids){
            if(i.equals(cod)){         
                return true;
                
            }
        }
        return false;
    }
    
    public final String buscarId2(String cod){
        //int codigo = Integer.parseInt(cod);
        //for(Integer i: ids){
            //if(i == codigo){
       for(String i: ids){
            if(i.equals(cod)){         
                return i;
                
            }
        }
        return null;
    }
    
    public final boolean eliminarId(String cod){
        return buscarId(cod);
    }

    public final boolean editarId(String cod1, String cod2) {
        String i = buscarId2(cod1);
        if(i != null){
            ids.remove(i);
            ids.add(cod2);
            return true;
        }
        return false;
    }
    
}
