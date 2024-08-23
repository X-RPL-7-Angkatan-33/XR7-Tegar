//Driver Class

import java.util.Scanner;

public class SiswaTester {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama Siswa: ");
        String nama = input.nextLine();
        System.out.println("Masukkan ID Siswa: ");
        int id = input.nextInt();
        System.out.println("Inputkan IPK Siswa: ");
        double ipk = input.nextDouble();
        
        Siswa manusia = new Siswa (id, nama, ipk);
        manusia.print();
        Siswa aini = new Siswa (1, "Aini", 100); 
        aini.print();
        //object
        //Class object = new Constructor
        
        // Siswa tegar = new Siswa();
        // Siswa naufal = new Siswa();
        // Siswa ryuichi = new Siswa();
        // Siswa bima = new Siswa();
        // Siswa moreno = new Siswa();
        // Siswa shinta = new Siswa(1, "Shinta", 100);
        // Siswa ellovy = new Siswa(2, "Ellovy", 99.9);
        // Siswa yaya = new Siswa(3, "Yaya", 99.9);

        // tegar.id = 16;
        // tegar.nama = "Tegar";
        // tegar.ipk = 0;
        // naufal.id = 28;
        // naufal.nama = "Naufal";
        // naufal.ipk = 100;
        // ryuichi.id = 32;
        // ryuichi.nama = "Ryuichi";
        // ryuichi.ipk = 100;
        // bima.id = 2;
        // bima.nama = "Bima";
        // bima.ipk = 100;
        // moreno.id = 24;
        // moreno.nama = "Moreno";
        // moreno.ipk = 100;

        // System.out.println("Nama : " + tegar.nama);
        // System.out.println("Absen : " + tegar.id);
        // System.out.println("Nilai : " + tegar.ipk);
        // System.out.println("   ");
        // System.out.println("Nama : " + naufal.nama);
        // System.out.println("Absen : " + naufal.id);
        // System.out.println("Nilai : " + naufal.ipk);
        // System.out.println("   ");
        // System.out.println("Nama : " + ryuichi.nama);
        // System.out.println("Absen : " + ryuichi.id);
        // System.out.println("Nilai : " + ryuichi.ipk);
        // System.out.println("   ");
        // System.out.println("Nama : " + bima.nama);
        // System.out.println("Absen : " + bima.id);
        // System.out.println("Nilai : " + bima.ipk);
        // System.out.println("   ");
        // System.out.println("Nama : " + moreno.nama);
        // System.out.println("Absen : " + moreno.id);
        // System.out.println("Nilai : " + moreno.ipk);
        // System.out.println("   ");
        // shinta.print();
        // ellovy.print();
        // yaya.print();
        input.close();
    }
}