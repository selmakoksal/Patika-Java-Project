import java.util.Scanner;

public class KdvHesapla {
    public static void main(String[] args) {
        // Değişkenleri tanımla
        double tutar, kdv, kdvTutar, kdvliTutar;

        // Kullanıcıdan tutarı al
        Scanner input = new Scanner(System.in);
        System.out.println("Ürünün tutarını giriniz : ");
        tutar = input.nextDouble();

        boolean kdvOran = (0 < tutar) && (tutar < 1000);
        kdv = kdvOran ? 0.18 : 0.8;
        kdvTutar = tutar * kdv;
        kdvliTutar = tutar + kdvTutar;

        System.out.println("KDV'siz tutar :" + tutar);
        System.out.println("KDV oranı :" + kdv);
        System.out.println("KDV tutarı :" + kdvTutar);
        System.out.println("KDV'li tutar :" + kdvliTutar);
    }
}
