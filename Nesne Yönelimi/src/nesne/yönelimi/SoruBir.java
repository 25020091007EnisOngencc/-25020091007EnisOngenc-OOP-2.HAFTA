package nesne.yönelimi;

import java.util.Date;

public class SoruBir {
    public static void main(String[] args) {
        Date tarih = new Date();
        
        long[] zamanlar = {10000L, 100000L, 1000000L, 10000000L, 100000000L, 1000000000L, 10000000000L, 100000000000L};
        
        for (long zaman : zamanlar) {
            tarih.setTime(zaman);
            System.out.println("Gecen Zaman: " + zaman + " ms -> " + tarih.toString());
        }
    }
}
