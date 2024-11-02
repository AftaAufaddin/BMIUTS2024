/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bmi;

import java.util.Scanner;

/**
 *
 * @author ADVAN
 */
public class bmiBeraksi {
    public static void main(String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("================================================================");
        System.out.println("SELAMAT DATANG DI PROGRAM PERHITUNGAN BMI MOCHAMAD AFTA AUFADDIN");
        System.out.println("================================================================");
        System.out.print("Masukan tinggi badan anda : ");
        double tinggi = inputan.nextDouble();
        System.out.print("Masukan berat badan anda : ");
        double berat = inputan.nextDouble();
        bmi bmiafta = new bmi(tinggi, berat);
        bmiafta.hasil();
    }
    
}
