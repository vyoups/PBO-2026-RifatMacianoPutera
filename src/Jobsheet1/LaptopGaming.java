package Jobsheet1;

public class LaptopGaming extends Laptop {
    String gpu;
    int refreshRate;

    void mainGame() {
        System.out.println("Laptop gaming menjalankan game");
    }

    void aktifkanGaming() {
        System.out.println("Mode gaming diaktifkan");
    }

    void cetakInfo() {
        System.out.println("GPU: " + gpu);
        System.out.println("Refresh Rate: " + refreshRate + " Hz");
    }
}