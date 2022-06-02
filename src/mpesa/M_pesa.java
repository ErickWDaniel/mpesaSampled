package mpesa;

import java.util.Scanner;

public class M_pesa {
    sendMoney option1=new sendMoney();
    withDrawCash option2=new withDrawCash();
    buyBundle option3=new buyBundle();
    payByMpesa option4=new payByMpesa();
    Loans option5=new Loans();
    financial option6=new financial();
    myAccount option7=new myAccount();
    Scanner input=new Scanner(System.in);
    public M_pesa()
    {
        System.out.println("1.Send Money");
        System.out.println("2.WithDraw Cash");
        System.out.println("3.Buy Bundle/Airtime");
        System.out.println("4.Pay by M-Pesa");
        System.out.println("5.Loans and Savings");
        System.out.println("6.Financial Services");
        System.out.println("7.My Account(Self Services)");

        int selection = input.nextInt();
        switch(selection)
        {
            case 1->option1.sendMoney();
            case 2->option2.withDrawCash();
            case 3->option3.buyBundle();
            case 4->option4.payByMpesa();
            case 5->option5.loans();
            case 6->option6.financial();
            case 7->option7.myAccount();

        }
    }
    }

