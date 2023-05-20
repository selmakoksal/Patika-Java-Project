import java.util.Scanner;

public class SuggestEvent {
    public static void main(String[] args) {
        int heatDegree;

        Scanner inp = new Scanner(System.in);

        System.out.print("Sıcaklık derecesini giriniz : ");
        heatDegree = inp.nextInt();

        if (heatDegree < 5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if (heatDegree <= 25) {
            if (heatDegree <= 15){
                System.out.println("Sinemaya gidebilirsiniz.");
            }
             if (heatDegree >= 10) {
                System.out.println("Piknik yapabilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }
    }
}