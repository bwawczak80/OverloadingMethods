import java.util.Scanner;


public class main {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Scanner userInput = new Scanner(System.in);

        int userChoice;

        do {
            System.out.println("Please enter your selection");
            System.out.println("1.  Are you a Business customer");
            System.out.println("2.  Are you a Residential customer");

            userChoice = userInput.nextInt();
        } while (userChoice != 1 && userChoice != 2);

            if (userChoice == 1) {
                customerInfo();


            } else if (userChoice == 2) {
                customerInfo();

            } else {
                System.out.println("That is not a valid option");


            }

        public static String customerInfo(){

        }
        }

}















