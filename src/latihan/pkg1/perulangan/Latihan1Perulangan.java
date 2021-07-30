/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg1.perulangan;

/**
 *
 * @author MOKLET-2
 */
public class Latihan1Perulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b; //input variabel dengan tipe data int
        a=3; //memasukkan variabel a sebagai nilai suku pertama dengan angka 3
        System.out.println("Nilai suku pertama= "+a); //memasukkan output untuk mencetak hasil nilai suku pertama
        b=5; //memasukkan variabel b sebagai selisih antara nilai suku-suku yang berdekatan dengan angka 5
        System.out.println("Nilai selisih setiap suku = "+b); //mencetak hasil nilai selisih setiap suku
        
        for (int i=1;i<=10;i++){ //perulangan
            int Un = a+(i-1)*b; //sebagai operator dengan rumus mencari suku ke-n
            System.out.println("Nilai suku ke- "+i+"adalah = "+Un); //menampilkan hasil operasi mencari suku ke-n
            int Sn = (a+Un)*i/2; //sebagai operator dengan rumus untuk mencari jumlah ke-n
            System.out.println("Jumlah suku ke- "+i+"adalah"+Sn); //menampilkan hasil untuk mencari jumlah ke-n
        }
    }
    
}
