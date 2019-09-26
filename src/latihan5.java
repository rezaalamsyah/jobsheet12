
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
public class latihan5 {
    public static void main (String[]args){
       Scanner p = new Scanner(System.in);
       System.out.print("bilangan 1 : ");
       int j = p.nextInt();
       System.out.print("bilangan 2 : ");
       int k =p.nextInt();
       System.out.print("bilangan 3 : ");
       int l = p.nextInt();
       hasil(j,k,l);
       
    }
    public static void hasil (int a, int b , int c){
        if(a > b && a > c){
            System.out.println("angka terbesar adalah " + a );
        }else if (b > a && b > c){
            System.out.println("angka terbesar adalah "+ b );
                    
        }else if (c > a && c > b ){
            System.out.println("angka terbesar adalah "+ c );
        }
    }
}
