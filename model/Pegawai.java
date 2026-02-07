package model;

//import service.HitungGaji;

public abstract class Pegawai {
    protected int jamMasuk;
    protected int jamKeluar;
    protected int jumlahAnak;
    protected boolean punyaIstri;

    public Pegawai(int masuk, int keluar, boolean istri, int anak) {
        this.jamMasuk = masuk;
        this.jamKeluar = keluar;
        this.punyaIstri = istri;
        this.jumlahAnak = anak;
    }

    public abstract double hitungTotalGaji();
    protected int hitungLembur() {
        return jamKeluar > 17 ? jamKeluar - 17 : 0;
    }
    protected int potonganMasuk() {
        return jamMasuk > 7 ? jamMasuk - 7 : 0;
    }
    protected int potonganKeluar() {
        return jamKeluar < 17 ? 17 - jamKeluar : 0;
    }
}