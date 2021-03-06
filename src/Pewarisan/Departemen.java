package Pewarisan;

import java.util.ArrayList;

public class Departemen {
    private String nama;
    private ArrayList<Karyawan> karyawan;

    public Departemen(String nama){
        karyawan = new ArrayList<>();
        this.nama = nama;
    }

    public void addKaryawan(Karyawan k){
        karyawan.add(k);
    }

    public void displayAll(){
        System.out.println("Karyawan : ");
        for(Karyawan k: karyawan){
            k.display();
        }
    }

    public void displayKontrak(){
        System.out.println("Karyawan Kontrak : ");
        for(Karyawan k: karyawan){
            if (k instanceof Kontrak) {
                Kontrak kontrak = (Kontrak) k;
                kontrak.display();
            }
        }
    }

    public void displayTetap(){
        System.out.println("Karyawan Tetap : ");
        for (Karyawan k: karyawan) {
            if (k instanceof Tetap) {
                Tetap tetap = (Tetap) k;
                tetap.display();
            }
        }
    }
}
