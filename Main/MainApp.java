package bank.main;

import bank.model.*;
import bank.utils.*;

public class MainApp {

    public static void main(String[] args) {

        System.out.println("=== BANKING SYSTEM DEMO ===\n");

       
        SavingsAccount s1 = new SavingsAccount("Samuel Meseret", 5000, 5.5);
        CurrentAccount c1 = new CurrentAccount("Abel Tesfaye", 3000, 1000);
        FixedDepositAccount f1 = new FixedDepositAccount("John Doe", 10000, 6.5, 12);

        
        System.out.println("---- Savings Account ----");
        s1.display();
        s1.bankPolicy();

        System.out.println("\n---- Current Account ----");
        c1.display();

        System.out.println("\n---- Fixed Deposit Account ----");
        f1.display();

        System.out.println("\n---- Utility Info ----");
        BankUtils.bankInfo();
        AdvancedBankUtils.bankInfo();

        System.out.println("\n---- Security ----");
        Security sec = new Security();
        sec.secureSystem();

        System.out.println("\n---- Implicit super() Demo ----");
        DemoImplicit d = new DemoImplicit();
        d.show();
    }
}


class DemoImplicit extends Account {

    public DemoImplicit() {
        super("Default User", 0);
    }

    public void show() {
        System.out.println("Implicit super() constructor executed.");
    }
}
