
package pertemuan89_1;

import java.util.Scanner;

public class TestSegitiga {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("sisi 1 : ");
        double sisi1 = scanner.nextDouble();
        
        System.out.println("sisi 2 : ");
        double sisi2 = scanner.nextDouble();
        
        System.out.println("sisi 3 : ");
        double sisi3 = scanner.nextDouble();
        
        
        System.out.println("warna : ");
        String color = scanner.next();
        
        
        System.out.println("segitiga terisi(true or false)");
        boolean filled = scanner.nextBoolean();
        
        
        Segitiga segitiga = new Segitiga(sisi1, sisi2, sisi3); 
        segitiga.setColor(color);
        segitiga.setFilled(filled);
        
        
        System.out.println("Luas segitiga: " + segitiga.getArea());
        System.out.println("Keliling segitiga: " + segitiga.getParimeter());
        System.out.println("Warna segitiga: " + segitiga.getColor());
        System.out.println("Apakah segitiga terisi: " + segitiga.isFilled());
        System.out.println(segitiga.toString());
        
    }
}
