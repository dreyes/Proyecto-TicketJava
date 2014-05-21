package Usuarios;

import java.util.ArrayList;

public class Administrador extends Usuario
{
    private String tipo = "Administrador";
    
    ArrayList<String> ids = new ArrayList();
    
    public Administrador(String nombre,String password, String userName, int edad) 
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
    
    public boolean eliminarId(String cod){
        if(buscarId(cod)){
            //int codigo = Integer.parseInt(cod);
            ids.remove(cod);
            return true;
        }
        return false;
    }
    
}
