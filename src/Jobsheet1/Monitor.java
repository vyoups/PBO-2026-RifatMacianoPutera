package Jobsheet1;

public class Monitor extends Perangkat {
    double ukuranLayar;
    String resolusi;

    void nyalakanMonitor() {
        System.out.println("Monitor dinyalakan");
    }

    void aturKecerahan() {
        System.out.println("Kecerahan monitor diatur");
    }

    void cetakInfo() {
        System.out.println("Ukuran Layar: " + ukuranLayar + " inch");
        System.out.println("Resolusi: " + resolusi);
    }
}