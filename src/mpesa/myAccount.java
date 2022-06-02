package mpesa;

import java.util.Scanner;

public class myAccount {
    public void myAccount()
    {
         class Account {
            Scanner input = new Scanner(System.in);
            int pin=1234;
            public void loans()
            {
                System.out.println("1.MPAWA\n2.SONGESHA");
                int selectionMAIN=input.nextInt();
                if(selectionMAIN==1)
                {
                    System.out.println("M-PAWA\n1.Save in M-Pawa\n2.Withdraw from M-Pawa\n3.Loan\n4.M-Pawa\n5.Mini Statements\n6.Information\n7.Term and Condition");
                    int selectionMain = input.nextInt();
                    switch (selectionMain) {
                        case 1 -> saveMpawa();
                        case 2 -> withdrawMPawa();
                        case 3 -> loans();
                        case 4 -> MpawaBalance();
                        case 5 -> MiniStatement();
                        case 6 -> infomation();
                        case 7 -> terms_Conditions();
                        default -> System.exit(0);

                    }
                }
                else if(selectionMAIN==2)
                {

                    System.out.println("1.OutStanding Balance\n2.Pending Transaction\n3.Songesha Limit\n4.Support\n5.Unsubscribe" +
                            "\n6.Songesha Terms and Conditions\n7.Songesha Debts");
                    int songeshaSelection=input.nextInt();
                    switch(songeshaSelection)
                    {
                        case 1->OutstandingBalance();
                        case 2->PendingTransations();
                        case 3 ->SongeshaLimit();
                        case 4 ->Support();
                        case 5 ->Unsubscribe();
                        case 6 ->Songesha_terms_Condition();
                        case 7->PaySongeshaDebt();
                        default->System.exit(0);
                    }
                }
                else {
                    System.exit(0);
                }
            }
            public void saveMpawa()
            {
                System.out.println("Enter Amount");
                int amountMpawa=input.nextInt();
                System.out.println("Enter Mpesa PIN");
                pin=input.nextInt();
                System.out.println("Send "+amountMpawa+"to Mpawa Account.\nPress 1 to confirm or 2 to decline");
                int saveSelection=input.nextInt();
                if(saveSelection==1)
                {
                    System.out.println("Your Request is current be processed");
                }
                else if(saveSelection==2)
                {
                    System.out.println("The request has been canceled");
                }
                else System.exit(0);


            }
            public void withdrawMPawa()
            {
                System.out.println("Enter Amount");
                int withdrawAmount=input.nextInt();
                System.out.println("Enter Pin");
                System.out.println("Withdraw Tshs "+withdrawAmount+"from Mpawa Account.Press 1 to confirm or 2 To cancel" +
                        "\n1.Confirm\n2.Cancel");
                int withdrawSelection=input.nextInt();
                if(withdrawSelection==1)
                {
                    System.out.println("Your Request is current be processed");
                }
                else if(withdrawSelection==2)
                {
                    System.out.println("The request has been canceled");
                }
                else System.exit(0);
            }
            public void Loan()
            {
                System.out.println("Loan\n1.Request Loan\n2.Pay Loan\n3.Check Loan Limit\n4.Loan Charges");
                int loanSelection=input.nextInt();
                if(loanSelection==1)
                {
                    System.out.println("Enter Amount");
                    int loanAmount=input.nextInt();
                    System.out.println("Dear Customer,From the loan requested an interest " +
                            "will be deducted from the request upfront and not on repayment," +
                            "Enter Mpesa pin to confirm");
                    pin=input.nextInt();
                    System.out.println("Your request has been submitted");
                }

            }
            public void MpawaBalance()
            {
                System.out.println("Enter Your M-Pesa PIN");
                pin=input.nextInt();
                System.out.println("Your request has been Submitted");
            }
            public void MiniStatement()
            {
                System.out.println("Enter Your M-Pesa PIN");
                pin=input.nextInt();
                System.out.println("Your request has been Submitted");

            }
            public void infomation()
            {
                System.out.println("To access,enjoy and increasse loan limit in M-Pawa:\n" +
                        "1.Be a registered and active vodacom customer.2.Have an active Mpesa account(6Months)" +
                        "3.Make frequent saving with M-pawa");
            }
            public void terms_Conditions()
            {
                System.out.println("Visit a Vodacom shop or vodacom.co.tz to ge Full M-Pawa Term and Conditions");
            }


            public void OutstandingBalance()
            {
                System.out.println("Songesha Limit Tshs:0\nPrinciple:0\nService Fee 0\nTotal Outstand 0");
                System.exit(0);

            }
            public void PendingTransations()
            {
                System.out.println("You have no Pending Transaction For confirmation");
            }
            public void SongeshaLimit()
            {
                System.out.println("You Limit is Tshs 1200.You are still eleigible for an overdraft of up to Tshs 1200");
            }
            public void Support()
            {
                System.out.println("1.What is Songesha?\n2.Songesha Limit\n3.Balance\n4.Processing Fee\n5.Daily service fee" +
                        "\n6.Allowed Transactions\n7.Loan Fee's Check");
                int supportSelection=input.nextInt();
                switch (supportSelection)
                {
                    case 1-> System.out.println("Songesha is the service that enables Mpesa customers" +
                            "to get instant overdraft loan facilities to complete transations whenever" +
                            "they run shot of funds");
                    case 2-> System.out.println("This is maximum overdraft facility that a customer can " +
                            "utilize in month.Your overdraft limit will be updated every after now and then");
                    case 3-> System.out.println("This is a feed that show the usage and utilization of Songesha.Through this" +
                            " panel a customer will be able to see LIMIT Outstanding,Fees/Charges");
                    case 4->System.out.println("This is one time fee Charge to a customer when taking an overdraft facility." +
                            "this fee will be charge everytime a custome take an overdraft facility");
                    case 5-> System.out.println("The customer will be charged an increment of 1% of the facility granted for everyday stay without" +
                            "repay the facility.This charge will kept at day 18 which will be 18%");
                    case 6-> System.out.println("Accepted Transaction to be comleted with songesha are:\n" +
                            "1.Send Money to Vodacom Customers only\n2.PayBill(LUKU,GePG,Tv Subscribttion etc)\n3." +
                            "Pay Mechant(LIPA KWA MPESA");
                    case 7-> checkAmount();
                    default->System.exit(0);

                }

            }
            public void Unsubscribe()
            {
                System.out.println("You are about to Unsubscribe fro Songesha \nEnter Pin To confirm");
                pin=input.nextInt();
                System.out.println("Your request is currently being processed");
            }
            public void Songesha_terms_Condition()
            {
                System.out.println("To view and read Term and condition kindly visit: www.vodacom.co.tz or visit any of our vodashop");
            }
            public void PaySongeshaDebt()
            {
                System.out.println("You dont have any outstand songesha Debt");
            }
            public void checkAmount()
            {
                System.out.println("Enter Amount");
                int checkAmount=input.nextInt();
                double total=checkAmount*0.06;
                System.out.println("TZS "+checkAmount+"is charged TZS."+total +"Processing Fee and Service Fee" +
                        "\n4% repaid Day 1\n7% repaid in 2-5 days\n10% repaid in 6-10 days\n14% repaid in 11-15 days" +
                        "\n16% repaid after 15 days");


            }

        }


    }
}
