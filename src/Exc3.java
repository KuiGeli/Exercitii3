import java.util.Random;
import java.util.Scanner;

public class Exc3 {


    public static void main(String[] args) {
        Random randNumGenerator = new Random();
        Scanner userImput = new Scanner(System.in);

        System.out.println("Type in a number between 1 and 10");
        int randomNum = randNumGenerator.nextInt(10);
        int number = 0;

        for (int i = 0; i<3; i++) {

            number  = userImput.nextInt();

            if (number < randomNum) {
                if (i < 2){
                System.out.println("Your number is smaller. Try again");
                }else {
                    System.out.print("Lost! ");
                }
            } else if (number > randomNum) {
                if (i<2){
                System.out.println("Your number is bigger. Try again");
                }else{
                    System.out.print("Lost! ");
                }
            } else {
                System.out.println("Win! Your number matches the random number. Random number " + randomNum);
            }
        }
        if (number < randomNum || number > randomNum){
            System.out.println("The number was: " + randomNum);
        }
    }


}
