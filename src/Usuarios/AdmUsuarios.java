package Usuarios;
import java.util.ArrayList;
import java.util.Scanner;

public class AdmUsuarios 
{
    ArrayList<Usuario> usuarios = new ArrayList();
    Scanner sc = new Scanner(System.in);
    
    public AdmUsuarios(){
        usuarios.add( new Administrador("Brandon","supersecreto","admin",20));
    }
    
    public int getTipo(Usuario usu){
        if(usu instanceof Administrador)
            return 1;
        else if(usu instanceof UsuarioLimitado)
            return 2;
        else if(usu instanceof UsuarioContenido)
            return 3;
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
    private Usuario buscarUsuario(String userName)
    {
        for( Usuario napky : usuarios)
        {
            if(napky.userName.equalsIgnoreCase(userName))
            return napky;
        }
        return null;
        
    }
    
    public void crearUsuario()
    {   
        System.out.println("\nIngrese tipo de usuario: Administrador, Limitado o Contenidos ");
        String tipo = sc.next();
        
        if(tipo.equalsIgnoreCase("Administrador") || tipo.equalsIgnoreCase("Limitado") || tipo.equalsIgnoreCase("Contenidos")  ) 
        {    
            System.out.println("Ingrese nombre: ");
            String nom = sc.next();
            
            System.out.println("Ingrese password: ");
            String pass = sc.next();
            
            System.out.println("Ingrese Username: ");
            String user = usernameValidado();
            
            System.out.println("Ingrese edad: ");
            int edad = sc.nextInt();

            if(tipo.equalsIgnoreCase("Administrador"))
            usuarios.add(new Administrador(nom,pass,user,edad));

            else if(tipo.equalsIgnoreCase("Limitado"))
            usuarios.add(new UsuarioLimitado(nom,pass,user,edad));

            else if (tipo.equalsIgnoreCase("Contenidos"))
            usuarios.add(new UsuarioContenido(nom,pass,user,edad));
        }
        else
        {
        System.out.println("Error al ingresar tipo, intente otra vez");
        crearUsuario();
        }
        // Se llama asi misma en caso de que se ingrese un tipo de usuario erroneo

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
    
    
    public void modificarUsuario()
    {   
       System.out.println("Lista de Usuarios: ");
       printUsernames(0);
       System.out.println("Ingrese Username del usuario a modificar: ");
       String username = newUsernameValidado();
       int x = buscarPosUsername(username,0);
       System.out.println("Ingrese el tipo de dato a modificar: \n1:Nombre \n2:Username \n3:Password  \n4:Edad ");
       int dato = sc.nextInt();
        
        switch(dato)
        {
            case 1 :
                System.out.println("Ingrese nombre nuevo: ");
                String nom = sc.next();
                usuarios.get(x).setNombre(nom);
                break;
            case 2 :
                System.out.println("Ingrese username nuevo");
                String newUser = usernameValidado(); // reuse mi funcion auxiliar que me valida que no hayan usernames repetidos
                usuarios.get(x).setUserName(newUser);
                break;
            case 3:
                System.out.println("Ingrese nuevo Password");
                String pass = sc.next();
                usuarios.get(x).setPassword(pass);
                break;
            case 4:
                System.out.println("Ingresar nueva edad");
                int edad = sc.nextInt();
                usuarios.get(x).setEdad(edad);
                break;
        }
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
    
    
    public void borrarUsuario()
    {
        if(usuarios.size()>1)
        {
            printUsernames(0);
            System.out.println("Ingrese el username del usuario a borrar.");
            String username = newUsernameValidado();
            int x = buscarPosUsername(username,0);
            usuarios.remove(x);
        }
        else
            System.out.println("No hay usuarios disponibles parar borrar.");
    }
}
