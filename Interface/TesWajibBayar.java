package Interface;

public class TesWajibBayar {
    public static void main(String[] args){
        WajibBayar[] wajibBayarObjek = {new Faktur("01234", "kursi",2,375.00),
        new Faktur("56789","ban",4,79.95),
        new GajiKaryawan("Yohanes", "Smith", "111-11-1111", 800.00),
        new GajiKaryawan("Lisa", "Barnes", "888-88-8888", 1200.00)};

        System.out.printf("Faktur dan Karyawan yang diproses secara polimorfisem: ");

        for (WajibBayar wajibBayar : wajibBayarObjek){
            System.out.printf("\n%s \n%s: $%,.2f\n\n", wajibBayar.toString(), "Pembayaran jatuh tempo", wajibBayar.getJumlahPembayaran());
        }
    }
}
