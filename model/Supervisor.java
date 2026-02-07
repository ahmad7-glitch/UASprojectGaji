package model;

public class Supervisor extends Pegawai {
    public Supervisor(int masuk, int keluar, boolean istri, int anak) {
        super(masuk, keluar, istri, anak);
    }

    @Override
    public double hitungTotalGaji() {
        double gaji = 10000000 + 1000000;

        if (punyaIstri) gaji += 300000;

        if (jumlahAnak == 1) gaji += 100000;
        else if (jumlahAnak > 1) gaji += 200000;

        gaji += hitungLembur() * 10000;
        gaji -= potonganMasuk() * 100000;
        gaji -= potonganKeluar() * 100000;

        return gaji;
    }
    
}
