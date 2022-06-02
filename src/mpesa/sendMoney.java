package mpesa;
import java.util.Scanner;

public class sendMoney
{
    //initialization of scanner and Main Amount in account plus defaults PIN
    Scanner input=new Scanner(System.in);
    int mainAmount=20000;
    int amount;
    int pin=1234;
    int  phone_number;

    //method for send money menu
    public void sendMoney()
    {
        System.out.println("1.Enter Phone Number");
        System.out.println("2.International Transfers");
        System.out.println("3.My List");
        System.out.println("4.To Bank");
        System.out.println("5.To other networks");
        System.out.println("6.Send with withdraw Fee");
        System.out.println("7.Standing order");
        int selection=input.nextInt();
        switch (selection)
        {
            //case for direct send money from option 1
            case 1->
            {
                System.out.println("Please Enter Phone Number:");
                phone_number= input.nextInt();
                System.out.println("Enter Amount:");
                amount= input.nextInt();
                System.out.println("Enter PIN");
                pin=input.nextInt();
                if(pin==1234)                       //checking of pin,compare the enter pin with the saved pin
                {
                    if(amount<mainAmount){
                        System.out.println("Your request has been submitted.");
                        System.out.printf("You have successfully sent %s to %s your balance is  %s" , amount,phone_number,(mainAmount-amount));
                    }
                    else {
                        System.out.println("Your have insufficient amount in your account.");
                    }
                }
                else{
                    System.out.println("You have entered Wrong password,5 times wrong attempt will permanent lock your account. ");
                }
            }

            //case option for internationa transferd  here there two option which are bank transfer and mobile transfer
            case 2->
                    {
                        System.out.println("International Transfer\n1.Bank Account\n2.Mobile Transfer");
                        //initialization of varibale
                        int decide=input.nextInt();
                        int bankaccount;
                        int amount;
                        int bankpinMain=1234;
                        int bankpin;
                        if(decide==1)
                        {
                            System.out.println("Choose country\n1.Kenya\n2.Uganda\n3.Rwanda");
                            int countryOption=input.nextInt();
                            if(countryOption==1)
                            {
                                System.out.println("Enter Your Bank Account");
                                 bankaccount=input.nextInt();
                                System.out.println("Enter  Amount");
                                amount=input.nextInt();
                                System.out.println("Enter Your Pin");
                                bankpin=input.nextInt();
                                if (bankpin==bankpinMain)
                                {
                                    System.out.printf("You have successful Transfer %d to %d wait for System balance update",amount,bankaccount);
                                }
                            }
                            else if(countryOption==2)
                            {
                                System.out.println("Enter Your Bank Account");
                                bankaccount=input.nextInt();
                                System.out.println("Enter  Amount");
                                amount=input.nextInt();
                                System.out.println("Enter Your Pin");
                                bankpin=input.nextInt();
                                if (bankpin==bankpinMain)
                                {
                                    System.out.printf("You have successful Transfer %d to %d wait for System balance update",amount,bankaccount);
                                 }
                            }
                            else if(countryOption==3)
                            {
                                System.out.println("Enter Your Bank Account");
                                bankaccount=input.nextInt();
                                System.out.println("Enter  Amount");
                                amount=input.nextInt();
                                System.out.println("Enter Your Pin");
                                bankpin=input.nextInt();
                                if (bankpin==bankpinMain)
                                {
                                    System.out.printf("You have successful Transfer %d to %d wait for System balance update",amount,bankaccount);
                                }
                            }
                            }
                        else if(decide==2)
                        {
                            System.out.println("Choose country:");
                            System.out.println("1.Kenya\n2.Uganda");
                            System.out.println("3.Rwanda\n4.DRC-Congo");
                            System.out.println("5.Burundi\n6.South Sudan");
                            int countryChoice=input.nextInt();
                            if(countryChoice==1)
                            {
                                //for Kenya exchange rate
                                System.out.println("Kenya\n1.Mpesa\n2.Airtel");
                                int submenu=input.nextInt();
                                if(submenu==1)
                                {
                                    System.out.println("1.Send money\n2.Check Currency Conversion");
                                    int subSubMenu=input.nextInt();

                                    if(subSubMenu==1)
                                    {
                                        System.out.println("Enter Phone number");
                                        int phone=input.nextInt();
                                        System.out.println("Enter amount");
                                        int amountsub=input.nextInt();
                                        System.out.printf("You have successful send %s to %s",amountsub,phone);
                                    }
                                    else
                                    {
                                        System.out.println("Enter Amount in Kenya Shillings");
                                        int convertKenyaShilling=input.nextInt();
                                        float convertedTshs= (float) (convertKenyaShilling*21.13);
                                        System.out.printf("%s KSH, %f Tsh.Exchange Rate is 21.13 Tshs/KSH Press 1 to Start Transaction 2 to return",convertKenyaShilling,convertedTshs);

                                    }

                                }

                            }
                            else if(countryChoice==2)
                            {
                                //uganda exchange rate rate
                                System.out.println("1.Send money\n2.Check Currency Conversion");
                                int subSubMenu=input.nextInt();

                                if(subSubMenu==1)
                                {
                                    System.out.println("Enter Phone number");
                                    int phone=input.nextInt();
                                    System.out.println("Enter amount");
                                    int amountsub=input.nextInt();
                                    System.out.printf("You have successful send %s to %s",amountsub,phone);
                                }
                                else
                                {
                                    System.out.println("Enter Amount in Uganda Shillings");
                                    int convertUgandaShilling=input.nextInt();
                                    float convertedTshs= (float) (convertUgandaShilling*0.69);
                                    System.out.printf("%s KSH, %f Tsh.Exchange Rate is 0.69 Tshs/UGX Press 1 to Start  2 to return",convertUgandaShilling,convertedTshs);

                                }
                            }
                            else if(countryChoice==3)
                            {
                                //Rwanda rate
                                System.out.println("1.Send money\n2.Check Currency Conversion");
                                int subSubMenu=input.nextInt();

                                if(subSubMenu==1)
                                {
                                    System.out.println("Select 1.MTN\n2.AIRTEL");
                                    int selectMTNorAirtel=input.nextInt();
                                    System.out.println("Enter Phone number");
                                    int phone=input.nextInt();
                                    System.out.println("Enter amount");
                                    int amountsub=input.nextInt();
                                    System.out.printf("You have successful send %s to %s",amountsub,phone);
                                }
                                else
                                {
                                    System.out.println("Enter Amount in Rwanda Shillings");
                                    int convertRwandaShilling=input.nextInt();
                                    float convertedTshs= (float) (convertRwandaShilling*2.38);
                                    System.out.printf("%s Rwandan Shiling, %f Tsh.Exchange Rate is 2.38 T shs/RWF Press 1 to Start Transaction 2 to return",convertRwandaShilling,convertedTshs);

                                }
                            }
                            else if(countryChoice==4)
                            {
                                //DRC exchange rate
                                System.out.println("1.Send money\n2.Check Currency Conversion");
                                int subSubMenu=input.nextInt();

                                if(subSubMenu==1)
                                {
                                    System.out.println("Select 1.ORANGE");
                                    int selectOrange=input.nextInt();
                                    System.out.println("Enter Phone number");
                                    int phone=input.nextInt();
                                    System.out.println("Enter amount");
                                    int amountsub=input.nextInt();
                                    System.out.printf("You have successful send %s to %s",amountsub,phone);
                                }
                                else
                                {
                                    System.out.println("Enter Amount in USD To convert to Shillings");
                                    int convertDRCShilling=input.nextInt();
                                    float convertedTshs= (float) (convertDRCShilling*2440.50);
                                    System.out.printf("%s USD, %f Tsh.Exchange Rate is 2440.50 Tshs/USD Press 1 to Start Transaction 2 to return",convertDRCShilling,convertedTshs);

                                }
                            }
                            else if(countryChoice==5)
                            {
                                //burundi exchange rate
                                System.out.println("1.Send money\n2.Check Currency Conversion");
                                int subSubMenu=input.nextInt();

                                if(subSubMenu==1)
                                {
                                    System.out.println("Select 1.Eco cash");
                                    int selectOrange=input.nextInt();
                                    System.out.println("Enter Phone number");
                                    int phone=input.nextInt();
                                    System.out.println("Enter amount");
                                    int amountsub=input.nextInt();
                                    System.out.printf("You have successful send %s to %s",amountsub,phone);
                                }
                                else
                                {
                                    System.out.println("Enter Amount in BIF");
                                    int convertKenyaShilling=input.nextInt();
                                    float convertedTshs= (float) (convertKenyaShilling*1.18);
                                    System.out.printf("%s BIF, %f Tsh.Exchange Rate is 1.18 Tshs/BIF Press 1 to Start Transaction 2 to return",convertKenyaShilling,convertedTshs);

                                }
                            }
                            else if(countryChoice==4)
                            {
                                //south sudan exchange rate
                                System.out.println("1.Send money\n2.Check Currency Conversion");
                                int subSubMenu=input.nextInt();

                                if(subSubMenu==1)
                                {
                                    System.out.println("Select 1.MGurush");
                                    int selectOrange=input.nextInt();
                                    System.out.println("Enter Phone number");
                                    int phone=input.nextInt();
                                    System.out.println("Enter amount");
                                    int amountsub=input.nextInt();
                                    System.out.printf("You have successful send %s to %s",amountsub,phone);
                                }
                                else
                                {
                                    System.out.println("Enter Amount in South Sudan Pound:");
                                    int convertsudanPound=input.nextInt();
                                    float convertedTshs= (float) (convertsudanPound*5.81);
                                    System.out.printf("%s Sudan Pound, %f Tsh.Exchange Rate is 5.81 Tshs/SSP Press 1 to Start Transaction 2 to return",convertsudanPound,convertedTshs);
                                }
                            }

                        }
                            else
                            {
                                System.exit(0);
                            }
                        }

            case 3->
            {
                //Menu for benefinciary if there has been setup before,For our case it wasnt setup
                System.out.println("There no Benefinciary Exist!");
                System.exit(0);
            }
            case 4->
            {
                //Menu for bank transfer
                System.out.println("\n1.CRDB\n2.NMB\n3.NBC\n4.TPB");
                System.out.println("Choose other Bank by its First Letter");
                System.out.println("5.A To C\n6.D to F\n7.G to L\n8M to N\n9.O to Z");

                //due to absent of having an account to test this feature we couldnt get in further option
                System.exit(0);

            }
            case 5-> {

                System.out.println("Choose\n1.Airtel Money\n2.Tigo Pesa\n3.TTCL Pesa\n4.HaloPesa\n5.EzyPesa");
                int selectionOtherLine = input.nextInt();
                if (selectionOtherLine == 1) {
                    System.out.println("Enter Number");
                    int phonenumberAirtel = input.nextInt();
                    System.out.println("Enter Amount");
                    int amountAirtel = input.nextInt();
                    System.out.printf("You can send Tshs %s as airtime free of charge", amountAirtel);
                    System.out.println("Press 0.To send as airtime\n1.Send as money\n2To cancel");
                    int selectionAirtel = input.nextInt();
                    if (selectionAirtel == 0) {
                        System.out.printf("You have successful send Airtime of %s to %s ", amountAirtel, phonenumberAirtel);
                    } else if (selectionAirtel == 1)

                        System.out.println("Enter Pin number");
                    int pin2 = input.nextInt();
                    if (pin2 == pin)
                        System.out.printf("You have successful send  %s to %s ", amountAirtel, phonenumberAirtel);
                    else System.out.println("Wrong Pin,5 wrong attempts will permanent close Your account ");
                    System.exit(0);
                } else if (selectionOtherLine == 2) {

                    //Menu for Tigo send airtime or money
                    System.out.println("Enter Number");
                    int phonenumberTigo = input.nextInt();
                    System.out.println("Enter Amount");
                    int amountTigo = input.nextInt();
                    System.out.printf("You can send Tshs %s as airtime free of charge", amountTigo);
                    System.out.println("Press 0.To send as airtime\n1.Send as money\n2To cancel");
                    int selectionTigo = input.nextInt();
                    if (selectionTigo == 0) {
                        System.out.printf("You have successful send Airtime of %s to %s ", amountTigo, phonenumberTigo);
                    } else if (selectionTigo == 1)

                        System.out.println("Enter Pin number");
                    int pin2 = input.nextInt();
                    if (pin2 == pin)
                        System.out.printf("You have successful send  %s to %s ", selectionTigo, phonenumberTigo);
                    else System.out.println("Wrong Pin,5 wrong attempts will permanent close Your account ");
                    System.exit(0);
                } else if (selectionOtherLine == 3)

                    System.out.println("Enter Number");

                //Menu for TTCL send airtime or money
                int phonenumberTTCl = input.nextInt();
                System.out.println("Enter Amount");
                int amountTTCL = input.nextInt();
                System.out.printf("You can send Tshs %s as airtime free of charge", amountTTCL);
                System.out.println("Press 0.To send as airtime\n1.Send as money\n2To cancel");
                int selectionTTCL = input.nextInt();
                if (selectionTTCL == 0) {
                    System.out.printf("You have successful send Airtime of %s to %s ", amountTTCL, phonenumberTTCl);
                } else if (selectionTTCL == 1)

                    System.out.println("Enter Pin number");
                int pin2 = input.nextInt();
                if (pin2 == pin)
                    System.out.printf("You have successful send  %s to %s ", selectionTTCL, phonenumberTTCl);
                else {
                    System.out.println("Wrong Pin,5 wrong attempts will permanent close Your account ");
                    System.exit(0);
                }

                if(selectionOtherLine==4)
            {
                //MEnu for HaloTel for airtime or Halopesa
                System.out.println("Enter Number");
                int phonenumberHalotel=input.nextInt();
                System.out.println("Enter Amount");
                int amountHalotel=input.nextInt();
                System.out.printf("You can send Tshs %s as airtime free of charge",amountHalotel);
                System.out.println("Press 0.To send as airtime\n1.Send as money\n2To cancel");
                int selectionHalotel=input.nextInt();
                if(selectionHalotel==0)
                {
                    System.out.printf("You have successful send Airtime of %s to %s ",amountHalotel,phonenumberHalotel);
                }
                else if(selectionHalotel==1)

                    System.out.println("Enter Pin number");
                 pin2=input.nextInt();
                if(pin2==pin)
                    System.out.printf("You have successful send  %s to %s ",amountHalotel,phonenumberHalotel);
                else
                {
                    System.out.println("Wrong Pin,5 wrong attempts will permanent close Your account ");
                    System.exit(0);
                }
            }

                else if(selectionOtherLine==5)
                //Menu for EzyMoney
                {
                    System.out.println("Enter Number");
                    int phonenumberEzyMoney = input.nextInt();
                    System.out.println("Enter amoubt");
                    int amoubtezymoney=input.nextInt();
                    System.out.println("Enter Pin number");
                     pin2=input.nextInt();
                     if(pin2==pin)
                     {
                         System.out.printf("You have succeful send %s to %s",amoubtezymoney,phonenumberEzyMoney);
                     }
                     else
                     {
                         System.out.println("Wrong Pin,5 wrong attempts will permanent close Your account ");
                         System.exit(0);
                     }
                }
                else {
                    System.exit(0);
                }
            }
            case 6->
            {
                /*
                MEnu for send money with withdraw amount included
                Since the withdraw amount differ for each amount we simulate by put
               default withdraw fee to be 20% of the sending total fee
               */

                System.out.println("Enter number");
                int newNumber=input.nextInt();
                System.out.println("Enter amoubnt");
                int newamount=input.nextInt();
                System.out.println("Enter pin");
                double newamoubtextra=(newamount*0.20)+newamount;
                int pin2=input.nextInt();

                if(pin2==pin)
                {
                    System.out.printf("You have succefull send %s to %s",newamoubtextra,newNumber);
                }
                else {
                    System.out.println("Wrong Pin,5 wrong attempts will permanent close Your account ");
                    System.exit(0);
                }
            }
            case 7->
                    //Menu for outstanding order
            {
                System.out.println("1.Set standing order\n2.My list\n3.My orders");
                int standOderSelection=input.nextInt();
                if(standOderSelection==1)
                {
                    System.out.println("My order\n1.View Customer standing order\nDetails\n2.Cancel Customer standing order");
                    int selectionNewBeneficiary=input.nextInt();
                    System.out.println("No beneficiary exist");
                    System.exit(0);

                }
                else if(standOderSelection==2)
                {
                    System.out.println("No beneficiary exist");
                    System.exit(0);
                }
                else if(standOderSelection==3)
                {
                    System.out.println("You have no Standing order or You are not allowed to perform this service");
                    System.exit(0);
                }
                else {
                    System.exit(0);
                }
            }
        }
    }
}
