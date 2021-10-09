public class GajiPokokPlusKomisiKaryawan {
    public String namaDepan;
    public String namaBelakang;
    public String nomorKTP;
    private double penjualanKotor;
    private double tarifKomisi;
    private double gajiPokok;

    public GajiPokokPlusKomisiKaryawan(String namaDepan, String namaBelakang, String nomorKTP, double penjualanKotor, double tarifKomisi, double gajiPokok) {
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.nomorKTP = nomorKTP;
        this.penjualanKotor = penjualanKotor;
        if (penjualanKotor < 0.0)
            throw new IllegalArgumentException("Penjualan Kotor harus >= 0.0");
        this.tarifKomisi = tarifKomisi;
        if (tarifKomisi <= 0.0 || tarifKomisi >= 1.0 )
            throw new IllegalArgumentException("Tarif Komisi harus > 0.0 dan < 1.0");
        this.gajiPokok = gajiPokok;
        if (gajiPokok < 0.0)
            throw new IllegalArgumentException("Gaji Pokok harus >= 0.0");
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
    public void setGajiPokok(double gajiPokok){
        if (gajiPokok < 0.0)
            throw new IllegalArgumentException("Gaji pokok harus >= 0.0");
        this.gajiPokok = gajiPokok;
    }
    public double getGajiPokok(){
       return gajiPokok;
    }
    public double pendapatan() {
        return gajiPokok + (tarifKomisi * penjualanKotor);
    }
    @Override
    public String toString(){
        return String.format("%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f\n%s: %.2f", "gaji pokok komisi karyawan ", namaDepan,
                namaBelakang, "nomor KTP ", nomorKTP, "penjualan kotor ", penjualanKotor, "tarif komisi ", tarifKomisi, "gaji pokok ", gajiPokok, "pendapatan", pendapatan());
    }

}
