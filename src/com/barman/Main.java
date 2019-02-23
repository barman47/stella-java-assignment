package com.barman;

public class Main {

    public static void main(String[] args) {

        // Below is a test of the transfer nethod. I'm quite terrible with documentation so you might just have to figure it out by reading the code.

//        BankAccount myAccount = new BankAccount(10000, "Uzoanya Dominic");
//        myAccount.deposit(2000);
//
//        BankAccount stellaAccount = new BankAccount();
//        stellaAccount.setID("Stella Chima");
//
//        myAccount.transfer(10000, stellaAccount);
//        stellaAccount.display();

        // Array of  size 10.
        // Note that even though arrays are zero based, their size isn't.
        Citizen[] citizens = new Citizen[10];
        citizens[0] = new Citizen("Stella", "Chima", new Address(1, "Street 1", 122, "Abuja"));
        citizens[1] = new Citizen("Dominic", "Uzoanya", new Address(2, "Street 2", 2323, "Abuja"));
        citizens[2] = new Citizen("Rita", "Chima", new Address(3, "Street 3", 212, "Abuja"));
        citizens[3] = new Citizen("Obinka", "Ogechi", new Address(4, "Street 4", 1331, "Abuja"));
        citizens[4] = new Citizen("Somto", "Zikora", new Address(5, "Street 5", 565, "Abuja"));
        citizens[5] = new Citizen("Moses", "Abunike", new Address(6, "Street 6", 56443, "Abuja"));
        citizens[6] = new Citizen("Suleiman", "Sani", new Address(7, "Street 7", 4545, "Abuja"));
        citizens[7] = new Citizen("Onyekachi", "Okereke", new Address(8, "Street 8", 1212, "Abuja"));
        citizens[8] = new Citizen("Amarachi", "Obinka", new Address(9, "Street 9", 878, "Abuja"));
        citizens[9] = new Citizen("MaryJane", "Uzoanya", new Address(10, "Street 10", 6767, "Abuja"));

        // for  loop through the array to print the citizens' data
        for (int i = 0; i < citizens.length; i++) {
            citizens[i].display();
        }

        // The code block below is commonly referred to as an enhanced for loop. It basically is doing the same thing with the one above. It's kind of advanced though.
        // You can comment out the first one and uncomment this one to see that there's no difference.
//        for (Citizen citizen: citizens) {
//            citizen.display();
//        }

    }
}
