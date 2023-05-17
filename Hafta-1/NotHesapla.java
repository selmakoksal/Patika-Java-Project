import java.util.Scanner;

public class NotHesapla {
    public static void main(String[] args) {
        // Değişkenleri oluştur
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfını tanımla
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz : ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuz : ");
        muzik = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        String sonuc = (toplam / 6.0 >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı" ;
        System.out.println(sonuc);
    }
}
