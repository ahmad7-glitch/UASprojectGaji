package model;

public class Karyawan extends Pegawai {
    public Karyawan(int masuk, int keluar, boolean istri, int anak) {
        super(masuk, keluar, istri, anak);
    }

    @Override
    public double hitungTotalGaji() {
        double gaji = 1500000 + 250000;

        if (punyaIstri) gaji += 200000;

        if (jumlahAnak == 1) gaji += 60000;
        else if (jumlahAnak > 1) gaji += 130000;

        gaji += hitungLembur() * 5000;
        gaji -= potonganMasuk() * 100000;
        gaji -= potonganKeluar() * 100000;

        return gaji;
    }
    
}
