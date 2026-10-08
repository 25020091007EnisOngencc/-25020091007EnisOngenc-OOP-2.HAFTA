package nesne.yönelimi;

class RegularPolygon {
    private int n = 3;
    private double side = 1.0;
    private double x = 0.0;
    private double y = 0.0;

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
        this.x = 0.0;
        this.y = 0.0;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
    }
}

public class SoruYedi {
    public static void main(String[] args) {
        RegularPolygon poligon1 = new RegularPolygon();
        RegularPolygon poligon2 = new RegularPolygon(6, 4);
        RegularPolygon poligon3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("--- 1. Poligon (Varsayilan) ---");
        System.out.printf("Cevre: %.2f%n", poligon1.getPerimeter());
        System.out.printf("Alan : %.4f%n", poligon1.getArea());

        System.out.println("\n--- 2. Poligon (n=6, side=4) ---");
        System.out.printf("Cevre: %.2f%n", poligon2.getPerimeter());
        System.out.printf("Alan : %.4f%n", poligon2.getArea());

        System.out.println("\n--- 3. Poligon (n=10, side=4, x=5.6, y=7.8) ---");
        System.out.printf("Cevre: %.2f%n", poligon3.getPerimeter());
        System.out.printf("Alan : %.4f%n", poligon3.getArea());
    }
}