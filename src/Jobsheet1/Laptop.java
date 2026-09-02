package Jobsheet1;

public class Laptop extends Perangkat {
    int ram;
    int penyimpanan;

    void bukaLaptop() {
        System.out.println("Laptop dibuka");
    }

    void tutupLaptop() {
        System.out.println("Laptop ditutup");
    }

    void cetakInfo() {
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Penyimpanan: " + penyimpanan + " GB");
    }
}