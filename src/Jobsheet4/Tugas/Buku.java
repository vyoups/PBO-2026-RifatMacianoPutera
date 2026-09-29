package Jobsheet4.Tugas;

public class Buku {
    private String judul;
    private String penulis;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public String info() {
        return "Judul: " + judul + " (" + penulis + ")";
    }
}