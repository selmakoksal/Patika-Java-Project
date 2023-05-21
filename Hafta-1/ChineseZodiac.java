import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int bornYear;
        String zodiacOfChinese = "";

        System.out.print("Doğum yılınızı giriniz : ");
        bornYear = input.nextInt();

        switch (bornYear % 12) {
            case 0:
                zodiacOfChinese = "Maymun";
                break;
            case 1:
                zodiacOfChinese = "Horoz";
                break;
            case 2:
                zodiacOfChinese = "Köpek";
                break;
            case 3:
                zodiacOfChinese = "Domuz";
                break;
            case 4:
                zodiacOfChinese = "Fare";
                break;
            case 5:
                zodiacOfChinese = "Öküz";
                break;
            case 6:
                zodiacOfChinese = "Kaplan";
                break;
            case 7:
                zodiacOfChinese = "Tavşan";
                break;
            case 8:
                zodiacOfChinese = "Ejderha";
                break;
            case 9:
                zodiacOfChinese = "Yılan";
                break;
            case 10:
                zodiacOfChinese = "At";
                break;
            case 11:
                zodiacOfChinese = "Koyun";
                break;
        }
        System.out.printf("Çin Zodyağı Burcunuz : %s", zodiacOfChinese);
    }
}