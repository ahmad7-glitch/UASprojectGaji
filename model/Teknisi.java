package model;

public class Teknisi extends Pegawai {
    public Teknisi(int masuk, int keluar, boolean istri, int anak) {
        super(masuk, keluar, istri, anak);
    }

    @Override
    public double hitungTotalGaji() {
        double gaji = 3000000 + 500000;

        if (punyaIstri) gaji += 200000;

        if (jumlahAnak == 1) gaji += 75000;
        else if (jumlahAnak > 1) gaji += 150000;

        gaji += hitungLembur() * 5000;
        gaji -= potonganMasuk() * 100000;
        gaji -= potonganKeluar() * 100000;

        return gaji;
    }
    
}
