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
    
    
    
}
