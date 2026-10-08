package nesne.yönelimi;

import java.util.Random;

// 1. Sınıf: public OLMADAN yazılır
class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.startTime = System.currentTimeMillis();
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }
}

public class SoruDort {
    public static void main(String[] args) {
        int boyut = 100_000;
        int[] sayilar = new int[boyut];
        Random rastgele = new Random();

        for (int i = 0; i < boyut; i++) {
            sayilar[i] = rastgele.nextInt(1_000_000);
        }

        StopWatch kronometre = new StopWatch();

        System.out.println("100.000 eleman Selection Sort ile siralaniyor...");
        
        kronometre.start();
        selectionSort(sayilar);
        kronometre.stop();

        System.out.println("Siralama tamamlandi!");
        System.out.println("Gecen sure: " + kronometre.getElapsedTime() + " milisaniye (" 
                + (kronometre.getElapsedTime() / 1000.0) + " saniye)");
    }

    public static void selectionSort(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            int minIndeks = i;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[minIndeks]) {
                    minIndeks = j;
                }
            }
            int gecici = dizi[minIndeks];
            dizi[minIndeks] = dizi[i];
            dizi[i] = gecici;
        }
    }
}