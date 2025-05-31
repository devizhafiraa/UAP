package uap.bases;

import uap.interfaces.*;

public abstract class Bentuk implements Hitung, Konversi {
    protected static final double PI = 22.0 / 7;
    protected static final double DENSITAS = 8;

    public abstract void printInfo();
}
