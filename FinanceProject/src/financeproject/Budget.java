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
public class Budget implements MenuChoice {
    public static ArrayList<financeproject.Budget> budgetList = new ArrayList<>();
    /*

   Show: list all budgets - display their names and start & end dates, return
       to Budgets menu
   Add: ask user for budget details (listed below), add a new budget,
       return to Budgets menu

       name: ask user to enter name, if the name is not unique,
           ask user to re-enter
       start date: ask user to enter start date
       end date: ask user to enter end date
       categories: list all categories which are not already included
           in the budget, and ask user to select one and enter the
           amount; continue adding categories until the user is done
           or there are no more categories to add (each category can be
           used only once)
   Remove: ask user for budget name, remove budget, return to Budgets menu
   Modify: ask user for budget name, modify budget based on user's
           choices (listed below), return to Budgets menu when done
       name: ask user to enter new name, if the new name is not
           unique, ask user to re-enter
       start date: ask user to enter new start date
       end date: ask user to enter new end date
       add categories: list all categories which are not
           already included in the budget, and ask user to select
           one and enter the amount; continue adding categories until the
           user is done or there are no more categories to add
       remove categories: list all categories which are included in the
           budget, ask user to select one and remove it from the budget;
           continue removing categories until the user is done or there are
           no more categories to remove
       done (y/n): y = save modifications & return to Budgets menu,
           n = perform more modifications to this budget
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
