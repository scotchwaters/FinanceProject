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
public class Transactions implements MenuChoice {
    public static ArrayList<financeproject.Transactions> transactionList = new ArrayList<>();
    /*

    Show: list all transactions based on the user-specified date range,
            return to Transactions menu
    Add: ask user to enter details (listed below), add a new transaction,
            update related account balance, return to Transactions menu

        date: ask user for date
        description: ask user for description
        amount: ask user for amount
        category: list all categories and ask user to select one
        account: list all accounts and ask user to select one
    Remove: ask user to enter transaction id, remove transaction,
            update related account balance, return to Transactions menu
    Modify: ask user to enter transaction id, modify transaction based
            on user's choice (listed below), update related account balance if necessary, return to Transactions menu when done
        modify date: ask user for new date
        modify description: ask user for new description
        modify amount: ask user for new amount
        modify category: list all categories and ask user to select one
        modify account: list all accounts and ask user to select one
        done (y/n): y = save modifications & return to Transactions menu,
            n = perform more modifications to this transaction
    Back: Return to Main menu

    */
    @Override
    public String toString() {
        //return information for the show() method
        return "";
    }

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
            input = financeproject.FinanceProject.parseInnerInput(this);
        }
    }
}
