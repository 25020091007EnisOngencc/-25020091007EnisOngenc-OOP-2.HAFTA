package nesne.yönelimi;

import java.util.Scanner;

class Location {
    public int row;
    public int column;
    public double maxValue;

    public Location(int row, int column, double maxValue) {
        this.row = row;
        this.column = column;
        this.maxValue = maxValue;
    }

    public static Location locateLargest(double[][] a) {
        int maxRow = 0;
        int maxCol = 0;
        double maxVal = a[0][0];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] > maxVal) {
                    maxVal = a[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }

        return new Location(maxRow, maxCol, maxVal);
    }
}

public class SoruOnBir {
    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);

        System.out.print("Dizideki satir ve sutun sayisini giriniz: ");
        int rows = girdi.nextInt();
        int columns = girdi.nextInt();

        double[][] dizi = new double[rows][columns];

        System.out.println("Diziyi giriniz:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                dizi[i][j] = girdi.nextDouble();
            }
        }

        Location enBuyuk = Location.locateLargest(dizi);

        if (enBuyuk.maxValue == (long) enBuyuk.maxValue) {
            System.out.printf("The location of the largest element is %d at (%d, %d)%n",
                    (long) enBuyuk.maxValue, enBuyuk.row, enBuyuk.column);
        } else {
            System.out.printf("The location of the largest element is %s at (%d, %d)%n",
                    enBuyuk.maxValue, enBuyuk.row, enBuyuk.column);
        }

        girdi.close();
    }
}