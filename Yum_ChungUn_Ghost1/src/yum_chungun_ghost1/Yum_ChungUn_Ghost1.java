/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yum_chungun_ghost1;

import java.util.Scanner;

/**
 *
 * @author chung
 */
public class Yum_ChungUn_Ghost1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
        int opcionMenuInicio=0, largoTemporal=10;
        String usuarioBusqueda, passwordBusqueda="";
        String[][] usuariosInfo = {{"chungun23","pollochuco24"},{"mcr4ever","pollochu"}};
        
        do{
        System.out.println("**Bienvenido a Ghost**\n---Menu de inicio---\nDigite el numero de la opcion que desea acceder\n1.Login\n2.Crear player\n3.Salir");
        opcionMenuInicio = entrada.nextInt();
       
        
        
        switch(opcionMenuInicio){
        
            case 1:
                System.out.println("--->Login\nIngrese su usuario:");
                usuarioBusqueda=entrada.next();
                
                for(int i=0; i<=usuariosInfo[0].length;i++){
                
                if(usuarioBusqueda.equals(usuariosInfo[0][i])){
                System.out.println("Usuario encontrado, ingrese su password:");
                passwordBusqueda = entrada.next();
                }
                else if(!usuarioBusqueda.equals(usuariosInfo[0][i])){
                System.out.println("Usuario no encontrado");
               
                }
                
                if(passwordBusqueda.equals(usuariosInfo[1][i])){
                System.out.println("Bienvenido " + usuarioBusqueda + " :D");
                }}
               
                }
                
               
                break;
        
                
                
        
        
        
        }while(opcionMenuInicio !=3 );
        
        }}
        
    

