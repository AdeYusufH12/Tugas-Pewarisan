package Pewarisan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Departemen departemen = new Departemen("");

        //Karyawan Tetap
        Karyawan karyawan1 = new Tetap("Adit", 650000, 3500000);
        Karyawan karyawan2 = new Tetap("Pratama", 550000, 2500000);
        Karyawan karyawan3 = new Tetap("Hengky", 780000, 4500000);

        //Karyawan Kontrak
        Karyawan karyawan4 = new Kontrak("Rafly", 2, 5000000);
        Karyawan karyawan5 = new Kontrak("aji", 4, 4000000);

        departemen.addKaryawan(karyawan1);
        departemen.addKaryawan(karyawan2);
        departemen.addKaryawan(karyawan3);
        departemen.addKaryawan(karyawan4);
        departemen.addKaryawan(karyawan5);

        //Menampilkan Data Karyawan
        departemen.displayAll();

        //Menampilkan Data Karyawan Tetap
        departemen.displayTetap();

        //Menampilkan Data Karyawan Kontrak
        departemen.displayKontrak();
    }
}
