package nesne.yönelimi;

import java.util.GregorianCalendar;

public class SoruUc {
    public static void main(String[] args) {
        
        GregorianCalendar takvim = new GregorianCalendar();

        System.out.println("Guncel Tarih");
        System.out.println("Yil : " + takvim.get(GregorianCalendar.YEAR));
        
        System.out.println("Ay  : " + (takvim.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Gun : " + takvim.get(GregorianCalendar.DAY_OF_MONTH));

        
        takvim.setTimeInMillis(1234567898765L);

        System.out.println("\nBelirtilen Milisaniye Sonrasindaki Tarih ");
        System.out.println("Yil : " + takvim.get(GregorianCalendar.YEAR));
        System.out.println("Ay  : " + (takvim.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Gun : " + takvim.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
