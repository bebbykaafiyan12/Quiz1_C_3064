/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bebby_Quiz1_21103064;

/**
 *
 * @author Bebby
 */
public class Dokter_3064 extends Penduduk_3064 {
    int jmlPasien;
    int jmlObat;
    double totalPendapatanDokter;
    
    public Dokter_3064(){
        this.jmlPasien = jmlPasien;
        this.jmlObat = jmlObat;
    }
    
    public double totalPendapatan(){
        totalPendapatanDokter = (jmlPasien * 50000) + (jmlObat * 10000);  
        return totalPendapatanDokter;  
    }
    
    public void DataDokter(){
        super.tampilDataPenduduk();
        System.out.println("Jumlah Pasien : " + jmlPasien);
        System.out.println("Jumlah Obat : " + jmlObat);
        System.out.println("Total pendapatan dokter : Rp " + totalPendapatan());
    }
    
    
 
}
