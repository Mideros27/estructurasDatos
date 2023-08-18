
package oper;

import java.util.Scanner;

public class ProductoVectorial {
    public static void main(String[] args) {
        
        int[] a = new int[10];
         int[] b = new int[10];
         
         Scanner scanner = new Scanner(System.in);
         
         //leemos los elementos del vector a
         System.out.println("ingresar los elementos del vector a: ");
         for (int i = 0; i < 10; i++) {
             
             System.out.println("ingresar el elemento " + (i + 1) + ": ");
             a[i] = scanner.nextInt();
            
        }
         
         //leemos los elementos del vector b
         System.out.println("ingresar los elementos del vector b : ");
         for (int i = 0; i < 10; i++) {
             
             System.out.println("ingresar el elemento" + (i + 1) + ": ");
             b[i] = scanner.nextInt();
            
        }
         
         //calculamos el producto de a por b. ( sumatoria de los productos de cada elemento )
         int producto = 0;
         for (int i = 0; i < 10; i++) {
             
             producto += a[i] * b[i];
            
        }
         // impromir resultado
         System.out.println("El producto de a por b es: " + producto);
    }
    
}
