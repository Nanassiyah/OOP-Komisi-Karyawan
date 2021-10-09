package Interface;

public class Faktur implements WajibBayar{
    public String nomorBagian;
    public String bagianDeskripsi;
    private int jumlah;
    private double hargaPerItem;

    public Faktur(String nomorBagian, String bagianDeskripsi, int jumlah, double hargaPerItem){
        this.nomorBagian = nomorBagian;
        this.bagianDeskripsi = bagianDeskripsi;
        if (jumlah < 0)
            throw new IllegalArgumentException("Jumlah harus >= 0");
        this.jumlah = jumlah;
        if (hargaPerItem < 0.0)
            throw new IllegalArgumentException("Harga per item harus >= 0");
        this.hargaPerItem = hargaPerItem;
    }
    public String getNomorBagian(){
        return nomorBagian;
    }
    public String getBagianDeskripsi(){
        return bagianDeskripsi;
    }
    public void setJumlah(int jumlah){
        if (jumlah < 0)
            throw new IllegalArgumentException("Jumlah harus >= 0");
        this.jumlah = jumlah;
    }
    public int getJumlah(){
        return jumlah;
    }
    public void setHargaPerItem(double hargaPerItem){
        if (hargaPerItem < 0.0)
            throw new IllegalArgumentException("Harga per item harus >= 0");
        this.hargaPerItem = hargaPerItem;
    }
    public double getHargaPerItem(){
        return hargaPerItem;
    }
    @Override
    public String toString(){
        return String.format("%s: %n%s: %s (%s) %n%s: %d %n%s: $%,.2f", "Faktur", "Nomor bagian", getNomorBagian(),
                getBagianDeskripsi(), "Jumlah", getJumlah(), "Harga per item", getHargaPerItem());
    }
    @Override
    public double getJumlahPembayaran(){
        return getJumlah() * getHargaPerItem();
    }
}
