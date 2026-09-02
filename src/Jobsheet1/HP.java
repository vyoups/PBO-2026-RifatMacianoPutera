package Jobsheet1;

public class HP extends Perangkat {
    String sistemOperasi;
    int kapasitasBaterai;

    void telepon() {
        System.out.println("HP digunakan untuk menelepon");
    }

    void ambilFoto() {
        System.out.println("HP digunakan untuk mengambil foto");
    }

    void cetakInfo() {
        System.out.println("Sistem Operasi: " + sistemOperasi);
        System.out.println("Baterai: " + kapasitasBaterai + " mAh");
    }
}