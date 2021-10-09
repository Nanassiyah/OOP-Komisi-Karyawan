package Abstract;

public class GajiPerJamKaryawan extends Karyawan{
    private double upah;
    private double jam;

    public GajiPerJamKaryawan(String namaDepan, String namaBelakang, String nomorKTP, double upah, double jam){
        super(namaDepan, namaBelakang, nomorKTP);
        if (upah < 0.0)
            throw new IllegalArgumentException("Upah per jam harus >= 0.0");
        this.upah = upah;
        if ((jam < 0.0) || (jam > 168.0))
            throw new IllegalArgumentException("Jam kerja harus >= 0.0 and <= 168.0");
        this.jam = jam;
    }

    public void setUpah(double upah){
        if (upah < 0.0)
            throw new IllegalArgumentException("Upah per jam harus >= 0.0");
        this.upah = upah;
    }
    public double getUpah(){
        return upah;
    }
    public void setJam(double Jam){
        if ((jam < 0.0) || (jam > 168.0))
            throw new IllegalArgumentException("Jam kerja harus >= 0.0 and <= 168.0");
        this.jam = jam;
    }
    public double getJam(){
        return jam;
    }

    @Override
    public double pendapatan(){
        if (getJam() <= 40)
            return getUpah() * getJam();
        else
            return 40 * getUpah() + (getJam() - 40) * getUpah() * 1.5;
    }

    @Override
    public String toString(){
        return String.format("Karywan per jam : %s%n%s: $%,.2f;\n%s: %,.2f", super.toString(), "Upah per jam",
                getUpah(), "Jam kerja", getJam());
    }
}
