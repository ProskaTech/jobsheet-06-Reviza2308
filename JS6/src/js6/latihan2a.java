/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
    Created By : 21343031_Muhammad Reviza Dekry
*/
package js6;

import javax.swing.JOptionPane;

/**
 *
 * @author Revskyyy
 */
public class latihan2a {
     public static void main(String[] args) {
        String angka = "";
        angka = JOptionPane.showInputDialog("Silahkan masukkan angka ");
        int input = Integer.valueOf(angka).intValue();
        String hasil = "";
        
        hasil += "Angka yang dimasukkan  : " +angka +"\n" ;
        if (input >= 1 && input <= 10) {
            hasil += "Valid number";
            
        } else {
            hasil += "Invalid Number";
            
        }
        
        JOptionPane.showMessageDialog(null, hasil);
    }
}
