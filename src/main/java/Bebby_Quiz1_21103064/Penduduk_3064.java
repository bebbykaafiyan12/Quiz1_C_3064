/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bebby_Quiz1_21103064;

/**
 *
 * @author Bebby
 */
public class Penduduk_3064 {
    protected String nik;
    protected String nama;
    protected int umur;
    protected String alamat;
    
    public Penduduk_3064(){
        this.nik = nik;
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    
    public double totalPendapatan(){
        return 0;
    }
    
    public void tampilDataPenduduk(){
        System.out.println("NIK : " + nik);
        System.out.println("Nama : " + nama);
        System.out.println("Umur : "+ umur);
        System.out.println("Alamat : "+ alamat);
    }
}

