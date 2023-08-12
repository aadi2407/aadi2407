import java.util.Scanner;

// Main class
 public class NumberGuessingGame {
    public static void main(String areg[]) {

    Scanner sc = new Scanner(System.in);
    int myNumber = (int) (Math.random()*100);
    int userNumber = 0;

    // Number guessing function
    do {
        System.out.println("GUESS MY NUMBER(1-100) : ");
        userNumber = sc.nextInt();

        // Function if number is correct
        if(userNumber == myNumber) {
            System.out.println("WOOHOO . . CORRECT NUMBER ! ! ! ");
            break;
        }
        else if(userNumber > myNumber) {     //Function if number is too high
            System.out.println("YOUR NUMBER IS TOO HIGH");
        }
        else {                               //Function if number is too small
            System.out.println("YOUR NUMBER IS TOO SMALL");
               }
    }   while(userNumber >= 0);
    System.out.print("MY NUMBER WAS : ");
    System.out.println(myNumber); 
    }
}
