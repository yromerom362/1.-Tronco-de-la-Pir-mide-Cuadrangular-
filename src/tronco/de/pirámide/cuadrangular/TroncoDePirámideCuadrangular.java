/*
 * EJERCICIO 1 Tronco de la Piramide Cuadrangular
 * YEISSON ROMERO
 * UNIVERSIDAD EAN
 * CONSTRUCCION DE SOFTWARE GUIA 2
 */


package tronco.de.pirámide.cuadrangular;

/**
 * EJerccio 1
 *
 * @author YROMERO
 */
import java.util.Scanner;
public class TroncoDePirámideCuadrangular {


//Proceso de inicio    
   static float Area(float Lado){
   
        float S=0;
        
        S=Lado*Lado;
            
        
        return S;
        
    }
    
    static double Volumen(float sup1,float sup2,float altura){
     
        double V=0;
        double Res=0;
        Res=(sup1*sup2);
        Res=Math.sqrt(Res);
        V=(altura*(sup1+sup2+Res))/3;
             
        return V;
        
    }
    
    
    public static void main(String[] args) {
        
        
       float B;
       float b;
       float h;
       Scanner Teclado= new Scanner (System.in);
    //Proceso Final
    
   //Entrada Inicial 
   
       System.out.println("Introduzca el tamaño del lado inferior ");
       B = Teclado.nextFloat();
       System.out.println("Introduzca el tamaño del lado superior ");
       b = Teclado.nextFloat();
       System.out.println("Introduzca la altura ");
       h = Teclado.nextFloat();
   
   //Entrada Final
     
   //hayar el area 
   
       float S1= Area(B);
       float S2= Area(b);
       
       
   //Salida Inicial
   
       System.out.println("Area inferior: " +S1);
       System.out.println("Area superior: " +S2);
       System.out.println("Volumen: " +Volumen(S1,S2,h));
   //Salida Final 
    }
    
}