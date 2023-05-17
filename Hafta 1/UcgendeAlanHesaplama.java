import java.util.Scanner;

public class UcgendeAlanHesaplama {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int a, b;
        double c, u, alan;

        // Kullanıcıdan verileri al
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. kenarı giriniz : ");
        b = girdi.nextInt();

        c = Math.sqrt((a*a) + (b*b));
        System.out.println("Hipotenüs  : " + c);

        u = (a+b+c) / 2;
        System.out.println("Üçgenin çevresi : " + (2*u));

        alan = (a*b) / 2.0;
        System.out.println("Üçgenin alanı : " + alan);
    }
}
