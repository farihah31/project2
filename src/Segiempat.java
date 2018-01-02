/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * aturcara kira luas dan lilitan
 */
import java.util.Scanner;
public class Segiempat {
public static void main(String[] args) {
Scanner sisi = new Scanner (System.in);
int S ;
System.out.println("Masukan Sisi = ");
S = sisi.nextInt();
int Luas , Keliling ;
Keliling = 4*S ;
System.out.println("Keliling persegi adalah = "+Keliling);
Luas = S * S;
System.out.println("Luas persegi adalah = "+Luas);    
}
}