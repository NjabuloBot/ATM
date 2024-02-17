//import required classes and packages
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        //declare and initialize balance,withdraw and deposit
        int balance = 100000,withdraw,deposit;

        //Create a scanner class object to get user choice
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Automated Teller Machine");
            System.out.println("Enter 1 to withdraw");
            System.out.println("Enter 2 to deposit");
            System.out.println("Enter 3 to Check Balance");
            System.out.println("Enter 4 to Exit");
            System.out.println("SELECT AN OPTION:");

            //get choice from user
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    //get withdrawal amount from user
                    withdraw = scan.nextInt();
                    //check if balance is greater than or equal to withdrawal amount
                    if(balance >= withdraw){
                        balance-=withdraw;
                        System.out.println("Please collect your money!");
                    }
                    else{
                        System.out.println("Insufficient funds. Can not withdraw!");
                    }
                    System.out.println("");
                    break;

                case 2:
                    System.out.print("Enter money to be deposited: ");
                    
                    //get deposit for the user
                    deposit = scan.nextInt();

                    //add the deposit amount to the total balance
                    balance+=deposit;
                    System.out.println("Your Money has been successfully deposited!");
                    System.out.println("");
                    break;

                case 3:
                    //display the total balance to the user
                    System.out.println("Balance: "+balance);
                    System.out.println("");
                    break;
                
                case 4:
                    //exit from the menu
                    System.exit(0);
                default:
                    scan.close();
                    break;
            }
        }
    }
}
