import java.util.Scanner;
public class NumberGuessingGame {
     static void numberGuessingGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int i;
        int no = 5;
        System.out.println("Computer is choosen numbers  between 1 to 100 guess the number within 10 trials");
        for ( i = 0; i < no; i++)
        {
            System.out.println("Guess the number:");
             int guess = sc.nextInt();
            if (number == guess)
            {
                System.out.println("Congratulations!"+" You guessed the number.");
                break;
            }
            else if (number > guess && i != no - 1)
            {
                System.out.println("The number is " + "greater than "+guess);
            }
            else if (number < guess && i != no - 1)
            {
                System.out.println("The number is" +" less than " + guess);
            }
        }
        if ( i==no)
        {
            System.out.println("You have exhausted "+no+" trials.");
            System.out.println("Better luck next time....");
            System.out.println("The number was " + number);
        }
    }
    public static void main(String[] args)
    {
        numberGuessingGame();
    }
}
