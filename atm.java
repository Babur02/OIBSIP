import java.util.*;

class Withdraw {
    Scanner sc = new Scanner(System.in);

    static int balance = 1000;

    int withdraw;

    public void withdraw() {

        System.out.println("");

        System.out.println("*****WITHDRAW*****");

        System.out.println("Current Balance : " + balance + " Rs. ");

        System.out.print("Enter the amount you want to Withdraw : ");

        withdraw = sc.nextInt();

        if (withdraw <= balance) {

            balance = balance - withdraw;

            System.out.println("Please collect your Amount");

            System.out.println("Available Balance : " + balance + " Rs.");

        } else {

            System.out.println("You have Insufficient Balance");

        }

        System.out.println();

    }

}

class Deposit extends Withdraw {

    int deposit;

    public void deposit() {

        System.out.println("");

        System.out.println("*****DEPOSIT*****");

        System.out.print("Enter the amount you want to Deposit : ");

        deposit = sc.nextInt();

        balance = balance + deposit;

        System.out.println("Your Amount has been successfully Deposited");

        System.out.println("Available Balance : " + balance + " Rs.");

        System.out.println();

    }

}

class Transfer extends Deposit {
    Scanner sc = new Scanner(System.in);

    public void transfer() {

        System.out.println("");

        System.out.println("*****TRANSFER FUNDS*****");

        System.out.print("Enter the Account No. of Receiver : ");

        long acc = sc.nextLong();

        System.out.print("Enter Amount to be transferred : ");

        int trans = sc.nextInt();

        if (trans <= balance) {

            balance = balance - trans;

            System.out.println("Amount " + trans + " Rs. successfully transferred");

            System.out.println("Left balance : " + balance + "");

        } else {

            System.out.println("Insufficient Balance");

        }

    }

}

class TransactionHistory extends Transfer {

    public void transactionhistory() {

        System.out.println("");

        System.out.println("*****TRANSACTION HISTORY*****");

        System.out.println("Amount Withdrawn : " + withdraw + " Rs.");

        System.out.println("Amount Deposited : " + deposit + " Rs. ");

        System.out.println("Available Balance : " + balance + " Rs.");

    }

}

public class atm {

    public static void main(String[] args) {

        System.out.println("");

        TransactionHistory t1 = new TransactionHistory();

        int userid = 1802;

        int userpin = 2002;

        Scanner sc = new Scanner(System.in);

        System.out.println("$$$$$ Welcome to ATM Machine $$$$$");

        System.out.println("");

        System.out.print("Enter User ID : ");

        userid = sc.nextInt();

        System.out.print("Enter User PIN : ");

        userpin = sc.nextInt();

        System.out.println();

        if ((userid == userid) && (userpin == userpin)) {

            while (true)

            {

                System.out.println("Choose 1 for Withdraw");

                System.out.println("Choose 2 for Deposit");

                System.out.println("Choose 3 for Transfer");

                System.out.println("Choose 4 for Transaction History");

                System.out.println("Choose 5 for Quit");

                System.out.print("Choose the operation you want to perform : ");

                int choice = sc.nextInt();

                System.out.println("");

                switch (choice)

                {

                    case 1:

                        t1.withdraw();

                        break;

                    case 2:

                        t1.deposit();

                        break;

                    case 3:

                        t1.transfer();

                        break;
                    case 4:

                        t1.transactionhistory();

                        break;

                    case 5:

                        System.exit(0);
                    default:
                        System.out.println(" Choose the correct option !!!");

                }

            }

        }

    }

}
