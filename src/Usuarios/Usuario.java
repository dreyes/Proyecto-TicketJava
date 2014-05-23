package Usuarios;

public abstract class Usuario 
{   

    protected String nombre;
    protected String password;
    protected String userName;
    protected int edad;
    

    public Usuario(String nombre,String password, String userName, int edad)
    {
        
        this.edad = edad;
        this.nombre = nombre;
        this.password = password;
        this.userName = userName;
        
    }

    public String getPassword() 
    {
        return password;
    }

    public String getUserName() 
    {
        return userName;
    }
    
     public String getNombre() 
     {
        return nombre;
     }
    
     public int getEdad()
     {
         return edad;
     }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     
     
     
    @Override
    public String toString() 
    {
        return " Nombre = " + nombre + ", Password= " + password + ", Username = " + userName + ", Edad =" + edad ;
    }
     
     
}
