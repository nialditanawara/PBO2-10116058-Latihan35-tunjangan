/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan35.tunjangan;

import java.util.Scanner;

public class PBO210116058Latihan35Tunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
        Karyawan kar = new Karyawan();
        System.out.println("================Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? : Rp. ");
        kar.gajiPokok = scan.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum) :");
        kar.status = scan.next();
        
        kar.HasilHitung(kar.status, kar.gajiPokok);
    }
    
}