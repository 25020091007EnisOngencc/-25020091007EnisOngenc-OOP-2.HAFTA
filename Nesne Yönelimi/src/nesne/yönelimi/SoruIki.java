package nesne.yönelimi;

import java.util.Random;

public class SoruIki {
    public static void main(String[] args) {
        
        Random rastgele = new Random(1000);
        
        for (int i = 0; i < 50; i++) {
            System.out.print(rastgele.nextInt(100) + " ");
        }
        
    }   
}