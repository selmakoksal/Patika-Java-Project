import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double total, armutF = 2.14, elmaF = 3.67, domatesF = 1.11, muzF = 0.95, patlicanF = 5.00;

        Scanner inp = new Scanner(System.in);

        System.out.printf("Armut kaç kilogram? : ");
        double armutKg = inp.nextDouble();

        System.out.printf("Elma kaç kilo? : ");
        double elmaKg = inp.nextDouble();

        System.out.printf("Domates kaç kilo? : ");
        double domatesKg = inp.nextDouble();

        System.out.printf("Muz kaç kilo? : ");
        double muzKg = inp.nextDouble();

        System.out.printf("Patlıcan kaç kilo? : ");
        double patlicanKg = inp.nextDouble();

        total = (armutF * armutKg) + (elmaF * elmaKg) + (domatesF * domatesKg) + (muzF * muzKg) + (patlicanF * patlicanKg);
        System.out.printf("Toplam Tutar : " + total);
    }
}
