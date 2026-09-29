package Jobsheet4.Tugas;

public class MainTugas {
    public static void main(String[] args) {
        Perpustakaan pustaka = new Perpustakaan("Polinema Library");

        Buku b1 = new Buku("Belajar Java", "Herbert Schildt");
        Buku b2 = new Buku("Clean Code", "Robert Martin");

        Anggota a1 = new Anggota("Riska Khoirotun", "A001");
        a1.pinjamBuku(b1);
        a1.pinjamBuku(b2);

        pustaka.daftarkanAnggota(a1);

        Printer printer = new Printer("Epson L3110");
        pustaka.cetakLaporan(printer);
    }
}