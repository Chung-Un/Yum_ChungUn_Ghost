/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_ghost1;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Yum_ChungUn_Ghost1 {
    
   static Player player = new Player();

    
   public static int validarUsuario(String usuarioBusqueda,String[][] usuariosInfo ){
    int posicionUsuario=-1;
    
    for(int i=0;i<player.getUsuariosInfo()[0].length;i++){
    if(usuarioBusqueda.equals(player.getUsuariosInfo()[0][i])){
    posicionUsuario = i;
    break;
    }
    }
    return posicionUsuario;  
    }
    
    public static void validarPassword(String passwordBusqueda){
    boolean passwordValida;
    passwordValida = (passwordBusqueda.length()==8);
    
    if(passwordValida){
    System.out.println("Password valida\nCreacion de perfil exitosa.");
    player.setPassword(passwordBusqueda);
    }
    else{
    System.out.println("Esa password no cumple con el requisito de 8 caracteres");
    }   
    
    }
   
    public static void rankingJugadores(){
    int temp;
    
    for(int i=0 ; i< player.getUsuariosPuntos().length;i++){
    for(int x=1; x < player.getUsuariosPuntos().length;x++){
        if(player.getUsuariosPuntos()[x-1]>= player.getUsuariosPuntos()[x]){
        temp= player.getUsuariosPuntos()[x];
        player.getUsuariosPuntos()[x] = player.getUsuariosPuntos()[x-1];
        player.getUsuariosPuntos()[x-1] = temp;
    }
    }
    }
    
    
    
    
    }
   
    
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        int opcionUsuario=0, posicionUsuario=0;
        String usuarioBusqueda="", passwordBusqueda="";
        
        
        
        System.out.println("**Bienvenido a Ghost**\n===========Menu de Inicio===========\nDigite el numero de la opcion que desea acceder\n1.Login\n2.Crear player\n3.Salir");
        opcionUsuario = entrada.nextInt();
       
        
        switch(opcionUsuario){
        
            case 1:
                
                System.out.println("--->Login\nIngrese su usuario:");
                usuarioBusqueda=entrada.next();
                
                 posicionUsuario = validarUsuario(usuarioBusqueda,player.getUsuariosInfo());
                
                if(posicionUsuario>=0){
                player.setUsuario(usuarioBusqueda);
                System.out.println("Usuario encontrado");
                
                }
                else{
                System.out.println("Usuario no encontrado.");
                
                }
                
                System.out.println("Ingrese su password:");
                passwordBusqueda = entrada.next();
                
                if(passwordBusqueda.equals(player.getUsuariosInfo()[1][posicionUsuario])){
                player.setPassword(passwordBusqueda);
                System.out.println("Bienvenido " + usuarioBusqueda);
                }
                else{
                System.out.println("Password incorrecta");
                
                }
                break;
                
                
            case 2: 
                
                System.out.println("-->Crear Player\nIngrese un nombre de usuario sin espacios:");
                usuarioBusqueda = entrada.next();
                posicionUsuario = validarUsuario(usuarioBusqueda,player.getUsuariosInfo());
                
                if(posicionUsuario==-1){
                player.setUsuario(usuarioBusqueda);
                    
                System.out.println("Ingrese una password de 8 caracteres:");
                passwordBusqueda = entrada.next(); 
                
                validarPassword(passwordBusqueda);
                        
                }
                else{
                System.out.println("El usuario que ha seleccionado ya esta en uso.");
                }
                break;
                
            case 3:
                System.out.println("Hasta luego...");
                System.exit(0);
            }
                
              
        System.out.println("===========Menu principal===========\n1.Jugar\n2.Configuracion\n3.Reportes\n4.Mi perfil\n5.Cerrar sesion");
        opcionUsuario = entrada.nextInt();
        entrada.nextLine();
        
        switch(opcionUsuario){
        
            case 1:
                break;
                
            case 2:
                break;
                
            case 3:
                System.out.println("-->Reportes\n1.Descripcion de mis ultimos 10 juegos\n2.Ranking de jugadores");
                opcionUsuario = entrada.nextInt();
                entrada.nextLine();
                
                switch(opcionUsuario){
                
                    case 1:
                       System.out.println("El resumen de las ultimas 10 partidas de: " + player.getUsuario());
                     
                       for (String i : player.getResumenPartidas()){
                           System.out.println(i);
                       }
                       break;
                       
                    case 2:
                    System.out.println("El ranking de jugadores actuales es:");  
                }
                
               
                
                break;
                
            case 4:
                System.out.println("-->Mi Perfil\n1.Ver mis datos\n2.2.Cambiar password\n3.Eliminar cuenta\n4.Regresar al menu principal");
                
                
                break;
                
            case 5:
                
                
                
                break;
        
         }
        
                
                
        
        
        
        
        }}
        
    

