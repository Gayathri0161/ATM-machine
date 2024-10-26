package atmmachine.com;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmMachine at = new AtmMachineInterfaceImplement();
        int atmcardnum = 12366;
        int atmpin = 1266;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to ATM Machine..!!");
        System.out.print("Enter ATM card number: ");
        int atmCardNumber = sc.nextInt();
        System.out.print("Enter ATM pin: ");
        int atmPin = sc.nextInt();
        if((atmcardnum == atmCardNumber) && (atmpin == atmPin))
        {
            while(true){
                System.out.println("1.Available Balance\n2.Withdraw Amount\n3.Deposit Amount\n4.View Mini Statement\n5.Exit");
                System.out.print("Enter the choice: ");
                int ch = sc.nextInt();
                if (ch == 1) {
                    at.viewAvailableBalance();
                }
                else if(ch == 2){
                    System.out.print("Enter Amount to be Withdrawn: ");
                    double withdrawAmount = sc.nextDouble();
                    at.withdrawAmount(withdrawAmount);
                }
                else if(ch == 3){
                    System.out.print("Enter Amount to be Deposited: ");
                    double depositAmount = sc.nextDouble();
                    at.depositAmount(depositAmount);

                }
                else if(ch == 4){
                    at.viewMiniStatement();
                }
                else if(ch == 5){
                    System.out.println("Please collect your card. \nThank you for using our ATM Machine..!!!");
                    System.exit(0);
                }
                else{
                    System.out.print("Please enter correct choice: ");
                }
            }
        }
        else{
            System.out.println("Incorrect ATM card Number, Please enter correct details..!!");
            System.exit(0);
        }
    }
}
