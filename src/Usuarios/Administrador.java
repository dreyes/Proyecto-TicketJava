package Usuarios;

import java.util.ArrayList;

public class Administrador extends Usuario
{
    private String tipo = "Administrador";
    
    ArrayList<Integer> ids = new ArrayList();
    
    public Administrador(String nombre,String password, String userName, int edad) 
    {
        super(nombre,password,userName,edad);
        
    }

    @Override
    public String toString() {
        return super.toString() + " " + tipo;
    }
    
    
    
}
