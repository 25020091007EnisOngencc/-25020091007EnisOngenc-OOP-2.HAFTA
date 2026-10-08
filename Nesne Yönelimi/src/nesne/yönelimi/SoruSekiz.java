package nesne.yönelimi;

import java.util.Scanner;

class QuadraticEquation {
    // Private katsayı alanları
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (b * b) - (4 * a * c);
    }

    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta < 0) {
            return 0;
        }
        return (-b - Math.sqrt(delta)) / (2 * a);
    }
}

public class SoruSekiz {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("a, b, c katsayilarini giriniz: ");
        double a = girdi.nextDouble();
        double b = girdi.nextDouble();
        double c = girdi.nextDouble();

        QuadraticEquation denklem = new QuadraticEquation(a, b, c);
        double diskriminant = denklem.getDiscriminant();

        if (diskriminant > 0) {
            System.out.printf("Denklemin iki farklı kökü vardır:%n");
            System.out.printf("Kök 1: %.6f%n", denklem.getRoot1());
            System.out.printf("Kök 2: %.6f%n", denklem.getRoot2());
        } else if (diskriminant == 0) {
            System.out.printf("Denklemin tek kökü (cakisik) vardir:%n");
            System.out.printf("Kök: %.6f%n", denklem.getRoot1());
        } else {
            System.out.println("The equation has no roots.");
        }

        girdi.close();
    }
}