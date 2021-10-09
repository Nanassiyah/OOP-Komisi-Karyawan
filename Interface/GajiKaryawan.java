package Interface;

public class GajiKaryawan extends Karyawan{
    private double gajiMingguan;

    public GajiKaryawan(String namaDepan, String namaBelakang, String nomorKTP, double gajiMingguan){
        super(namaDepan, namaBelakang, nomorKTP);
        if (gajiMingguan < 0.0)
            throw new IllegalArgumentException("Gaji mingguan harus >= 0.0");
        this.gajiMingguan = gajiMingguan;
    }

    public void setGajiMingguan(double gajiMingguan){
        if (gajiMingguan < 0.0)
            throw new IllegalArgumentException("Gaji mingguan harus >= 0.0");
        this.gajiMingguan = gajiMingguan;
    }
    public double getGajiMingguan(){
        return gajiMingguan;
    }

    @Override
    public double pendapatan(){
        return getGajiMingguan();
    }

    @Override
    public String toString(){
        return String.format("Gaji Pegawai : %s%n%s: $%,.2f", super.toString(), "Gaji mingguan", getGajiMingguan());
    }

    @Override
    public double getJumlahPembayaran() {
        return pendapatan();
    }
}

