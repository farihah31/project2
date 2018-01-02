/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @aturcara untuk mengira luas segitiga
 */
import java.util.Scanner;
public class Luassegitiga {
public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.print("Masukkan nilai tapak: ");
int tapak = input.nextInt();

System.out.print("Masukkan nilai tingginya: ");
int tinggi = input.nextInt();
int luas = (int)(tapak*tinggi)/2;
System.out.println("Jadi Luas Segitiga adalah :" +luas);

}
}
    

