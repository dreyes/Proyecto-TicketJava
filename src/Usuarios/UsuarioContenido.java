package Usuarios;

import java.util.ArrayList;

public final class UsuarioContenido extends Usuario
{
    final static String tipo = "Usuario de contenidos";
    ArrayList<String> ids = new ArrayList();
    
    public UsuarioContenido(String nombre,String password, String userName,int edad)
    {
        super(nombre,password,userName,edad);
    }

    @Override
    public String toString() {
        return super.toString() + " " + tipo;
    }
    
    public boolean agregarId(String cod){
        //int codigo = Integer.parseInt(cod);
        //ids.add(codigo);
        ids.add(cod);
        return true;
    }

    public ArrayList<String> getIds() {
        return ids;
    }
    
    public boolean buscarId(String cod){
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
    
    public String buscarId2(String cod){
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
    
    public boolean eliminarId(String cod){
        return buscarId(cod);
    }

    public boolean editarId(String cod1, String cod2) {
        String i = buscarId2(cod1);
        if(i != null){
            ids.remove(i);
            ids.add(cod2);
            return true;
        }
        return false;
    }
    
}
