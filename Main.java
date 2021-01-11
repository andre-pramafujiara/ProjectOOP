package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double dtk;
        int pil, pilih;
        String back = "Y";
        while (back.equalsIgnoreCase("Y")) {
            System.out.println("----------------------------");
            System.out.println("\t|   SATUAN WAKTU   |");
            System.out.println("----------------------------");
            System.out.println("\t1. Jam");
            System.out.println("\t2. Menit");
            System.out.println("\t3. Detik");
            System.out.println("----------------------------");
            System.out.print("Masukkan Pilihan : ");pil = in.nextInt();
            if(pil == 1){
                Jam A = new Jam();
                System.out.println();
                System.out.print("Masukkan Jumlah Jam : ");A.setJam(in.nextDouble());
                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("| Akan Dikonversikan Dalam Bentuk : | ");
                System.out.println("-------------------------------------");
                System.out.println("\t1. Satuan Menit");
                System.out.println("\t2. Satuan Detik");
                System.out.println("-------------------------------------");
                System.out.print("Masukkan Pilihan : "); pilih = in.nextInt();
                if(pilih == 1){
                    System.out.println("\tHasil Konversi : "+A.getJam()+" Jam  = "+A.kmnt()+" Menit");
                }
                if(pilih == 2){
                    System.out.println("\tHasil Konversi "+A.getJam()+" Jam Adalah : "+A.Detik()+" Detik");
                }
            }

            if(pil == 2){
                Menit B = new Menit();
                System.out.print("Masukkan Jumlah Menit : "); B.setMenit(in.nextDouble());
                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("| Akan Dikonversikan Dalam Bentuk : | ");
                System.out.println("-------------------------------------");
                System.out.println("\t1. Satuan Jam");
                System.out.println("\t2. Satuan Detik");
                System.out.println("-------------------------------------");
                System.out.print("Masukkan Pilihan : "); pilih = in.nextInt();
                if(pilih == 1){
                    System.out.println("Hasil Konversi "+B.getMenit()+" Adalah : "+B.Jam()+" Jam");
                }
                if(pilih == 2){
                    System.out.println("Hasil Konversi "+B.getMenit()+" Adalah : "+B.kdtk()+" Detik");
                }
            }

            if(pil == 3){
                Detik C = new Detik();
                System.out.print("Masukkan Jumlah Detik : ");C.setDetik(in.nextDouble());
                System.out.println();
                System.out.println("-------------------------------------");
                System.out.println("| Akan Dikonversikan Dalam Bentuk : | ");
                System.out.println("-------------------------------------");
                System.out.println("\t1. Satuan Jam");
                System.out.println("\t2. Satuan Menit");
                System.out.println("-------------------------------------");
                System.out.print("Masukkan Pilihan : "); pilih = in.nextInt();
                if(pilih == 1){
                    System.out.println("Hasil Konversi "+C.getDetik()+" Adalah : "+C.kjam()+" Jam");
                }
                if(pilih == 2){
                    System.out.println("Hasil Konversi "+C.getDetik()+" Adalah : "+C.Menit()+" Menit");
                }
            }
            System.out.println();
            System.out.print("Kembali ke Menu ? Y/T : ");
            back = in.next();
            // write your code here
        }

    }
}
