/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.keretapolymorpisme;

/**
 *
 * @author User
 */
public class ManusiaPemakai 
{
    public void jenisMotor ( KarakterKereta M )
    {
        if ( M instanceof Matic )
         {
             System.out.println("============== MOTOR MATIC =============="); 
            System.out.println("Motor Matic Sangat Relevan");
            ((Matic) M).tampilkanCaraPemakaian();
            
            System.out.println("Motor Matic cocok Dipakai Kesemua Orang");
            ((Matic) M).tampilkanBensin();
        }
        else if (M instanceof kloss)
        {
              System.out.println("============== MOTOR CLOSS ==============");   
            System.out.println("MotorCloss Berkopling ini Khusus Balapan");
            ((kloss) M).tampilkanCaraPemakaian();
            
            System.out.println("Motor ini Berkapasitas Besar dalam Mesinnya");
            ((kloss) M).tampilkanBensin();
        }
        else if ( M instanceof Bergigi_motoBebek)
        {
             System.out.println("============== MOTOR BERGIGI =============="); 
            System.out.println("MotorBebek ini Banyak Diminati Orang");
            ((Bergigi_motoBebek) M).tampilkanCaraPemakaian();
            
            System.out.println("MotorBebek sangat Ringan dalam Mesinnya");
            ((Bergigi_motoBebek) M).tampilkanBensin();
        }
      
        System.out.println("Kecepatannya: " + M.Kecepatan);
        System.out.println("Harganya: " + M.Harga);
        
    }
}
            
            
             
    
    

