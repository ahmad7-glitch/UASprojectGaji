package model;

public class HRD extends Pegawai {
    public HRD(int masuk, int keluar, boolean istri, int anak) {
        super(masuk, keluar, istri, anak);
    }

    @Override
    public double hitungTotalGaji() {
        double gaji = 5000000 + 750000;

        if (punyaIstri) gaji += 250000;
        
        if (jumlahAnak ==1) gaji += 90000;
        else if (jumlahAnak >1) gaji += 190000;

        gaji += hitungLembur() * 7500;
        gaji -= potonganMasuk() * 100000;
        gaji -= potonganKeluar() * 100000;

        return gaji;
    }
}
