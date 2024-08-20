import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) {
        double jam, tarif, pajak, gaji;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan tarif kerja/jam: ");
        tarif = input.nextDouble();
        System.out.println("Masukkan jumlah jam kerja: ");
        jam = input.nextDouble();
        System.out.println("Masukkan pajak: ");
        pajak = input.nextDouble();

        gaji=tarif*jam;
        pajak=(pajak/100)*gaji;
        gaji=gaji-pajak;
        System.out.println("Total gaji bersih: "+gaji);
    }
}
