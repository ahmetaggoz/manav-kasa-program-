package Giris;
import java.util.Scanner;
public class proje9 {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlican = 5.0,tutar;
        double kArmut,kElma,kDomates,kMuz,kPatlican;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kaç kilo armut? : ");
        kArmut = sc.nextDouble();
        System.out.print("Kaç kilo elma? : ");
        kElma = sc.nextDouble();
        System.out.print("Kaç kilo domates? : ");
        kDomates = sc.nextDouble();
        System.out.print("Kaç kilo muz? : ");
        kMuz= sc.nextDouble();
        System.out.print("Kaç kilo patlican? : ");
        kPatlican = sc.nextDouble();
        tutar = (armut * kArmut) + (elma * kElma) + (domates * kDomates) + (muz * kMuz) + (patlican * kPatlican);
        System.out.print("Toplam tutar : " + tutar);
    }
}
