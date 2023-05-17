import java.util.Scanner;

public class VkiHesaplama {
    public static void main(String[] args) {
        double kg, m;

        Scanner inp = new Scanner(System.in);
        System.out.print("Ağırlığınızı kilogram cinsinden giriniz : ");
        kg = inp.nextDouble();
        System.out.print("Boyunuzu metre cinsinden giriniz : ");
        m = inp.nextDouble();

        double vki = kg / (m * m);
        System.out.println("Vücut kitle indeksiniz : " + vki);
    }
}
