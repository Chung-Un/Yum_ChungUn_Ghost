/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioherencia;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author chung
 */
public class EjercicioHerencia {

    public static Turismo toyota[] = new Turismo[3];
    public static void ordenar(){
        int temp;

        
        for(int i =0 ; i < 3; i++){
        for(int y=1; y<3 ; y++){
        if ( toyota[y-1].getYear()>toyota[y].getYear()){
        temp = toyota[y];
        toyota[y]=toyota[y-1];
        toyota[y-1] = temp;
        }
        
        }
        }
    }
    
    public static void mostrar(){
    for(int i=0; i<3;i++){
    System.out.println("Marca: " + toyota[i].getModelo());
    System.out.println("Year: " + toyota[i].getYear());
    System.out.println("Tam. baul: " + toyota[i].getTam_baul());
    }
    }
    
  
    public static void main(String[] args) {
        
        

        toyota[0] = new Turismo();
        toyota[0].setModelo("Yaris");
        toyota[0].setYear(2018);
        toyota[0].setTam_baul(2);
        
        toyota[1] = new Turismo();
        toyota[1].setModelo("Corolla");
        toyota[1].setYear(2020);
        toyota[1].setTam_baul(3);
        
        toyota[2] = new Turismo();
        toyota[2].setModelo("Tercel");
        toyota[2].setYear(2020);
        toyota[2].setTam_baul(1);
        
        mostrar();
        ordenar();
        mostrar();
        
    }}
    

