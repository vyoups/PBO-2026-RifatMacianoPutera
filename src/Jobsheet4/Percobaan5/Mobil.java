package Jobsheet4.Percobaan5;

public class Mobil {
    private String merk;
    private Mesin mesin;

    public Mobil(String merk) {
        this.merk = merk;
        this.mesin = new Mesin();
    }

    public void tampilkanInfo() {
        System.out.println("Merk Mobil: " + merk);
        System.out.println("Tipe Mesin: " + mesin.getTipe());
    }
}
