package Abstract;

public class KomisiKaryawan extends Karyawan{
    private double penjualanKotor;
    private double tarifKomisi;

    public KomisiKaryawan(String namaDepan, String namaBelakang, String nomorKTP, double penjualanKotor, double tarifKomisi){
        super(namaDepan, namaBelakang, nomorKTP);

        if (penjualanKotor < 0.0)
            throw new IllegalArgumentException("Penjualan harus >= 0.0");
        this.penjualanKotor = penjualanKotor;

        if (tarifKomisi <= 0.0 || tarifKomisi >= 1.0)
            throw new IllegalArgumentException("Komisi harus > 0.0 dan < 1.0");
        this.tarifKomisi = tarifKomisi;
    }

    public void setPenjualanKotor(double penualanKotor){
        if (penjualanKotor < 0.0)
            throw new IllegalArgumentException("Penjualan Kotor harus >= 0.0");
        this.penjualanKotor = penjualanKotor;
    }
    public double getPenjualanKotor(){
        return penjualanKotor;
    }
    public void setTarifKomisi(double tarifKomisi){
        if (tarifKomisi <= 0.0 || tarifKomisi >= 1.0)
            throw new IllegalArgumentException("Tarif Komisi harus > 0.0 dan < 1.0");
        this.tarifKomisi = tarifKomisi;
    }
    public double getTarifKomisi(){
        return tarifKomisi;
    }
    public double pendapatan(){
        return getTarifKomisi() * getPenjualanKotor();
    }
    @Override
    public String toString() {
        return String.format("%s: %s%n%s: $%,.2f;\n%s: %.2f", "Komisi Karyawan", super.toString(), "Penjualan kotor",
                getPenjualanKotor(), "Tarif komisi", getTarifKomisi());
    }
}
