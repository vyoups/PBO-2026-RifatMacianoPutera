package Jobsheet4.Tugas;

public class Perpustakaan {
    private String nama;
    private Anggota[] daftarAnggota;
    private int jumlahAnggota;
    private Petugas petugas;

    public Perpustakaan(String nama) {
        this.nama = nama;
        this.daftarAnggota = new Anggota[10];
        this.jumlahAnggota = 0;
        this.petugas = new Petugas("Budi", "P001"); // Composition: dibuat sendiri
    }

    public void daftarkanAnggota(Anggota anggota) { // Aggregation: diterima dari luar
        if (jumlahAnggota < daftarAnggota.length) {
            daftarAnggota[jumlahAnggota] = anggota;
            jumlahAnggota++;
        }
    }

    public void cetakLaporan(Printer printer) { // Dependency: cuma lewat parameter
        printer.cetak("Laporan Perpustakaan " + nama);
        printer.cetak(petugas.info());
        for (int i = 0; i < jumlahAnggota; i++) {
            printer.cetak(daftarAnggota[i].info());
        }
    }
}