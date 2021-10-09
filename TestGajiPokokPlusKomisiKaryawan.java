public class TesGajiPokokPlusKomisiKaryawan {
    public static void main(String args[]) {

            GajiPokokPlusKomisiKaryawan karyawan = new GajiPokokPlusKomisiKaryawan("Bob", "Lewis", "333-33-333", 5000, .04, 300);

            System.out.println("Informasi karyawan diperoleh dengan properti dan motode : \n");
            System.out.printf("%s %s\n" , "Nama depan ", karyawan.getNamaDepan());
            System.out.printf("%s %s\n", "Nama belakang ", karyawan.getNamaBelakang());
            System.out.printf("%s %s\n", "Nomor KTP adalah ", karyawan.getNomorKTP());
            System.out.printf("%s %.2f\n", "Penjualan Kotor adalah", karyawan.getPenjualanKotor());
            System.out.printf("%s %.2f\n", "Tarif Komisi adalah ", karyawan.getTarifKomisi());
            System.out.printf("%s %.2f\n", "Pendapatan adalah ", karyawan.pendapatan());
            System.out.printf("%s %s\n", "Gaji pokok adalah ", karyawan.getGajiPokok());

            karyawan.setGajiPokok(1000);

            System.out.printf("\n%s: \n\n%s\n", "Informasi karyawan yang diperbarui diperoleh oleh toString", karyawan);

    }
}
