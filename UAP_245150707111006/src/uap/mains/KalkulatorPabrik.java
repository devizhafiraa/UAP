package uap.mains;

import java.util.Scanner;
import uap.models.*;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("Devi Zhafira Alya Augusta");
        System.out.println("245150707111006");
        System.out.println("=============================================");

        // Donat dengan lubang
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        System.out.print("Isikan Radius   : ");
        double R = sc.nextDouble(); // 7
        System.out.print("Isikan radius   : ");
        double r = sc.nextDouble(); // 3.5
        System.out.println("=============================================");

        Torus torus = new Torus(R, r);
        torus.printInfo();

        System.out.println("=============================================");

        // Donat tanpa lubang
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double rs = sc.nextDouble(); // 21
        System.out.println("=============================================");

        Sphere bola = new Sphere(rs);
        bola.printInfo();

        System.out.println("=============================================");
    }
}
