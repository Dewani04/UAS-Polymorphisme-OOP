/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keretapolymorpisme;

/**
 *
 * @author User
 */
public class Matic extends KarakterKereta 
{
    public Matic ()
    {
        Kecepatan = "Sekitar 140-160 Km/h";
        Harga = " Sangat Terjangkau Rp. 15.000.000 - Rp. 30.000.000";
        
    }
    public void tampilkanCaraPemakaian()
    {
        System.out.println("Pemakainnya: Langsung Pegang Handle Gas Secara penuh");
    }
    public void tampilkanBensin()
    {
        System.out.println(" Motor ini menggunakan Bensin PERTALITE");
    }
    
}
    

