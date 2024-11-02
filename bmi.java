/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bmi;

/**
 *
 * @author ADVAN
 */
public class bmi {
    

    double tinggi;
    double berat;
    
    public bmi(double tinggi, double berat) {
        this.tinggi = tinggi / 100;
        this.berat = berat;
    }
    
    public double hitung() {
        return berat / (tinggi * tinggi);
    }
    
    public void hasil() {
        double bmi = hitung();
        if (bmi < 18.5) {
            System.out.println("ANDA TERDETEKSI KURUS");
        } else if (bmi < 25) {
            System.out.println("ANDA TERDETEKSI NORMAL");
        } else if (bmi < 30) {
            System.out.println("ANDA TERDETEKSI OVERWEIGHT");
        } else {
            System.out.println("ANDA TERDETEKSI OBESITAS");
        }
        System.out.printf("bmi anda : %.1f%n",bmi);
    }
}
