
// import required classes for the program
import java.util.Scanner;
import java.lang.Math;

public class  Numberguessinggame {
    public static void main(String[] args) {
       
        int answer = (int) (Math.random() * 100) + 1;
  
        int k = 5;
        
        Scanner sc = new Scanner(System.in);
		       
        boolean correct = false;
        System.out.println("GUESS the number in 5 tries:");;
        while (k > 0) {
            System. out.println("Enter your guess: ");
            int guess = sc.nextInt();
           
            if (guess == answer) {
                System. out.println("Congratulations!"+"You guessed the number!");
                break;
            }
            
            else if (guess > answer) {
                System.out.println("Your guess is too high."+"You have " + (k - 1) + " tries left.");
                k--;
            }
           
            else {
                System.out.println("Your guess is too low.\nYou have " + (k - 1) + " tries left.");
            }
           
            k--;
        }
   

		if (correct==false) {
        System.out.println("You lose!");
    }
    }
}
