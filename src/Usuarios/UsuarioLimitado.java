package Usuarios;

public final class UsuarioLimitado extends Usuario
{
    final static String tipo = "Usuario de tipo limitado";
    
    public UsuarioLimitado(String nombre,String password, String userName,int edad) 
    {
      super(nombre,password,userName,edad);
    }

    @Override
    public String toString() {
        return super.toString() + " " + tipo;
    }
    
    
}
