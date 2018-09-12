import java.util.Scanner;

public class main {

    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
        int userChoice;
        userMenu();
        userChoice = userInput.nextInt();
        switch (userChoice) {
            case 1:
                System.out.println("What is your name?");
                String custName1 = scan.nextLine();
                System.out.println("What is your phone number?");
                String custPhone1 = scan.nextLine();
                customerInfo(custName1, custPhone1);

                break;
            case 2:
                System.out.println("What is your name?");
                String custBus1 = scan.nextLine();
                System.out.println("What is your business name?");
                String custName2 = scan.nextLine();
                System.out.println("What is your phone number?");
                String custPhone2 = scan.nextLine();
                customerInfo(custBus1, custName2, custPhone2);
                break;
            default:
                System.out.println("That is not a valid choice.");
                userMenu();
        }
    }
    private static void userMenu(){
        System.out.println("What type of customer are you?\n ");
        System.out.println("1.  Residential");
        System.out.println("2.  Business");

    }
    private static void customerInfo(String s1, String s2){
        System.out.println(s1);
        System.out.println(s2);


    }
    private static void customerInfo(String s1, String s2, String s3){
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

















