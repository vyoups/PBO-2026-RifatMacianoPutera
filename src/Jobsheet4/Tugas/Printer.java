package Jobsheet4.Tugas;

public class Printer {
    private String merk;

    public Printer(String merk) {
        this.merk = merk;
    }

    public void cetak(String isi) {
        System.out.println("[" + merk + "] Mencetak: " + isi);
    }
}