import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name and high score");
        String name = input.next();
        int score = input.nextInt();

        System.out.println(displayHighScorePosition(name, calculateHighScorePosition(score)));


    }

    public static int calculateHighScorePosition(int score){
        if(score >= 1000){
            return 1;
        }
        else if (score>= 500){
            return 2;
        }
        else if (score>= 100){
            return 3;
        }
        return 4;
    }

    public static String displayHighScorePosition(String name, int position){
        return name + " managed to get into position " + position + " on the high score list";
    }
}
