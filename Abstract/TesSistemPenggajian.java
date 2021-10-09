package Abstract;

public class TesSistemPenggajian {
    public static void main(String[] args){
        Karyawan[] karyawan = {new GajiKaryawan("John","Smith","111-11-1111", 800.00),
                new GajiPerJamKaryawan("Karen", "Price", "222-22-2222", 16.75, 40.0),
                new KomisiKaryawan("Sue","Jones", "333-33-3333",10000, .06),
                new GajiPokokPlusKomisiKaryawan("Bob", "Lewis", "444-44-4444", 5000, .04, 300)};

        for (Karyawan karyawanSaatIni : karyawan)
            System.out.printf("%s%n%s%.2f%n%n",karyawanSaatIni, "Pendapatan :", karyawanSaatIni.getJumlahPendapatan());
    }
}


