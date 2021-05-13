/*
    Joseph Kelly
    285 Personal Finance Final Project

        80% of the score is based on correctness. Points will be 
            deducted for not satisfying the requirements.
        20% of the score is based on how object-oriented your design is.

        Build a command line application for personal finance system
        discussed in class. Use enumerated menus like the ones shown below 
        and perform the suitable actions based on the user's choice.
*/
package financeproject;

/*

    Example output of the app:

========== Main menu =========
1. Accounts
2. Budgets
3. Transactions
4. Categories
5. Status
6. Exit
Enter your choice: (user enters 3)

1. Show
2. Add
3. Remove
4. Modify
5. Back
Enter your choice: (user enters 2)

Date: (user enters 1/1/2020)
Description: (user enters Whole foods)
Amount: (user enters 100)
Categories:
  1. Rent
  2. Electricity
  3. Groceries
  Enter your choice: (user enters 3)
Accounts:
  1. cash
  2. chase freedom
  3. chase checking
  4. amex
  Enter your choice: (user enters 4)
Successfully added new transaction.  
  


    
    You program should display a menu in an infinite loop until the 
    user chooses to exit. Menu options may be nested - each option may
    reveal other options inside it. The menu structure and the associated
    actions is shown below.
*/

import java.util.Scanner;

// need interface that acts as menu for user.
public class FinanceProject {
    public static Scanner inputReader = new Scanner(System.in);
    enum MenuOptions {
        Accounts(new Accounts()), Budgets(new Budget()), Transactions(new Transactions()), Categories(new Categories()), Status(new Status()), Exit(null);
        public MenuChoice menuChoice;
        MenuOptions(financeproject.MenuChoice mc) {
            menuChoice = mc;
        }
    }
    enum InnerMenuOptions {Show, Add, Remove, Modify, Back}
    public static void main(String[] args) {

        int input = 0;

        while (input != 6) {
            System.out.println("========== Main menu =========");
            int counter = 1;
            for (FinanceProject.MenuOptions mo : FinanceProject.MenuOptions.values()) {
                System.out.println(counter + ". " + mo);
                counter++;
            }
            try {
                input = Integer.parseInt(inputReader.nextLine());
                if (input < 1 || input > 6) {
                    throw new NumberFormatException();
                }
                parseInput(FinanceProject.MenuOptions.values()[input - 1]);
            } catch(NumberFormatException nfe) {
                //invalid input
                System.out.println("Invalid Input! Please try again");
            }

        }
    }
    public static void parseInput(FinanceProject.MenuOptions mo) {
        if (mo != FinanceProject.MenuOptions.Exit) {
            mo.menuChoice.handleUser();
        }
    }
    public static int parseInnerInput(financeproject.MenuChoice mc) {//Shows inner input and returns value after handling the appropriate action
        int counter = 1;
        for (FinanceProject.InnerMenuOptions mo : FinanceProject.InnerMenuOptions.values()) {
            System.out.println(counter + ". " + mo);
            counter++;
        }
        try {
            int input = Integer.parseInt(FinanceProject.inputReader.nextLine());
            if (input < 1 || input > 5) {
                throw new NumberFormatException();
            }
            switch (input) {
                case 1:
                    mc.Show();
                    break;
                case 2:
                    mc.Add();
                    break;
                case 3:
                    mc.Remove();
                    break;
                case 4:
                    mc.Modify();
                    break;
                //no need for case 5, will simply end the while loop that calls this method
            }
            return input;
        } catch(NumberFormatException nfe) {
            //invalid input
            System.out.println("Invalid Input! Please try again");
            return 0;
        }
    }

}



