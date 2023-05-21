import java.util.Scanner;

public class HoroscopeCalc {
    public static void main(String[] args) {
        int day;
        String month, horoscope = "";
        boolean isError = false;

        Scanner input = new Scanner(System.in);

        System.out.print("Doğduğunuz ay : ");
        month = input.nextLine();

        System.out.print("Doğduğunuz gün : ");
        day = input.nextInt();

        if (month.equals("January")){
            if (day >= 1 && day <=31){
                if (day < 22){
                    horoscope = "Oğlak";
                } else {
                    horoscope = "Kova";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("February")) {
            if (day >= 1 && day <= 28){
                if (day < 20){
                    horoscope = "Kova";
                } else {
                    horoscope = "Balık";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("March")) {
            if (day >= 1 && day <= 31){
                if (day < 21){
                    horoscope = "Balık";
                } else {
                    horoscope = "Koç";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("April")) {
            if (day >= 1 && day <= 30){
                if (day < 21){
                    horoscope = "Koç";
                } else {
                    horoscope = "Boğa";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("May")) {
            if (day >= 1 && day <= 31){
                if (day < 22){
                    horoscope = "Boğa";
                } else {
                    horoscope = "İkizler";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("June")) {
            if (day >= 1 && day <= 30){
                if (day < 23){
                    horoscope = "İkizler";
                } else {
                    horoscope = "Yengeç";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("July")) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Yengeç";
                } else {
                    horoscope = "Aslan";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("August")) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Aslan";
                } else {
                    horoscope = "Başak";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("September")) {
            if (day >= 1 && day <= 30){
                if (day < 23){
                    horoscope = "Başak";
                } else {
                    horoscope = "Terazi";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("October")) {
            if (day >= 1 && day <= 31){
                if (day < 23){
                    horoscope = "Terazi";
                } else {
                    horoscope = "Akrep";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("November")) {
            if (day >= 1 && day <= 30){
                if (day < 22){
                    horoscope = "Akrep";
                } else {
                    horoscope = "Yay";
                }
            } else {
                isError = true;
            }
        } else if (month.equals("December")) {
            if (day >= 1 && day <= 31){
                if (day < 22){
                    horoscope = "Yay";
                } else {
                    horoscope = "Oğlak";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError){
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
        } else {
            System.out.println("Burcunuz : " + horoscope);
        }
    }
}