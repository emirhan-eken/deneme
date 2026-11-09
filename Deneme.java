/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.deneme;
import java.util.Scanner;
/**
 *
 * @author emirh
 */
public class Deneme {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);   
        System.out.println("deneme sinavi dogru ve yanlis sayilarini giriniz");
    double dogru=sc.nextInt();
    double yanlis=sc.nextInt();
        if (dogru+yanlis>20) {
            System.out.println("hata");   
        } else {
            double netsy= dogru-yanlis/4;
            System.out.println("netiniz" + netsy + "bosunuz:" + (20-(dogru+yanlis)) );    
            
           
        }
    
    
    
    
    }
}
