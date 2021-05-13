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
class Categories implements MenuChoice {
    public static ArrayList<financeproject.Categories> CategoryList = new ArrayList<>();
    /*

    Show categories, return to Categories menu
    Add: add a new category along with its type (income/expenditure), return to
            Categories menu
    Remove: remove category, make sure that the related transactions are
            marked as Miscellaneous, return to Categories menu
    Modify: modify category, make sure that the modified category is
            reflected in the as well, return to Categories menu
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