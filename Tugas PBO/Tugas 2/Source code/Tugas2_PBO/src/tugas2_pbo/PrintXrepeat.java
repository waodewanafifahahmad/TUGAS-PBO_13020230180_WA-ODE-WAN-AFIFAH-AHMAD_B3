/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2_pbo;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan ITERATE */

public class PrintXrepeat {
    /**
     * @param args
     */
    public static void main(String[] args) {
          // TODO Auto-generated method stub
          /* Kamus : */
          int Sum;
          int x;
          Scanner masukan=new Scanner(System.in);
          /* Program */

          System.out.print ("Masukkan nilai x (int), akhiri dg999 : ");
          x = masukan.nextInt(); /* First Elmt */
          if (x == 999){
                System.out.print("Kasus kosong \n");
          }else { /* MInimal ada satu data yang dijumlahkan*/
                Sum = 0; /* Inisialisasi; invariant !! */
          do{
                Sum = Sum + x; /* Proses */
                System.out.print ("Masukkan nilai x (int), akhiridg 999 : ");
                x = masukan.nextInt(); /* Next Elmt */
          } while (x != 999); /* Kondisi pengulangan */
                System.out.println ("Hasil penjumlahan = "+Sum);
                /* Terminasi */
          }
    }
}
    
