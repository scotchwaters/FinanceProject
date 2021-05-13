/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package financeproject;

import java.util.ArrayList;

/**
 *
 * @author nightlinux
 */
public class Accounts implements MenuChoice {
    public static ArrayList<Accounts> accountList = new ArrayList<>();
    //parent class to Cash, Credit, and Debit classes


    //needs inheritable methods that can be overridden by subclasses


    // default show method that is inherited and overridden

    @Override
    public void Show() {

    }

    @Override
    public void Add() {

    }

    @Override
    public void Remove() {

    }

    @Override
    public void Modify() {

    }

    @Override
    public void handleUser() {
        int input = 0;
        while (input != 5) {
            input = FinanceProject.parseInnerInput(this);
        }
    }
    //
}

// BACK interface that returns to current menu.

class Cash extends Accounts {
    //needs show method that displays cash on hand. return to cash menu


    // modify method that asks user for new cash amount. return to cash menu


    // back method to return to Account menu
    @Override
    public String toString() {
        //return information for the show() method
        return "";
    }
}

class Credit extends Accounts {
    //needs show method that lists credit cars and their debts. returns to the
    //      Cash menu


    // needs add method that asks user to enter credit card name (must be
    //      a unique card)
    //
    @Override
    public String toString() {
        //return information for the show() method
        return "";
    }
}

class Debit extends Accounts {
    // needs show method that displays list of bank accounts and
    //      their balances. return to Debit menu.


    // add method: ask user to enter bank account name (ensure its unique)
    //      and balance; add account and return to Debit menu


// Remove method enumerate the list of bank accounts,
    // ask user to select one, and remove it. remove all associated
    //      transactions. return to Debit menu


    // Modify method  enumerate the list of bank accounts,
    //      ask user to select one, modify it based on user's
    //      choices (listed below); return to Debit menu when done


    // ** various necessities for class **
        /*
            name: ask user to enter new name
            balance: ask user to enter new balance
            done (y/n): y = save modifications & return
                to Debit menu, n = perform more modifications
                to this bank account
    */

    // Back method that returns to the Accounts menu
    @Override
    public String toString() {
        //return information for the show() method
        return "";
    }

}
