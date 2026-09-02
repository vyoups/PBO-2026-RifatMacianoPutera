package Jobsheet1;

public class Demo {
    public static void main(String[] args) {

        Perangkat perangkat = new Perangkat();
        perangkat.merk = "Generic";
        perangkat.tahunRilis = "2024";

        perangkat.nyalakan();
        perangkat.matikan();
        perangkat.cetakInfo();

        System.out.println();

        Laptop laptop = new Laptop();
        laptop.merk = "ASUS";
        laptop.tahunRilis = "2024";
        laptop.ram = 16;
        laptop.penyimpanan = 512;

        laptop.bukaLaptop();
        laptop.tutupLaptop();
        laptop.cetakInfo();

        System.out.println();

        LaptopGaming laptopGaming = new LaptopGaming();
        laptopGaming.merk = "Lenovo";
        laptopGaming.tahunRilis = "2025";
        laptopGaming.ram = 16;
        laptopGaming.penyimpanan = 1024;
        laptopGaming.gpu = "RTX 4060";
        laptopGaming.refreshRate = 144;

        laptopGaming.mainGame();
        laptopGaming.aktifkanGaming();
        laptopGaming.cetakInfo();

        System.out.println();

        HP hp = new HP();
        hp.merk = "Infinix";
        hp.tahunRilis = "2025";
        hp.sistemOperasi = "Android";
        hp.kapasitasBaterai = 5000;

        hp.telepon();
        hp.ambilFoto();
        hp.cetakInfo();

        System.out.println();

        Monitor monitor = new Monitor();
        monitor.merk = "Samsung";
        monitor.tahunRilis = "2024";
        monitor.ukuranLayar = 24;
        monitor.resolusi = "1920x1080";

        monitor.nyalakanMonitor();
        monitor.aturKecerahan();
        monitor.cetakInfo();
    }
}