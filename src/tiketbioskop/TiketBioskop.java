/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiketbioskop;

import java.util.ArrayList;

/**
 *
 * @author Fani Salamah
 */
public class TiketBioskop {
    public static ArrayList<Film> filmList = new ArrayList<>();
    public static ArrayList<Transaksi> transaksi = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        filmList.add(new Film("Avengers"));
        filmList.add(new Film("Aladdin"));
        filmList.add(new Film("The Boss Baby"));
        filmList.add(new Film("Dilan 1991"));
        filmList.add(new Film("Filosofi Kopi 2"));
        filmList.add(new Film("Yowis Ben 2"));
        // TODO code application logic here
        new MenuUtama().setVisible(true);
    }
    
}
