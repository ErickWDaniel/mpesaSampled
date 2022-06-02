package mpesa;
import java.util.*;
public class buyBundle {
    int amount;
    int selection;
    int pin = 1234;
    int phoneno;

    Scanner input = new Scanner(System.in);
    //acts as the main method to call all methods in the class buybundle
    public void buyBundle() {

        System.out.println("M-PESA");
        System.out.println("1.Airtime-My phone");
        System.out.println("2.Airtime-Other phone");
        System.out.println("3.Buy Bundles");
        System.out.println("4.Buy for a friend");
        System.out.println("5.Buy me a bundle");
        System.out.println("6.TUSUA MAPENE GAMES");
        System.out.println("7.Airtime-Other Networks");
        System.out.println("8.Tuzo");
        System.out.println("9.Islamic Offers");
        int selection = input.nextInt();
        switch (selection) {
//            methods calling
            case 1 -> airtimeMyphone();
            case 2 -> airtimeOtherphone();
            case 3 -> buybundle();
            case 4 -> buyForFriend();
            case 5 -> buymeBundle();
            case 6 -> TUSUAMAPENE();
            case 7 -> airtimeotherNet();
            case 8 -> tuzo();
            case 9 -> islamicOffer();

        }


    }
    //method for airtime my phone
    public void airtimeMyphone() {
        System.out.println("Enter amount");
        amount = input.nextInt();
        System.out.println("Enter PIN");
        pin = input.nextInt();
        if (pin == 1234) {
            System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
            selection = input.nextInt();
            if (selection == 1) {
                System.out.println("Your request has been submitted");
            } else if (selection == 2) {
                System.out.println("You cancelled the request");
            }


        } else {
            selection = input.nextInt();
            if (selection == 1) {
                System.out.println("Your request has been submitted");


                System.out.println("You entered the wrong PIN.your account will be locked if you enter wrong PIN five times.Please check and try again.");
            } else if (selection == 2) {
                System.out.println("You cancelled the request");
            }


        }


    }
    //method for airtime other phone
    public void airtimeOtherphone() {
        System.out.println("1.Vodacom");
        System.out.println("2.Other Networks");
        selection = input.nextInt();

        if (selection == 1) {

            System.out.println("Please Enter phone number ");
            phoneno = input.nextInt();
            System.out.println("Enter amount ");
            amount = input.nextInt();
            System.out.println("Enter PIN");
            pin = input.nextInt();
            if (pin == 1234) {
                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                selection = input.nextInt();
                if (selection == 1) {
                    System.out.println("Your request has been submitted");
                } else if (selection == 2) {
                    System.out.println("You cancelled the request");
                }
            }

        } else if (selection == 2) {
            System.out.println("Choose:");
            System.out.println("1.Halotel");
            System.out.println("2.Airtel");
            System.out.println("3.TTCL");
            System.out.println("4.Smile");

            selection = input.nextInt();

            switch (selection) {
                case 1 -> {
                    System.out.println("Enter phone number");
                    phoneno = input.nextInt();

                    System.out.println("Enter amount ");
                    amount = input.nextInt();
                    System.out.println("Enter PIN");
                    pin = input.nextInt();
                    if (pin == 1234) {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        }


                    } else {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                            System.out.println("You entered the wrong PIN.your account will be locked if you enter wrong PIN five times.Please check and try again.");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        }
                    }
                }


                case 2 -> {
                    System.out.println("enter phone number");
                    phoneno = input.nextInt();

                    System.out.println("Enter amount ");
                    amount = input.nextInt();
                    System.out.println("Enter PIN");
                    pin = input.nextInt();
                    if (pin == 1234) {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        } else {
                            System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                            selection = input.nextInt();
                            if (selection == 1) {
                                System.out.println("Your request has been submitted");
                                System.out.println("You entered the wrong PIN.your account will be locked if you enter wrong PIN five times.Please check and try again.");
                            } else if (selection == 2) {
                                System.out.println("You cancelled the request");
                            }
                        }

                    }

                }
                case 3 -> {
                    System.out.println("enter the phone number");
                    phoneno = input.nextInt();

                    System.out.println("Enter amount ");
                    amount = input.nextInt();
                    System.out.println("Enter PIN");
                    pin = input.nextInt();
                    if (pin == 1234) {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        }


                    } else {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                            System.out.println("You entered the wrong PIN.your account will be locked if you enter wrong PIN five times.Please check and try again.");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        }
                    }
                }
                case 4 -> {

                    System.out.println("Enter the phone number");
                    phoneno = input.nextInt();

                    System.out.println("Enter amount ");
                    amount = input.nextInt();
                    System.out.println("Enter PIN");
                    pin = input.nextInt();
                    if (pin == 1234) {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        }


                    } else {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                            System.out.println("You entered the wrong PIN.your account will be locked if you enter wrong PIN five times.Please check and try again.");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        }
                    }
                }

            }


        }
    }
    // METHOD FOR BUY BUNDLE
    public void buybundle() {
        System.out.println("1.Just for You Offer");
        System.out.println("2.Cheka (All Networks");
        System.out.println("3.Internet");
        System.out.println("4.SMS");
        System.out.println("5.RED Relax");
        System.out.println("6.Pindua Units");
        System.out.println("7.International &Roaming");


        selection = input.nextInt();


        switch (selection) {


            case 1 -> {
                System.out.println("Karibu:");
                System.out.println("1.Voice");
                System.out.println("2.Internet");
                System.out.println("3.JIMIXIE");
                System.out.println("4.North Special");
                System.out.println("5.Kijiweni");
                System.out.println("6.Just For You(Mpesa)");
                System.out.println("7.Welcome Offer");
                System.out.println("8.Chimbo");
                System.out.println("9.Buy for friend");

                selection = input.nextInt();
                switch (selection) {


                    case 1 -> {
                        System.out.println("1.Tsh2000=Dk100+10SMS+MB100/siku 7");
                        System.out.println("2.Tsh3000=Dk370+30SMS/siku 7");
                        System.out.println("3.Tsh20000=Dk2100+SMS100/siku 30");
                        selection = input.nextInt();
                        switch (selection) {
                            case 1 -> {
                                System.out.println("Buy dk100 mitandao yote,10SMS,MB100@Tsh2000 to your number " +
                                        "through"
                                );
                                System.out.println("1.Airtime");
                                System.out.println("2.MPesa");


                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Thank you for choosing this offer, you will be notified " +
                                            "once processing completes");
                                } else if (selection == 2) {

                                    System.out.println("Enter PIN");
                                    pin = input.nextInt();
                                    if (pin == 1234) {
                                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                        selection = input.nextInt();
                                        if (selection == 1) {
                                            System.out.println("Your request has been submitted");
                                        } else if (selection == 2) {
                                            System.out.println("You cancelled the request");
                                        }


                                    } else {
                                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                        selection = input.nextInt();
                                        if (selection == 1) {
                                            System.out.println("Your request has been submitted");
                                            System.out.println("You entered the wrong PIN.your account will be locked if you enter wrong PIN five times.Please check and try again.");
                                        } else if (selection == 2) {
                                            System.out.println("You cancelled the request");
                                        }
                                    }
                                }
                            }


                            case 2 -> {
                                System.out.println("1.Tzs 500=MB300/saa 24\n2.Tzs 1000=MB650/siku 3\n3.Tzs 10000=5Gb/siku30");
                                selection = input.nextInt();
                                switch (selection) {
                                    case 1 -> {
                                        System.out.println("Enter PIN TO buy bundle 300MB@Tsh500 through M-pesa");

                                        pin = input.nextInt();
                                        if (pin == 1234) {
                                            System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                            selection = input.nextInt();
                                            if (selection == 1) {
                                                System.out.println("Your request has been submitted");
                                            } else if (selection == 2) {
                                                System.out.println("You cancelled the request");
                                            }


                                        }

                                    }
                                    case 2 -> {
                                        System.out.println("Enter PIN TO buy bundle 650MB@TZS1000 through M-pesa");

                                        pin = input.nextInt();
                                        if (pin == 1234) {
                                            System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                            selection = input.nextInt();
                                            if (selection == 1) {
                                                System.out.println("Your request has been submitted");
                                            } else if (selection == 2) {
                                                System.out.println("You cancelled the request");
                                            }


                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Enter PIN TO buy bundle 5GB@TZS10000 through M-pesa");

                                        pin = input.nextInt();
                                        if (pin == 1234) {
                                            System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                            selection = input.nextInt();
                                            if (selection == 1) {
                                                System.out.println("Your request has been submitted");
                                            } else if (selection == 2) {
                                                System.out.println("You cancelled the request");
                                            }


                                        }
                                    }
                                }
                            }
                            case 3 -> {

                                System.out.println("Convert Airtime to:\n1.Minutes\n2.Internet\n3.SMS\n4.COMBO(Min+MB+SMS\n5." +
                                        "Convert for a friend\n");
                                selection=input.nextInt();
                                if (selection==1){
                                    System.out.println("Select validity period\n1.day\nweek\nmonth");
                                    selection=input.nextInt();
                                    switch (selection){
                                        case 1->{
                                            System.out.println("Enter any amount  starting from Tzs 500");
                                            amount= input.nextInt();
                                            if(amount<500){
                                                System.exit(0);
                                            }
                                            else{
                                                System.out.println("Converting Airtime to:\nTzs"+amount+
                                                        "=dk35(mitandao yote)/24hrs");
                                                System.out.println(" Enter PIN Buy bundle @tzs"+amount+"=dk35");
                                                pin= input.nextInt();


                                            }
                                        }
                                    }

                                }
                                else if (selection==2){


                                }

                                else if (selection==3){

                                }
                                else if (selection==4){

                                }
                                else if (selection==5){

                                }

                            }
                            case 4 -> {


//                                north special
                                System.out.println("Offers:\n1.Tzs500=Dk50+50sms/saa24\n2.Tzs500=Dk30+10sms/saa24" +

                                        "\n3.Tzs1000=Dk40+30sms+Mb500/siku7\n4.Tzs1000=Dk130+300sms/siku7\n3.Tzs1500=Dk110+40sms+Mb600/siku7" +
                                        "\n6.Tzs500=MB300/saa24\n7.Tzs1500=Dk40+40sms+Mb800/siku7\n3.Tzs3000=GB1.9/siku7");
                                selection = input.nextInt();
                                switch (selection) {
                                    case 1 -> {
                                        System.out.println("Buy DK50+50sms by TZS500 through\n" +
                                                "1.Airtime\n" +
                                                "2.Mpesa");
                                        selection = input.nextInt();

                                        if (selection == 1) {
                                            System.out.println("Your request is currently being processed ");

                                        } else if (selection == 2) {


                                            System.out.println("Enter PIN :");
                                            pin = input.nextInt();
                                            if (pin == 1234) {
                                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                                selection = input.nextInt();
                                                if (selection == 1) {
                                                    System.out.println("Your request has been submitted");
                                                } else if (selection == 2) {
                                                    System.out.println("You cancelled the request");
                                                }
                                            }
                                        }
                                    }

                                    case 2 -> {
                                        System.out.println("Buy DK30+10sms by TZS500 through\n" +
                                                "1.Airtime\n" +
                                                "2.Mpesa");
                                        selection = input.nextInt();

                                        if (selection == 1) {
                                            System.out.println("Your request is currently being processed ");

                                        } else if (selection == 2) {


                                            System.out.println("Enter PIN :");
                                            pin = input.nextInt();
                                            if (pin == 1234) {
                                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                                selection = input.nextInt();
                                                if (selection == 1) {
                                                    System.out.println("Your request has been submitted");
                                                } else if (selection == 2) {
                                                    System.out.println("You cancelled the request");
                                                }
                                            }
                                        }
                                    }
                                    case 3 -> {
                                        System.out.println("Buy DK40+30sms+MB500 by TZS1000 through\n" +
                                                "1.Airtime\n" +
                                                "2.Mpesa");
                                        selection = input.nextInt();

                                        if (selection == 1) {
                                            System.out.println("Your request is currently being processed ");

                                        } else if (selection == 2) {


                                            System.out.println("Enter PIN :");
                                            pin = input.nextInt();
                                            if (pin == 1234) {
                                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                                selection = input.nextInt();
                                                if (selection == 1) {
                                                    System.out.println("Your request has been submitted");
                                                } else if (selection == 2) {
                                                    System.out.println("You cancelled the request");
                                                }
                                            }
                                        }
                                    }
                                    case 4 -> {
                                        System.out.println("Buy DK130+300SMSby TZS1000 through\n" +
                                                "1.Airtime\n" +
                                                "2.Mpesa");
                                        selection = input.nextInt();

                                        if (selection == 1) {
                                            System.out.println("Your request is currently being processed ");

                                        } else if (selection == 2) {


                                            System.out.println("Enter PIN :");
                                            pin = input.nextInt();
                                            if (pin == 1234) {
                                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                                selection = input.nextInt();
                                                if (selection == 1) {
                                                    System.out.println("Your request has been submitted");
                                                } else if (selection == 2) {
                                                    System.out.println("You cancelled the request");
                                                }
                                            }
                                        }

                                    }
                                    case 5 -> {
                                        System.out.println("Buy Dk110+40sms+MB600 by TZS1500 through\n" +
                                                "1.Airtime\n" +
                                                "2.Mpesa");
                                        selection = input.nextInt();

                                        if (selection == 1) {
                                            System.out.println("Your request is currently being processed ");

                                        } else if (selection == 2) {


                                            System.out.println("Enter PIN :");
                                            pin = input.nextInt();
                                            if (pin == 1234) {
                                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                                selection = input.nextInt();
                                                if (selection == 1) {
                                                    System.out.println("Your request has been submitted");
                                                } else if (selection == 2) {
                                                    System.out.println("You cancelled the request");
                                                }
                                            }
                                        }
                                    }
                                    case 6 -> {
                                        System.out.println("Buy MB300 by TZS500 through\n" +
                                                "1.Airtime\n" +
                                                "2.Mpesa");
                                        selection = input.nextInt();

                                        if (selection == 1) {
                                            System.out.println("Your request is currently being processed ");

                                        } else if (selection == 2) {


                                            System.out.println("Enter PIN :");
                                            pin = input.nextInt();
                                            if (pin == 1234) {
                                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                                selection = input.nextInt();
                                                if (selection == 1) {
                                                    System.out.println("Your request has been submitted");
                                                } else if (selection == 2) {
                                                    System.out.println("You cancelled the request");
                                                }
                                            }
                                        }
                                    }
                                    case 7 -> {
                                        System.out.println("Buy DK40+30sms+MB800 by TZS1500 through\n" +
                                                "1.Airtime\n" +
                                                "2.Mpesa");
                                        selection = input.nextInt();

                                        if (selection == 1) {
                                            System.out.println("Your request is currently being processed ");

                                        } else if (selection == 2) {


                                            System.out.println("Enter PIN :");
                                            pin = input.nextInt();
                                            if (pin == 1234) {
                                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                                selection = input.nextInt();
                                                if (selection == 1) {
                                                    System.out.println("Your request has been submitted");
                                                } else if (selection == 2) {
                                                    System.out.println("You cancelled the request");
                                                }
                                            }
                                        }
                                    }
                                    case 8 -> {
                                        System.out.println("Buy MB500 by TZS1000 through\n" +
                                                "1.Airtime\n" +
                                                "2.Mpesa");
                                        selection = input.nextInt();

                                        if (selection == 1) {
                                            System.out.println("Your request is currently being processed ");

                                        } else if (selection == 2) {


                                            System.out.println("Enter PIN :");
                                            pin = input.nextInt();
                                            if (pin == 1234) {
                                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                                selection = input.nextInt();
                                                if (selection == 1) {
                                                    System.out.println("Your request has been submitted");
                                                } else if (selection == 2) {
                                                    System.out.println("You cancelled the request");
                                                }
                                            }
                                        }
                                    }

                                }


                            }


                        }
                    }
                    case 2 -> {
                        System.out.println("1.Daily");
                        System.out.println("2.Weekly");
                        System.out.println("3.Monthly");
                        System.out.println("4.Non Expiry(haliishi)");
                        System.out.println("5.Buy me a bundle");
                        System.out.println("6.Bundle balance");
//                            System.out.println("00 back");
//                            System.out.println("99 Main");
                        selection = input.nextInt();

                        switch (selection) {
                            case 1 -> {
                                System.out.println("1.Tsh 500=25min+5SMS/24hrs");
                                System.out.println("1.Tsh 1000=150min+20SMS/24hrs");
//                                    System.out.println("00 back");
//                                    System.out.println("99 Main");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Enter PIN TO buy bundle 15min+(10minfor night,12am=4:59am" +
                                            ")Allnet,5SMS@Tsh500 through M-pesa");

                                    pin = input.nextInt();
                                    if (pin == 1234) {
                                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                        selection = input.nextInt();
                                        if (selection == 1) {
                                            System.out.println("Your request has been submitted");
                                        } else if (selection == 2) {
                                            System.out.println("You cancelled the request");
                                        }


                                    }


                                } else if (selection == 2) {

                                    System.out.println("Enter PIN TO buy bundle 15min+(10minfor night,12am=4:59am" +
                                            ")Allnet,5SMS@Tsh500 through M-pesa");

                                    pin = input.nextInt();
                                    if (pin == 1234) {
                                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                        selection = input.nextInt();
                                        if (selection == 1) {
                                            System.out.println("Your request has been submitted");
                                        } else if (selection == 2) {
                                            System.out.println("You cancelled the request");
                                        }


                                    }
                                }
                            }
                        }

                    }




                    case 3-> {
                        System.out.println("1.Tsh2500=150min+30SMS");
                        System.out.println("2.Tsh3000=370min+30SMS");
                        System.out.println("3.Tsh5000=700min+50SMS");
                        System.out.println("4.Tsh10000=400min+100SMS+3GB");
//                System.out.println("00 back");
//                System.out.println("99 Main");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println(" Enter a PIN  to buy 150min+30SMS by Tsh 2500 through mpesa");
                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            }
                        } else if (selection == 2) {

                            System.out.println(" Enter a PIN  to buy 370min+30SMS by Tsh 3000 through mpesa");
                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            }

                        } else if (selection == 3) {

                            System.out.println(" Enter a PIN  to buy 700min+50SMS by Tsh 2500 through mpesa");
                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            }
                        } else if (selection == 4) {

                            System.out.println(" Enter a PIN  to buy 400min+100SMS +3GB by Tsh 10000 through mpesa");
                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            }
                        }
                    }

                    case 4 -> {
                        System.out.println("1.Tsh10000=750min+50SMS");
                        System.out.println("2.Tsh20000=2100min+100SMS");
                        System.out.println("3.Tsh30000=1200min+500SMS+7GB");
                        System.out.println("4.Tsh50000=2000min+500SMS+18GB");
//                System.out.println("00 back");
//                System.out.println("99 Main");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println(" Enter a PIN  to buy 750min+50SMS by Tsh 10000 through mpesa");
                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }
                            }
                        } else if (selection == 2) {

                            System.out.println(" Enter a PIN  to buy 2100min+100SMS by Tsh 20000 through mpesa");
                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            }

                        } else if (selection == 3) {

                            System.out.println(" Enter a PIN  to buy 1200min+500SMS+7GB by Tsh 30000 through mpesa");
                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            }
                        } else if (selection == 4) {

                            System.out.println(" Enter a PIN  to buy 2000min+500SMS +GB by Tsh 10000 through mpesa");
                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }
                            }
                        }
                    }


                }
            }
        }
    }
    //method for buy for friend
    public void buyForFriend() {
        System.out.println("1.Cheka (All Networks");
        System.out.println("2.Internet");
        System.out.println("3.SMS");
        System.out.println("4.RED Relax");
        System.out.println("5.Pindua Units");
        System.out.println("6.International &Roaming");


        selection = input.nextInt();

        switch (selection) {


            case 1 -> {
                System.out.println("1.Daily");
                System.out.println("2.Weekly");
                System.out.println("3.Monthly");
                System.out.println("4.Non Expiry(haliishi)");
                System.out.println("5.Buy me a bundle");
                System.out.println("6.Bundle balance");
//                            System.out.println("00 back");
//                            System.out.println("99 Main");
                selection = input.nextInt();

                switch (selection) {
                    case 1 -> {
                        System.out.println("1.Tsh 500=25min+5SMS/24hrs");
                        System.out.println("1.Tsh 1000=150min+20SMS/24hrs");
//                                    System.out.println("00 back");
//                                    System.out.println("99 Main");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Enter PIN TO buy bundle 15min+(10minfor night,12am=4:59am" +
                                    ")Allnet,5SMS@Tsh500 through M-pesa");

                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            }


                        } else if (selection == 2) {

                            System.out.println("Enter PIN TO buy bundle 15min+(10minfor night,12am=4:59am" +
                                    ")Allnet,5SMS@Tsh500 through M-pesa");

                            pin = input.nextInt();
                            if (pin == 1234) {
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            }
                        }
                    }
                }

            }


            case 2 -> {

//                internet

                System.out.println("1.Internet supa");
                System.out.println("2.Social bundles");
                System.out.println("3.Video bundles");
                System.out.println("4.Data speed management ");
                System.out.println("5.Bundle balance");
                System.out.println("6.Change options to be used once bundle has depleted 0r expire");
                System.out.println("00 back");
                System.out.println("99 manin");

                selection = input.nextInt();
                if (selection == 1) {
                    System.out.println("1.Daily\n2.Weekly\n3.Monthly");
                    selection = input.nextInt();
                    switch (selection) {
                        case 1 -> {
                            System.out.println("1.Tzs 3000=1.5gb\n2.Tzs 5000=3gb\n3.Tzs 10000=6gb\n4.tzs 15000=9.5gb\n5Tzs 20000=13gb");

                            selection = input.nextInt();
                            if (selection == 1) {
                                System.out.println("Enter pin to buy 1.5gb by tzs 3000 for " + phoneno);
                                pin = input.nextInt();
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }


                            } else if (selection == 2) {
                                System.out.println("Enter pin to buy 3gb by tzs 5000 for " + phoneno);
                                pin = input.nextInt();
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }

                            } else if (selection == 3) {
                                System.out.println("Enter pin to buy 6gb by tzs 10000 for " + phoneno);
                                pin = input.nextInt();
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }

                            } else if (selection == 4) {
                                System.out.println("Enter pin to buy 9.5gb by tzs 15000 for " + phoneno);
                                pin = input.nextInt();
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }

                            } else if (selection == 5) {
                                System.out.println("Enter pin to buy 13gb by tzs 20000 for " + phoneno);
                                pin = input.nextInt();
                                System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                                selection = input.nextInt();
                                if (selection == 1) {
                                    System.out.println("Your request has been submitted");
                                } else if (selection == 2) {
                                    System.out.println("You cancelled the request");
                                }

                            } else {
                                System.exit(0);
                            }

                        }


                        case 2 -> {
                            System.out.println("1.");
                        }

                        case 3 -> {
                            System.out.println("hey");
                        }


                    }
                }
            }

            case 3 -> {

//
                System.out.println("1.Tzs 500=SMS500/24hrs\n2.Tzs 1000=SMS5000/7days\n3.Tzs 2000=SMS 10000/30days");
                selection = input.nextInt();

                if (selection == 1) {
                    System.out.println("Enter pin to buy 500SMS by  Tzs 500");
                    pin = input.nextInt();
                    System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Your request has been submitted");
                    } else if (selection == 2) {
                        System.out.println("You cancelled the request");
                    } else {
                        System.exit(0);
                    }

                } else if (selection == 2) {

                    System.out.println("Enter pin to buy 5000SMS by  Tzs 1000");
                    pin = input.nextInt();
                    System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Your request has been submitted");
                    } else if (selection == 2) {
                        System.out.println("You cancelled the request");
                    } else {
                        System.exit(0);
                    }


                } else if (selection == 3) {
                    System.out.println("Enter pin to buy 1000SMS by  Tzs 2000 for 30 days");
                    pin = input.nextInt();
                    System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Your request has been submitted");
                    } else if (selection == 2) {
                        System.out.println("You cancelled the request");
                    } else {
                        System.exit(0);
                    }

                } else {
                    System.exit(0);
                }
            }
            case 4 -> {


            }
        }
    }
    //  method for  buy me bundle
    public void buymeBundle() {

        System.out.println("1.Send request");
        System.out.println("2.View request");
        System.out.println("3.Information");

        selection = input.nextInt();

        if (selection == 1) {
            System.out.println("1.Requests sent status");
            System.out.println("1.Requests received");

            selection = input.nextInt();
            switch (selection) {

                case 1 -> {
                    System.out.println("There is no pending request ");
                }

                case 2 -> {
                    System.out.println("no request received");
                }
                default -> System.exit(0);
            }


        } else if (selection == 2) {
            System.out.println("request are unavailable");

        } else if (selection == 3) {
            System.out.println("This service enables a customer to ask friends/family to pay for a specified bundle by sending a specified" +
                    "chosen bundle request");
        }


    }
//    method for tusua mapene

    public void TUSUAMAPENE() {


        System.out.println("Everyday prayers win millions,select and play now!\n1.Daily ticket Tzs 500\n2.Weekly ticket Tzs 1800\n3.Monthly ticket Tzs 6000\n4.TUSUA SPOTI\n5." +
                "buy for friend ");

        selection = input.nextInt();

        if (selection == 1) {

            System.out.println("Enter M_pesa PIN");
            pin = input.nextInt();

            System.out.println("Press 1 to Confirm or 2 to Cancel");
            selection = input.nextInt();

            if (selection == 1) {
                System.out.println("your request has been submitted");

            } else if (selection == 2) {

                System.out.println("The request has been cancelled");
            }

            //else
        } else if (selection == 2) {

            System.out.println("Enter M_pesa PIN");
            pin = input.nextInt();

            System.out.println("Press 1 to Confirm or 2 to Cancel");
            selection = input.nextInt();

            if (selection == 1) {
                System.out.println("your request has been submitted");

            } else if (selection == 2) {

                System.out.println("The request has been cancelled");
            }

            //else
        }


        if (selection == 3) {

            System.out.println("Enter M_pesa PIN");
            pin = input.nextInt();

            System.out.println("Press 1 to Confirm or 2 to Cancel");
            selection = input.nextInt();

            if (selection == 1) {
                System.out.println("your request has been submitted");

            } else if (selection == 2) {

                System.out.println("The request has been cancelled");
            }

            //else
        } else if (selection == 4) {

            System.out.println("1.Tzs 1000\n2.Tzs 5000\n3.Tzs 10000\n4.Other amounts\n5.Buy for a friend");
            selection = input.nextInt();

            switch (selection) {

                case 1, 2, 3 -> {
                    System.out.println("Enter M_pesa PIN");
                    pin = input.nextInt();
                    if (pin == 1234) {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        }
                    } else {
                        System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                        selection = input.nextInt();
                        if (selection == 1) {
                            System.out.println("Your request has been submitted");
                            System.out.println("You entered a wrong PIN");
                        } else if (selection == 2) {
                            System.out.println("You cancelled the request");
                        }

                    }


                }

            }
        }
    }

    // method for airtime other networks
    public void airtimeotherNet() {

        System.out.println("1.Halotel");
        System.out.println("2.Airtel");
        System.out.println("3.TTCL");
        System.out.println("4.Smile");

        selection = input.nextInt();


        switch (selection) {


            case 1, 2, 3, 4 -> {
                System.out.println("Please enter phone number");
                phoneno = input.nextInt();
                System.out.println("Enter amount");
                amount = input.nextInt();
                System.out.println("Enter pin ");
                pin = input.nextInt();

                if (pin == 1234) {
                    System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Your request has been submitted");
                    } else if (selection == 2) {
                        System.out.println("You cancelled the request");
                    }
                } else {
                    System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Your request has been submitted");
                        System.out.println("You entered a wrong PIN");
                    } else if (selection == 2) {
                        System.out.println("You cancelled the request");
                    }

                }

            }

        }

    }
    //method for tuzo
    public void tuzo() {
        System.out.println("1.TUZO Points");
        System.out.println("2.Vodacom Deals");
        System.out.println("00 back");
        System.out.println("99 Main");
        selection = input.nextInt();

        if (selection == 1) {
            System.out.println("Welcome to TUZO Points");
            System.out.println("select");

            System.out.println("1.points balance");
            System.out.println("2.Redeem points");
            System.out.println("3.Information");

            selection = input.nextInt();
            if (selection == 1) {
                System.out.println("you have 2300 tuzo points use them for one year");
            } else if (selection == 2) {
                //redeem points
                System.out.println("1.Buy bundle");
                System.out.println("2.Pay by points");
                System.out.println("3.convert to mpesa wallet");
                selection = input.nextInt();

                if (selection == 1) {

                    System.out.println("1.voice");
                    System.out.println("2.internet");
                    selection = input.nextInt();


                    if (selection == 1) {
                        System.out.println("hello");


                    }
                    //unfinished

                    else if (selection == 2) {

                        System.out.println("hey");
                    }

                } else if (selection == 2) {
                    //PAY BY POINTS
                    System.out.println("your points are converted into money to pay your loans");

                } else if (selection == 3) ;
                {
                    //TO WALLET
                    System.out.println("Your points are.... converted into money and send to ur mpesa wallet");
                }


            } else if (selection == 3) {
                //information
                System.out.println("Your tuzo points can be redeemed or converted into money then send to ur" +
                        "mpesa wallet or use it to pay some loans");
            } else {
                System.out.println("default");
            }
        } else if (selection == 2) {
            //voda deals

            System.out.println("Yet no deals found");
        }

    }
//method for islamic offer

    public void islamicOffer() {
        System.out.println("FREE ISLAMIC CONTENT");
        System.out.println("1.Tshs 1000=100min+10sms/24hrs");
        System.out.println("2.Tshs 1000=100units/24hrs");
        System.out.println("3.Tshs25000=100min+20sms/7days");
//                System.out.println("4.Voda-ihsan");
        System.out.println("00 back");
        System.out.println("99 Main");
        selection = input.nextInt();

        if (selection == 1) {
            System.out.println("Buy bundle 50min all nets,50min voda, 10sms+islamic cntent@Tsh 1000through" +
                    "1.Airtime" +
                    "2.Mpesa");
            selection = input.nextInt();

            if (selection == 1) {
                System.out.println("Your request is currently being processed ");

            } else if (selection == 2) {


                System.out.println("Enter PIN :");
                pin = input.nextInt();
                if (pin == 1234) {
                    System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Your request has been submitted");
                    } else if (selection == 2) {
                        System.out.println("You cancelled the request");
                    }
                }
            }

        } else if (selection == 2) {
            System.out.println("Buy bundle 100units+islamic cntent/24hrs@Tsh 1000through" +
                    "1.Airtime" +
                    "2.Mpesa");
            selection = input.nextInt();

            if (selection == 1) {
                System.out.println("Your request is currently being processed ");

            } else if (selection == 2) {


                System.out.println("Enter PIN :");
                pin = input.nextInt();
                if (pin == 1234) {
                    System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Your request has been submitted");
                    } else if (selection == 2) {
                        System.out.println("You cancelled the request");
                    }
                }
            }
        }
        //
        else if (selection == 3) {
            System.out.println("Buy bundle 100min +20sms +islamic content/7 days@Tsh 1000through\n" +
                    "1.Airtime\n" +
                    "2.M-pesa");
            selection = input.nextInt();

            if (selection == 1) {
                System.out.println("Your request is currently being processed ");

            } else if (selection == 2) {


                System.out.println("Enter PIN :");
                pin = input.nextInt();
                if (pin == 1234) {
                    System.out.println("press 1 to confirm or 2 to decline purchase $amount airtime");
                    selection = input.nextInt();
                    if (selection == 1) {
                        System.out.println("Your request has been submitted");
                    } else if (selection == 2) {
                        System.out.println("You cancelled the request");
                    }
                }
            }
        }
    }

}