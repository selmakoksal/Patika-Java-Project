import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        int r;
        double pi = 3.14, angle;

        Scanner inp = new Scanner(System.in);

        System.out.print("Yarıçap değeri : ");
        r = inp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("Dairenin alanı : " + alan);
        System.out.println("Dairenin çevresi : " + cevre);

        System.out.print("Açıyı giriniz : ");
        angle = inp.nextInt();
        double diliminAlani = (pi * (r * r) * angle) / 360;
        System.out.print("Bu daire diliminin alanı : " + diliminAlani);
    }
}
