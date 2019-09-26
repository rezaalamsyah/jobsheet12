/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author santuy
 */
public class Kalkulator {
    public static void main(String[] args){
        Scanner p = new Scanner(System.in);
        System.out.println("============Kalkulator ===========");
        int a,b,c,d,e,f,g,h,i,j;
        System.out.println("penjumlahan");
        System.out.print("input bilangan 1 = ");
        a = p.nextInt();
        System.out.print("input bilangan 2 = ");
        b = p.nextInt();
        System.out.println("penjumlahan = "+penjumlahan(a,b));
         System.out.println("pengurangan");
        System.out.print("input bilangan 1=");
         c = p.nextInt();
         System.out.print("input bilangan 2=");
        d = p.nextInt();
        System.out.println("pengurangan = "+pengurangan(c,d));
         System.out.println("perkalian");
         System.out.print("input bilangan 1=");
         e = p.nextInt();
          System.out.print("input bilangan 2=");
        f = p.nextInt();
        System.out.println("perkalian = "+perkalian(e,f));
         System.out.println("pembagian");
         System.out.print("input bilangan 1=");
         g = p.nextInt();
          System.out.print("input bilangan 2=");
        h = p.nextInt();
        System.out.println("pembagian = "+pembagian(g,h));
         System.out.println("sisa pembagian");
         System.out.print("input bilangan 1=");
         i = p.nextInt();
          System.out.print("input bilangan 2=");
        j = p.nextInt();
        System.out.println("sisa pembagian = "+sisapembagian(i,j));
        System.out.println("==================================");
    }

    public static int penjumlahan(int bil1,int bil2 ) {
        int hasil = bil1+bil2;
        return hasil;
    }

    public static int pengurangan(int bil1,int bil2) {
        int hasil = bil1 - bil2;
        return hasil;
    }

    public static int perkalian(int bil1, int bil2) {
        int hasil = bil1 * bil2;
        return hasil;
    }

    public static double pembagian(double bil1, double bil2) {
      double hasil = bil1 / bil2;
      return hasil;
    }

    public static double sisapembagian(int bil1, int bil2){ 
            double hasil = bil1 % bil2;
    if (bil1 < bil2){
       hasil = 0;
    }
    return hasil;
}
}