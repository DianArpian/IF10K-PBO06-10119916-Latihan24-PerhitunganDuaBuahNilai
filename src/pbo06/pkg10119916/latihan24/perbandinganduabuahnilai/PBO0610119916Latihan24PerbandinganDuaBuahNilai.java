/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan24.perbandinganduabuahnilai;
import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : Perbandingan dua buah nilai
 */
public class PBO0610119916Latihan24PerbandinganDuaBuahNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int val1, val2;
        
        for (String b= "ya"; b.equals("ya") || b.equals("Ya");){
            Scanner scan = new Scanner(System.in);
            
            System.out.println("==========Program Perbandingan Nilai==========");
            System.out.println();
            System.out.print("Masukkan Nilai Pertama : ");
            val1 = scan.nextInt();
            System.out.print("Masukkan Nilai Kedua : ");
            val2 = scan.nextInt();
            
                if(val1 < val2){
                    System.err.println("Hasil : " + val1 + "lebih kecil dari " + val2);
                }else if(val1 > val2){
                     System.err.println("Hasil : " +val1 + "lebih besar dari " + val2);
                }else if(val1 == val2){
                    System.err.println("Hasil : " +val1 + " sama dengan " + val2 );
                }
                
                    System.err.println();
                    System.out.print("Ulangi Aktivitas ? (Ya/Tidak) ");
                    b = scan.next();
            
        }
    }
    
}
