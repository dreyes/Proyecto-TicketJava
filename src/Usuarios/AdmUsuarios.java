package Usuarios;
import java.util.ArrayList;
import java.util.Scanner;

public class AdmUsuarios 
{
    ArrayList<Usuario> usuarios;
    Scanner sc = new Scanner(System.in);
    
    public AdmUsuarios(){
        usuarios = new ArrayList();
        usuarios.add(new Administrador("Administrador","supersecreto","admin",20));
    }
    
    public int getTipo(Usuario usu){
        if(usu instanceof Administrador)
            return 0;
        else if(usu instanceof UsuarioContenido)
            return 1;
        else if(usu instanceof UsuarioLimitado)
            return 2;
        return -1;
    }
    
    public Usuario comprobarUsuario(String userName, String pwd)
    {
        Usuario x = buscarUsuario(userName);
        if(x != null){
            if(x.getPassword().equals(pwd)){
                return x;
            }
        }
        return null;
        
    }
    
    //buscador de usernames
    public Usuario buscarUsuario(String user) {
        for( Usuario napky : usuarios){
            if(napky.getUserName().equalsIgnoreCase(user)){
                return napky;
            }
        }
        return null;
    }
    
    public boolean crearUsuario(String nom, String pass, String user, String ed, String tip)
    {   
        int edad = Integer.parseInt(ed);
        if(buscarUsuario(user) == null){
            if(tip.equalsIgnoreCase("Administrativo")){
                usuarios.add(new Administrador(nom,pass,user,edad));
            }else if(tip.equalsIgnoreCase("Limitado")){
                usuarios.add(new UsuarioLimitado(nom,pass,user,edad));
            }else if (tip.equalsIgnoreCase("De Contenido")){
                usuarios.add(new UsuarioContenido(nom,pass,user,edad));
            }
            return true;
        }    
        return false;
        
    }
   
    //Funcion para imprimir datos del usuario.
    public void print()
    {   
        System.out.println("Ingrese username del usuario a imprimir datos: ");
        String user = sc.next();
        System.out.println( buscarUsuario(user) );
    }
    
    //Funcion auxiliar para validar que no hayan usuarios repetidos en la funcion de crear usuario
    private String  usernameValidado()
    {
       String username = sc.next();
        
        if( buscarUsuario(username) == null)
            return username;
        else
        {
            System.out.println("Username ya existe, vuelva a intentar");
            return usernameValidado();
        }
    }
    
    
    public boolean modificarUsuario(String username, String nNombre, String nUser, 
            String nPass, String nEdad)
    {   
       int x = buscarPosUsername(username,0);
       if(x != -1){
            usuarios.get(x).setEdad(Integer.parseInt(nEdad));
            usuarios.get(x).setNombre(nNombre);
            usuarios.get(x).setPassword(nPass);
            usuarios.get(x).setUserName(nUser);
            return true;
       }
       return false;
    }
    
   //funcion auxiliar en modificar Usuario y en borrar usuario
     private String newUsernameValidado()
    {
       String username = sc.next();
        
        if( buscarUsuario(username) == null)
        {
            System.out.println("Usuario no existe, vuelva a intentar");
            return newUsernameValidado();
        }
        else
        return buscarUsuario(username).userName;

    }
    
    private void printUsernames(int a)
    {
        if(a<usuarios.size())
        {
        System.out.println(usuarios.get(a).userName);
        printUsernames(++a);
        }
    }
     
    public int buscarPosUsername(String username)
    {
        return buscarPosUsername(username, 0);
    }
    
    
    //busqueda de posicion de un username en el arrayList
    private int buscarPosUsername(String username, int a)
    {
        if(a<=usuarios.size())
        {
        if( usuarios.get(a).userName.equalsIgnoreCase(username) )
            return a;
        else
            return buscarPosUsername(username,a + 1);
        }
        else return -1;
    }
    //Busqueda de posicion de un password en el ArrayList
    public int buscarPosPassword(String password, int a)
    {
        if(a<=usuarios.size())
        {
        if( usuarios.get(a).password.equalsIgnoreCase(password) )
            return a;
        else
            return buscarPosUsername(password,a + 1);
        }
        else return -1;
    }
    
    
    public boolean borrarUsuario(String username)
    {
        if(buscarUsuario(username) != null){
            int x = buscarPosUsername(username,0);
            if(x != -1){
                usuarios.remove(x);
            return true;
            }
        }
        return false;
        
    }
}
