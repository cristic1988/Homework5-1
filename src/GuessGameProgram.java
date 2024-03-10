import java.util.Random;

public class GuessGameProgram {

    public static void main (String[] args) {

        Random random = new Random();
        int guessNum = random.nextInt(10);


        int i = random.nextInt(10);
        while (i < 3) {
            System.out.println(guessNum);
            i++;

        }

    }


    }
