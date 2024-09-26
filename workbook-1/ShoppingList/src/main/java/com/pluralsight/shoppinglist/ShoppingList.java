package com.pluralsight.shoppinglist;

public class ShoppingList {

    public static void main(String[] args) {
        //// Create an array with 10 shopping items
        String[] shoppingItems ={
           "Chair","Desktop screen", "Mouse XP3", "Headset", "Portable Hard drive",
           "CPU","Speakers", "Notepad", "Portable Screen","USB external port"
        };

        //Print the shopping list
        System.out.println("Shopping List:");
        for (String item: shoppingItems){
            System.out.println("- "+ item);
        }
    }
}
