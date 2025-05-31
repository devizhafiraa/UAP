package uap.models;

import uap.bases.Bentuk;

public class Sphere extends Bentuk {
    private double r;

    public Sphere(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * r * r * r;
    }

    @Override
    public double getLuasPermukaan() {
        return 4 * PI * r * r;
    }

    @Override
    public double getMassa() {
        return getVolume() * DENSITAS;
    }

    @Override
    public double getKg() {
        return getMassa() / 1000.0;
    }

    @Override
    public int getBiayaKirim() {
        return (int) Math.ceil(getKg()) * 10000;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getLuasPermukaan());
        System.out.printf("Massa           : %.2f\n", getMassa());
        System.out.printf("Massa dalam kg  : %.2f\n", getKg());
        System.out.printf("Biaya kirim     : Rp%d\n", getBiayaKirim());
    }
}
