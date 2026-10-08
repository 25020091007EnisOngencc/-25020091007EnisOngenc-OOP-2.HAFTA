package nesne.yönelimi;

import java.util.Scanner;

class LinearEquation {
    // Private veri alanları
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    // Altı katsayıyı alan yapıcı metot
    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    // Getter metotları
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    // (ad - bc) sıfır değilse denklem çözülebilirdir
    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    // x = (ed - bf) / (ad - bc)
    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    // y = (af - ec) / (ad - bc)
    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

// Test Sınıfı (Dosya adı: TestLinearEquation.java)
public class SoruDokuz {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("a, b, c, d, e, f degerlerini giriniz: ");
        double a = girdi.nextDouble();
        double b = girdi.nextDouble();
        double c = girdi.nextDouble();
        double d = girdi.nextDouble();
        double e = girdi.nextDouble();
        double f = girdi.nextDouble();

        LinearEquation denklem = new LinearEquation(a, b, c, d, e, f);

        if (denklem.isSolvable()) {
            System.out.printf("x = %.2f, y = %.2f%n", denklem.getX(), denklem.getY());
        } else {
            System.out.println("The equation has no solution.");
        }

        girdi.close();
    }
}