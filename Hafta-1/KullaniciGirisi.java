import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password;

        Scanner inp = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();

        System.out.print("Şifreniz : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java101")){
            System.out.println("Giriş Yaptınız!");
        } else if (!password.equals("java101")) {
            System.out.print("Giriş başarısız, şifrenizi yanlış girdiniz. Şifrenizi sıfırlamak ister misiniz? : Evet / Hayır -> ");
            String temp = inp.next().toLowerCase();
            if (temp.equals("evet")) {
                System.out.print("Yeni şifre belirleyiniz. Yeni şifre : ");
                password = inp.next();
                if (password.equals("java101")) {
                    System.out.println("Yeni şifreniz eski şifrenizle aynı olmamalı! Lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu.");
                }
            } else if (temp.equals("hayır")) {
                System.out.println("Yeni şifre oluşturmadan giriş yapamazsınız!");
            }
        } else {
            System.out.println("Tekrar giriş yapınız.");
        }
    }
}