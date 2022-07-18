import java.util.Scanner;

public class index {
    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter Score Math: ");
        int Scoremath = Keyboard.nextInt();
        System.out.println("Enter Score Science");
        int ScoreScience = Keyboard.nextInt();
        System.out.println("Enter Score Physics");
        int ScorePhysics = Keyboard.nextInt();
        System.out.println("Enter Score Computer science");
        int ScoreComputer = Keyboard.nextInt();
        System.out.println("Enter Score Music");
        int ScoreMusic = Keyboard.nextInt();
        System.out.println("Enter Score English");
        int ScoreEnglish = Keyboard.nextInt();
        System.out.println("Score Math :" + Scoremath);
    }
}
