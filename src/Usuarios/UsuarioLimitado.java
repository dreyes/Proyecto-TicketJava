package Usuarios;

public class UsuarioLimitado extends Usuario
{
    private final String tipo = "Usuario de tipo limitado";
    
    public UsuarioLimitado(String nombre,String password, String userName,int edad) 
    {
      super(nombre,password,userName,edad);
    }

    @Override
    public String toString() {
        return super.toString() + " " + tipo;
    }
    
    
}
