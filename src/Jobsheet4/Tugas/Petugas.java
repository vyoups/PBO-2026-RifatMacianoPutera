package Jobsheet4.Tugas;

public class Petugas {
    private String nama;
    private String nip;

    public Petugas(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

    public String info() {
        return "Petugas jaga: " + nama + " (NIP " + nip + ")";
    }
}