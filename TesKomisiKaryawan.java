public class TesKomisiKaryawan {
    public static void main(String args[]) {
    KomisiKaryawan karyawan = new KomisiKaryawan ("Sue", "Jones","222-22-222", 10000,.06);

    System.out.println("Informasi karyawan diperoleh dengan properti dan motode : \n");
    System.out.printf("%s %s\n" , "Nama depan ", karyawan.getNamaDepan());
    System.out.printf("%s %s\n", "Nama belakang ", karyawan.getNamaBelakang());
    System.out.printf("%s %s\n", "Nomor KTP adalah ", karyawan.getNomorKTP());
    System.out.printf("%s %.2f\n", "Penjualan Kotor adalah  ", karyawan.getPenjualanKotor());
    System.out.printf("%s %.2f\n", "Tarif Komisi adalah ", karyawan.getTarifKomisi());
    System.out.printf("%s %.2f\n", "Pendapatan adalah ", karyawan.pendapatan());

    karyawan.setPenjualanKotor(500);
    karyawan.setTarifKomisi(.1);

    System.out.printf("\n%s: \n\n%s\n", "Informasi karyawan yang diperbarui diperoleh oleh toString", karyawan );
    }
}

