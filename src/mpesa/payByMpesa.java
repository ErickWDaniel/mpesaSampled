package mpesa;

import java.util.Scanner;

public class payByMpesa {
    int pin=1234;
    Scanner input = new Scanner(System.in);
    public void payByMpesa()
    {
        System.out.println("Pay by M-PESA\n1.Pay by phone\n2.LUKU\n3.Choose " +
                "business\n4.Enter bussiness Number\n5.Government Payment\n6.Mpesa " +
                "VISA card\n7.Gaming\n8.Standing order\n9.More");
        int paybympesaselection=input.nextInt();
        switch(paybympesaselection)
        {
            case 1->payByPhone();
            case 2->luku();
            case 3->choosebusiness();
            case 4->enterbusinessNumber();
            case 5->governmetnpayment();
            case 6->mpesavizacard();
            case 7->gaming();
            case 8->standingorder();
            case 9->more();
            default->System.exit(0);

        }

    }



    public void payByPhone()
    {
        System.out.println("Pay by phone\n1.Enter LIPA number\n2M-Kanisa\n3.Enter Changisha number");
        int payByPhoneselection=input.nextInt();
        if(payByPhoneselection==1)
        {
            System.out.println("Enter Lipa number");
            int lipanumber=input.nextInt();
            System.out.println("Enter amount in Tanzania Shilings");
            int  lipaAmount=input.nextInt();
            System.out.println("Enter PIN");
            pin=input.nextInt();
            System.out.println("Press 1 to Confirm or 2 To cancel");
            int agree=input.nextInt();

            if(agree==1)
                {
                    System.out.println("Your request has been submitted.");
                    System.out.println("Your request is currently being processed");
                }
            else
            {
                System.out.println("You process has been terminated");
                System.exit(0);
             }
         }
        else if(payByPhoneselection==2)
        {
            System.out.println("1.My Churches\n2.Send Offering or Contribution\n3.Register Church\n4.Remove a church");
            int churchselection=input.nextInt();
            if(churchselection==1)
            {
                System.out.println("No church found");
                System.out.println("Enter 1 to register a church");
                int church1= input.nextInt();
                System.out.println("check your church code");
                System.exit(0);
            }
            else if(churchselection==2)
            {
                System.out.println("Enter church code");
                int churchcode=input.nextInt();
                System.out.println("Choose purpose");
                System.out.println("1.Offering\n2.Tyth\n3.Construction\n4.Others");
                int purpose=input.nextInt();
                if(purpose==1)
                {
                    System.out.println("Enter Amount");
                    int offeringAmount=input.nextInt();
                    System.out.println("Enter PIN To Confirm");
                    pin=input.nextInt();
                    System.out.println("Your request has been submitted");
                }
                else if(purpose==2)
                {
                    System.out.println("Enter Amount");
                    int offeringAmount=input.nextInt();
                    System.out.println("Enter PIN To Confirm");
                    pin=input.nextInt();
                    System.out.println("Your request has been submitted");
                }
                else if(purpose==3)
                {
                    System.out.println("Enter Amount");
                    int offeringAmount=input.nextInt();
                    System.out.println("Enter PIN To Confirm");
                    pin=input.nextInt();
                    System.out.println("Your request has been submitted");
                }
                else
                {
                    System.exit(0);
                }
            }
            else if(payByPhoneselection==3)
            {
                System.out.println("Enter Changisha Code");
                int changishacode= input.nextInt();
                System.out.println("You have no changisha account");
                System.exit(0);

            }
            else {
                System.exit(0);
            }
        }


    }
    public void luku()
    {
        System.out.println("Please select option\n1.Enter reference No.\nLookup\n3.Retrieve LUKU TOKEN");
        int lukuselection= input.nextInt();
        if(lukuselection==1)
        {
            System.out.println("Enter Reference Numbers");
            int referrenceNamba=input.nextInt();
            System.out.println("Enter Amount");
            int lukuamount=input.nextInt();
            System.out.println("Enter pin");
            pin=input.nextInt();
            System.out.println("Press 1 to confirm or 2 to decline pay"+lukuamount+"Tshs To utility Luku 668800" +
                    "for account "+referrenceNamba+"M-pesa fee Tshs"+(lukuamount*0.02));
        }
        else if(lukuselection==2)
        {
            System.out.println("Please choose reference");
            int referencespace=input.nextInt();
            System.out.println("Please choose reference");
             referencespace=input.nextInt();
            System.out.println("Please choose reference");
             referencespace=input.nextInt();
             System.exit(0);

        }
        else if(lukuselection==3)
        {
            System.out.println("Enter reference number");
            int reference_number=input.nextInt();
            System.out.println("Enter Amount");
            int amountentered=input.nextInt();
            System.out.println("Enter pin");
            pin=input.nextInt();
            System.out.println("Enter 1 to confirm");
            int _1confirm=input.nextInt();
            System.out.println("Your Request is in process");
            System.exit(0);
        }
        else {
            System.exit(0);
        }

    }
    public void choosebusiness()
    {
        System.out.println("1.Tv Subscrintion\n2.Purchases &Rent\n3.Pay School Fee\n4.Loans" +
                "\n5.Vodacom\n6.Insuarence\n7Water Bills\n8.Education Services\n9.More");
        int serviceNumber=input.nextInt();
        if(serviceNumber==1) {
            System.out.println("1.DSTV\n2.STARTIMES\n3.TING\n4.ZUKU\n5.AZAM TV\n6.SIBUKA MAISHA\n7.Contenetal Decoder" +
                    "\n8.Milan Cable TV\n9.More");
            int tvChannel=input.nextInt();
            if(tvChannel==1)
            {
                int businessselection = input.nextInt();
                switch (businessselection) {
                    case 1 -> {
                        System.out.println("DSTV\n1.DSTV\n2.DSTV Business\n3.DSTV Standing order");
                        int dstvchoice = input.nextInt();
                        if (dstvchoice == 1) {
                            System.out.println("Please select option\n1.Enter Reference\n2.Lookup");
                            int dstvsubmain = input.nextInt();
                            if (dstvsubmain == 1) {
                                System.out.println("DSTV\n1.Premium-145000\n2.Compact Plus-93000\n3.Compact-51000\n4.Shangwe(Famil)-" +
                                        "31000\n5.Bomba(Access)-21000\n6.Poa-9900\n7.PVR/ExtraView-27000\n8.More");
                                int subsubMainDstv = input.nextInt();
                                if (subsubMainDstv == 1) {
                                    System.out.println("Enter PIN");
                                    System.out.println("Hello \nPress 1 to confirm or 2 To decline pay 145000 to utility Dstv" +
                                            "for account" + dstvsubmain);
                                    int confimSelect = input.nextInt();
                                    if (confimSelect == 1) {
                                        System.out.println("Your request is current Processed");
                                    } else {
                                        System.out.println("The request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (subsubMainDstv == 2) {
                                    System.out.println("Enter PIN");
                                    System.out.println("Hello \nPress 1 to confirm or 2 To decline pay 93000 to utility Dstv" +
                                            "for account" + dstvsubmain);
                                    int confimSelect = input.nextInt();
                                    if (confimSelect == 1) {
                                        System.out.println("Your request is current Processed");
                                    } else {
                                        System.out.println("The request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (subsubMainDstv == 3) {
                                    System.out.println("Enter PIN");
                                    System.out.println("Hello \nPress 1 to confirm or 2 To decline pay 51000 to utility Dstv" +
                                            "for account" + dstvsubmain);
                                    int confimSelect = input.nextInt();
                                    if (confimSelect == 1) {
                                        System.out.println("Your request is current Processed");
                                    } else {
                                        System.out.println("The request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (subsubMainDstv == 4) {
                                    System.out.println("Enter PIN");
                                    System.out.println("Hello \nPress 1 to confirm or 2 To decline pay 31000 to utility Dstv" +
                                            "for account" + dstvsubmain);
                                    int confimSelect = input.nextInt();
                                    if (confimSelect == 1) {
                                        System.out.println("Your request is current Processed");
                                    } else {
                                        System.out.println("The request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (subsubMainDstv == 5) {
                                    System.out.println("Enter PIN");
                                    System.out.println("Hello \nPress 1 to confirm or 2 To decline pay 21000 to utility Dstv" +
                                            "for account" + dstvsubmain);
                                    int confimSelect = input.nextInt();
                                    if (confimSelect == 1) {
                                        System.out.println("Your request is current Processed");
                                    } else {
                                        System.out.println("The request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (subsubMainDstv == 6) {
                                    System.out.println("Enter PIN");
                                    System.out.println("Hello \nPress 1 to confirm or 2 To decline pay 9900 to utility Dstv" +
                                            "for account" + dstvsubmain);
                                    int confimSelect = input.nextInt();
                                    if (confimSelect == 1) {
                                        System.out.println("Your request is current Processed");
                                    } else {
                                        System.out.println("The request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (subsubMainDstv == 7) {
                                    System.out.println("Enter PIN");
                                    System.out.println("Hello \nPress 1 to confirm or 2 To decline pay 27000 to utility Dstv" +
                                            "for account" + dstvsubmain);
                                    int confimSelect = input.nextInt();
                                    if (confimSelect == 1) {
                                        System.out.println("Your request is current Processed");
                                    } else {
                                        System.out.println("The request has been canceled");
                                        System.exit(0);
                                    }
                                }

                            } else if (dstvsubmain == 2) {
                                System.out.println("Enter Reference");
                                int referrr = input.nextInt();
                                System.out.println("Enter Reference");
                                referrr = input.nextInt();
                                System.exit(0);
                            } else {
                                System.exit(0);
                            }

                        }
                    }
                    case 2 -> {
                        System.out.println("DSTV Business\n1.Play(Bar/Pubs and Clubs)\n2.Work(Office/Vibanda Umiza)\n3.Stay(Hotel/Lodge/GuestHoust)");
                        int bussinessselection = input.nextInt();
                        if (bussinessselection == 1) {
                            System.out.println("Play(Bar Pubs and Clubs\n1.Play Basic-75000\n2.Play Essential\n3.135000\n4." +
                                    "Ultra-200000\n4.Extra view-40000 ");
                            int selectionPlay = input.nextInt();
                            if (selectionPlay == 1) {
                                System.out.println("PLease select option\n1.Reference\n2.Lookup");
                                int referPlay = input.nextInt();
                                if (referPlay == 1) {
                                    System.out.println("Enter Account Number");
                                    int accountNumber = input.nextInt();
                                    System.out.println("Enter pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 75000 Tshs to utility account PLAY " + accountNumber);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (referPlay == 2) {
                                    System.out.println("Enter Account Number");
                                    int accountNumber = input.nextInt();
                                    System.out.println("Enter pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 135000 Tshs to utility account PLAY " + accountNumber);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (referPlay == 3) {
                                    System.out.println("Enter Account Number");
                                    int accountNumber = input.nextInt();
                                    System.out.println("Enter pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 200000 Tshs to utility account PLAY " + accountNumber);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (referPlay == 4) {
                                    System.out.println("Enter Account Number");
                                    int accountNumber = input.nextInt();
                                    System.out.println("Enter pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 40000 Tshs to utility account PLAY " + accountNumber);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                }

                            }
                        } else if (bussinessselection == 2) {
                            System.out.println("Work(Office/Vibanda umiza)\n1.Work Ultra-75000\n2.Work Essential-25000");
                            int selectionBAnda = input.nextInt();
                            if (selectionBAnda == 1) {
                                System.out.println("Please select options\n1.Enter Reference\n2.Lookup");
                                int banda2opt = input.nextInt();
                                if (banda2opt == 1) {
                                    System.out.println("Enter Reference number");
                                    int referenceNamba = input.nextInt();
                                    System.out.println("Enter Pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 75000 Tshs to utility account PLAY " + referenceNamba);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                }
                                if (banda2opt == 2) {
                                    System.out.println("Enter Reference number");
                                    int referenceNamba = input.nextInt();
                                    System.out.println("Enter Pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 25000 Tshs to utility account PLAY " + referenceNamba);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                }
                            }


                        }

                    }
                    case 3 -> {
                        System.out.println("DSTV Standing order\n1.Premium-145000\n2.CompactPlus-93000\n3.Compact-51000\n4.Family-31000" +
                                "\n5.Access(Bomba)-21000\n6.Poa-9900\n7.PVR/ExtraViewAccess-26500\n8.More");
                        {
                            System.out.println("Play(Bar Pubs and Clubs\n1.Play Basic-75000\n2.Play Essential\n3.135000\n4." +
                                    "Ultra-200000\n4.Extra view-40000 ");
                            int selectionPlay = input.nextInt();
                            if (selectionPlay == 1) {
                                System.out.println("PLease select option\n1.Reference\n2.Lookup");
                                int referPlay = input.nextInt();
                                if (referPlay == 1) {
                                    System.out.println("Enter Account Number");
                                    int accountNumber = input.nextInt();
                                    System.out.println("Enter pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 75000 Tshs to utility account PLAY " + accountNumber);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (referPlay == 2) {
                                    System.out.println("Enter Account Number");
                                    int accountNumber = input.nextInt();
                                    System.out.println("Enter pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 135000 Tshs to utility account PLAY " + accountNumber);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (referPlay == 3) {
                                    System.out.println("Enter Account Number");
                                    int accountNumber = input.nextInt();
                                    System.out.println("Enter pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 200000 Tshs to utility account PLAY " + accountNumber);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                } else if (referPlay == 4) {
                                    System.out.println("Enter Account Number");
                                    int accountNumber = input.nextInt();
                                    System.out.println("Enter pin");
                                    pin = input.nextInt();
                                    System.out.println("Hello \nPress 1to confirm or 2 to decline Pay 40000 Tshs to utility account PLAY " + accountNumber);
                                    int subsubSE = input.nextInt();
                                    if (subsubSE == 1) {
                                        System.out.println("YourRequest has been submited");
                                    } else {
                                        System.out.println("Your Request has been canceled");
                                        System.exit(0);
                                    }
                                }

                            }
                        }
                    }
                    default -> {
                        System.out.println("Wrong Selection");
                        System.exit(0);
                    }


                }

            }
            else if(tvChannel==2)
            {
            //startimes
            }
            else if(tvChannel==3)
            {
//                ting

            }
            else if(tvChannel==4)
            {
                //zuku

            }
            else if(tvChannel==5)
            {
//                azam tv
            }
            else if(tvChannel==6)
            {
            // simuka maisha
            }
            else if(tvChannel==7)
            {
//              continetal decoder
            }
            else if(tvChannel==8)
            {
//                milan tv cable

            }


        }
    }
    public void enterbusinessNumber()
    {

    }
    public void governmetnpayment()
    {

    }
    public void mpesavizacard()
    {

    }
    public void gaming()
    {

    }
    public void standingorder()
    {

    }
    public void more()
    {

    }


}
