package main;

import model.*;

public class MainApp {
    public static void main(String[] args) {

        Pegawai p1 = new Supervisor(7, 18, true, 2);
        Pegawai p2 = new Teknisi(8, 16, false, 0);
        Pegawai p3 = new HRD(9, 19, true, 1);
        Pegawai p4 = new Karyawan(7, 17, true, 1);

        System.out.printf("Gaji Supervisor : %.0f\n", p1.hitungTotalGaji());
        System.out.printf("Gaji Teknisi    : %.0f\n", p2.hitungTotalGaji());
        System.out.printf("Gaji HRD        : %.0f\n", p3.hitungTotalGaji());
        System.out.printf("Gaji Karyawan   : %.0f\n", p4.hitungTotalGaji());
    }
}