package Inheritance;

import BasePlusComissionEmployee.GajiPokokPlusKomisiKaryawan;

public class TestPolimorpihsm {
    public static void main (String args[]){
        KomisiKaryawan komisiKaryawan = new KomisiKaryawan("Sue", "Jones", "222-22-222", 10000, .06);

        GajiPokokPlusKomisiKaryawan gajiPokokPlusKomisiKaryawan = new GajiPokokPlusKomisiKaryawan("Bob", "Lewis", "333-33-333", 5000, .04, 300);

        System.out.printf("%s %s:\n\n%s\n\n", "Memanggil metode toString dan pendapatan Komisi Karyawan ",
                "dengan referensi kelas dasar ke objek kelas dasar", komisiKaryawan.toString());

        System.out.printf("%s %s:\n\n%s\n\n","Memanggil toString GajiPokokPlusKomisiKaryawan dan",
                " Metode penghasilan dengan referensi kelas turunan ke objek kelas turunan", gajiPokokPlusKomisiKaryawan.toString());

        GajiPokokPlusKomisiKaryawan komisiKaryawan2 = gajiPokokPlusKomisiKaryawan;
        System.out.printf("%s %s:\n\n%s\n\n", "Panggil ToString dan Penghasilan Karyawan BasePlusCommission",
                "metode dengan referensi kelas dasar ke objek kelas turunan", komisiKaryawan2.toString());


    }
}
