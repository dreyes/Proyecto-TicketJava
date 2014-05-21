package Usuarios;

import java.util.ArrayList;

public class UsuarioContenido extends Usuario
{
    private final String tipo = "Usuario de contenidos";
    ArrayList<Integer> ids = new ArrayList();
    
    public UsuarioContenido(String nombre,String password, String userName,int edad)
    {
        super(nombre,password,userName,edad);
    }

    @Override
    public String toString() {
        return super.toString() + " " + tipo;
    }
    
    public boolean agregarId(String cod){
        int codigo = Integer.parseInt(cod);
        ids.add(codigo);
        return true;
    }
    
    public boolean buscarId(String cod){
        int codigo = Integer.parseInt(cod);
        for(Integer i: ids){
            if(i == codigo){
                return true;
            }
        }
        return false;
    }
    
    public boolean eliminarId(String cod){
        if(buscarId(cod)){
            int codigo = Integer.parseInt(cod);
            ids.remove(codigo);
            return true;
        }
        return false;
    }
    
}
