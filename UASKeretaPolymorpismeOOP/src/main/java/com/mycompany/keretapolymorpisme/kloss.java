/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keretapolymorpisme;

/**
 *
 * @author User
 */
public class kloss extends KarakterKereta
{
    public kloss ()
    {
        Kecepatan = " Tergantung Gigi yang dimasukkan Dalam Km/jam ";
        Harga= "Terjangkau Mahal Rp. 25.000.000 - Rp. 80.000.000";
    }
     public void tampilkanCaraPemakaian()
    {
        System.out.println("Pemakainnya: Dengan Memegang Tuas kiri kopling lalu memasukin Gigi");
    }
    public void tampilkanBensin()
    {
        System.out.println(" MotorCloss BerKopling mesin 250cc, Bensin PERTAMAX");
    }
    
}
