
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
public class latihan4 {
    public static void main(String[]args){
        Scanner p = new Scanner(System.in);
        
        System.out.print("Jarak : ");
        int jarak = p.nextInt();
        
        System.out.print("Waktu : ");
        int waktu = p.nextInt();
        
        lakukan(jarak,waktu);
    }
    public static void lakukan (double a, double b){
        System.out.println("Kecepatan :" +(a / b)+"Km/jam");
}
}