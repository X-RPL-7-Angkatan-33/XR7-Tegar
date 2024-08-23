import java.util.Scanner;

public class Karyawan1 {
    public static void main(String[] args) {
        // Karyawan shinta = new Karyawan(1, "Shinta", "Head Chef", "Kediri");
        // Karyawan tegar = new Karyawan(2, "Tegar", "CEO", "Tokyo");
        // Karyawan bruce = new Karyawan(3, "Bruce", "Manager", "Gotham" );
        // Karyawan towa = new Karyawan(4, "Towa", "Butler", "Surabaya");
        // Karyawan robin = new Karyawan(5, "Robin", "Assistant Manager", "Paris");
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama: ");
        String nama = input.nextLine();
        System.out.println("Inputkan ID: ");
        int id = input.nextInt();
        System.out.println("Inputkan IPK: ");
        double ipk = input.nextDouble();
        
        Siswa manusia = new Siswa (id, nama, ipk);
        manusia.print();
        // shinta.print();
        // tegar.print();
        // bruce.print();
        // towa.print();
        // robin.print();
        input.close();
    }
}
