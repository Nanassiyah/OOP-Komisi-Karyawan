package Inheritance;

public class KomisiKaryawan {
    public String namaDepan;
    public String namaBelakang;
    public String nomorKTP;
    private double penjualanKotor;
    private double tarifKomisi;

    public KomisiKaryawan(String namaDepan, String namaBelakang, String nomorKTP, double penjualanKotor, double tarifKomisi) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.nomorKTP = nomorKTP;
        this.penjualanKotor = penjualanKotor;
        if (penjualanKotor < 0.0)
            throw new IllegalArgumentException("Penjualan Kotor harus >= 0.0");
        this.tarifKomisi = tarifKomisi;
        if (tarifKomisi <= 0.0 || tarifKomisi >= 1.0 )
            throw new IllegalArgumentException("Tarif Komisi harus > 0.0 dan < 1.0");
    }
    public String getNamaDepan(){
        return this.namaDepan;
    }
    public String getNamaBelakang(){
        return this.namaBelakang;
    }
    public String getNomorKTP(){
        return this.nomorKTP;
    }
    public void setPenjualanKotor(double penjualanKotor){
        if (penjualanKotor < 0.0)
            throw new IllegalArgumentException("Penjualan Kotor harus >= 0.0");

        this. penjualanKotor = penjualanKotor;
    }
    public double getPenjualanKotor(){
        return penjualanKotor;
    }
    public void setTarifKomisi(double tarifKomisi) {
        if (tarifKomisi <= 0.0 || tarifKomisi >= 1.0 )
            throw new IllegalArgumentException("Tarif Komisi harus > 0.0 dan < 1.0");

        this.tarifKomisi = tarifKomisi;
    }
    public double getTarifKomisi(){
        return tarifKomisi;
    }
    public double pendapatan (){
        return this.tarifKomisi * this.penjualanKotor;
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", "komisi karyawan", namaDepan, namaBelakang,
                "nomor KTP ", nomorKTP, "penjualan kotor ", penjualanKotor, "tarif komisi ", tarifKomisi, "pendapatan ", pendapatan());
    }
}
