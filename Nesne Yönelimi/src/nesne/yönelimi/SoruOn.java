package nesne.yönelimi;

import java.util.Scanner;

class LinearEquation {
    private double a;
    private double b;
    private double c;
    private double d;
    private double e;
    private double f;

    public LinearEquation(double a, double b, double c, double d, double e, double f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
    public double getD() { return d; }
    public double getE() { return e; }
    public double getF() { return f; }

    public boolean isSolvable() {
        return (a * d - b * c) != 0;
    }

    public double getX() {
        return (e * d - b * f) / (a * d - b * c);
    }

    public double getY() {
        return (a * f - e * c) / (a * d - b * c);
    }
}

public class SoruOn {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("x1, y1, x2, y2, x3, y3, x4, y4 degerlerini giriniz: ");
        double x1 = girdi.nextDouble();
        double y1 = girdi.nextDouble();
        double x2 = girdi.nextDouble();
        double y2 = girdi.nextDouble();
        double x3 = girdi.nextDouble();
        double y3 = girdi.nextDouble();
        double x4 = girdi.nextDouble();
        double y4 = girdi.nextDouble();

        double a = y1 - y2;
        double b = -(x1 - x2);
        double c = y3 - y4;
        double d = -(x3 - x4);
        double e = (y1 - y2) * x1 - (x1 - x2) * y1;
        double f = (y3 - y4) * x3 - (x3 - x4) * y3;

        LinearEquation denklem = new LinearEquation(a, b, c, d, e, f);

        if (denklem.isSolvable()) {
            System.out.printf("The intersecting point is at (%.5f, %.5f)%n", 
                              denklem.getX(), denklem.getY());
        } else {
            System.out.println("The two lines are parallel (no intersecting point).");
        }

        girdi.close();
    }
}