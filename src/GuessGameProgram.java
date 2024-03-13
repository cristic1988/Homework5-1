import java.util.Random;
import java.util.Scanner;

public class GuessGameProgram {

    public static void main (String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);



        int guessNum = random.nextInt(10);
          
        while ( guessNum < 3) {
              System.out.println("Enter number to guess");
            int compNum = scanner.nextInt();
            System.out.println(compNum);

            System.out.println(guessNum);
            guessNum++;

        }

    }


    }
