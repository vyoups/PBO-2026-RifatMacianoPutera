package Jobsheet4.Tugas;

public class Anggota {
    private String nama;
    private String idAnggota;
    private Buku[] bukuDipinjam;
    private int jumlahPinjam;

    public Anggota(String nama, String idAnggota) {
        this.nama = nama;
        this.idAnggota = idAnggota;
        this.bukuDipinjam = new Buku[5];
        this.jumlahPinjam = 0;
    }

    public void pinjamBuku(Buku buku) {
        if (jumlahPinjam < bukuDipinjam.length) {
            bukuDipinjam[jumlahPinjam] = buku;
            jumlahPinjam++;
        }
    }

    public String getNama() {
        return nama;
    }

    public String info() {
        String info = nama + " (" + idAnggota + ") meminjam:\n";
        for (int i = 0; i < jumlahPinjam; i++) {
            info += "  - " + bukuDipinjam[i].info() + "\n";
        }
        return info;
    }
}