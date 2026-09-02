package Jobsheet1;

public class Perangkat {
    String merk;
    String tahunRilis;

    void nyalakan() {
        System.out.println("Perangkat dinyalakan");
    }

    void matikan() {
        System.out.println("Perangkat dimatikan");
    }

    void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun Rilis: " + tahunRilis);
    }
}