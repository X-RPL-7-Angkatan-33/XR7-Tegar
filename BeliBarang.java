import java.util.Scanner;

public class BeliBarang {

    public static void main(String[] args) {
        double harga, jumlah, diskon, total;

        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan harga barang: ");
        harga = input.nextDouble();
        System.out.println("Masukkan jumlah barang: ");
        jumlah = input.nextDouble();
        System.out.println("Masukkan diskon: ");
        diskon = input.nextDouble();

        total=harga*jumlah;
        diskon=(diskon/100)*total;
        total=total-diskon;
        System.out.println("Total harga: "+total);
    
    }        
}
