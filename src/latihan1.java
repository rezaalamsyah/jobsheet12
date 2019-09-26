
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author santuy
 */
public class latihan1 {
    public static void main (String[] args){
         Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama : ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan bilangan kedua : ");
        int bil2 = input.nextInt();
        
        jumlah(bil1, bil2);
}

    public static void jumlah(int a, int b) {
        System.out.println("Hasil " + (a + b));
      
    }
}