package Jobsheet4.Percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private Pegawai masinis;
    private Pegawai asisten;

    public KeretaApi(String nama, String kelas, Pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    public KeretaApi(String nama, String kelas, Pegawai masinis, Pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setMasinis(Pegawai masinis){
        this.masinis = masinis;
    }

    public Pegawai getMasinis(){
        return masinis;
    }

    public void setAsisten(Pegawai asisten){
        this.asisten = asisten;
    }

    public Pegawai getAsisten(){
        return asisten;
    }

    public String info(){
        String info = "";
        info += "Nama: " + nama + "\n";
        info += "Kelas: " + kelas + "\n";
        info += "Masinis: " + masinis.info() + "\n";
        if (this.asisten != null){
            info += "Asisten: " + asisten.info() + "\n";
        }
        return info;
    }
}
