import java.util.Scanner;

public class GradePass {
    public static void main(String[] args) {
        int math, physics, turkish, chemistry, music, invalidLessonCount = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("Math Note : ");
        math = inp.nextInt();
        if (math < 0 || math > 100){
            math = 0;
            invalidLessonCount++;
        }

        System.out.print("Physics Note : ");
        physics = inp.nextInt();
        if (physics < 0 || physics > 100){
            physics = 0;
            invalidLessonCount++;
        }

        System.out.print("Turkish Note : ");
        turkish = inp.nextInt();
        if (turkish < 0 || turkish > 100){
            turkish = 0;
            invalidLessonCount++;
        }

        System.out.print("Chemistry Note : ");
        chemistry = inp.nextInt();
        if (chemistry < 0 || chemistry > 100){
            chemistry = 0;
            invalidLessonCount++;
        }

        System.out.print("Music Note : ");
        music = inp.nextInt();
        if (music < 0 || music > 100){
            music = 0;
            invalidLessonCount++;
        }

        double total = math + physics + turkish + chemistry + music;
        double avarage = total / (5 - (Math.min(invalidLessonCount, 4)));

        System.out.println("Avarage : " + avarage);

        if (avarage >= 55) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
    }
}