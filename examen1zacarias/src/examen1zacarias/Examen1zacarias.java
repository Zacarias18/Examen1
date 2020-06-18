
package examen1zacarias;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Patricia Zacarias
 */
public class Examen1zacarias {
    
    
    public static void main(String[] args) {
        int matriz[][] = new int[5][2];
        Scanner consola = new Scanner(System.in);
        for (int x=0; x < matriz.length; x++) {
            for (int y=0; y < matriz[x].length; y++) {
                System.out.println("Introduzca el elemento [" + x + "," + y + "]");
                matriz[x][y] = consola.nextInt();
            }
        }
        for (int x=0; x < matriz.length; x++) {
            for (int y=01; y < matriz[x].length; y++) {
                System.out.println ("[" + x + "," + y + "] = " + matriz[x][y]);
            }
        }
        
    }
    
}
