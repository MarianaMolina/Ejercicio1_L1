
package ejercicio1_l1;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marym
 */
public class Ejercicio1_L1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in); 
        int longitud, rango;
        
        System.out.print("Ingrese la longitud del Arreglo: ");
        longitud = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Ingrese un rango: ");
        rango = entrada.nextInt();
        
        GeneradorArreglo(longitud,rango);

    }
    
    public static int[] GeneradorArreglo(int longitud, int rango){
               
        Random generador = new Random();
        int [] arrayStatic = new int[longitud];
        
        System.out.println("---- ARREGLO ----");
   
        for(int i=0; i < arrayStatic.length; i++){
            arrayStatic[i] = generador.nextInt(rango) ;
            System.out.println("indice " + i + " --- " + arrayStatic[i]);
            
        }
        
        SumaArreglo(arrayStatic,longitud);
    
        return arrayStatic;
    }
    
    
    public static int SumaArreglo(int[] arrayStatic, int longitud){
        int suma=0;
        
        System.out.println("\n----SUMA ----");
        
        //longitud par
        if (longitud % 2 == 0){
            for (int i=0; i < arrayStatic.length-1; i++){
                suma= suma +(arrayStatic [i] + (arrayStatic.length - i));
                System.out.println(i + " + " + (arrayStatic.length-i) + " = "+ suma );
            }
        }
        System.out.println("Suma = " + suma);
        
       return suma; 
    }
  
}
