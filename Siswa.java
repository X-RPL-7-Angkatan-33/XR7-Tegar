//Object Class
public class Siswa {
    int id;
    String nama;
    double ipk;

    //Constructor
    //nama harus sama dgn Class
    public Siswa() {
        id = 0;
        nama = "kosong";
        ipk = 0.0;
    } 

    //Constructor Parameter
    public Siswa (int id, String nama, double ipk) {
        //variabel = parameter
        this.id = id;
        this.nama = nama;   //kalo gamau pake this, pake nama parameter dan variabel berbeda, tapi lebih umum pake this.
        this.ipk = ipk;
    }
    //methot print
    public void print () {
        System.out.println("      ");
        System.out.println("Nama : " + nama);
        System.out.println("ID : " + id);
        System.out.println("IPK : " + ipk);
        System.out.println("   ");
    }
}