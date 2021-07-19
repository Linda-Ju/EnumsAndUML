package com.company.restaurantMenu;

public class RestaurantMenuDemo {
    public static void main(String[] args) {
        RestaurantMenu newApp = RestaurantMenu.APPETIZER;
        RestaurantMenu newMain = RestaurantMenu.MAIN;
        RestaurantMenu newDes = RestaurantMenu.DESSERT;

        System.out.println("The first dish in " + newApp + " is " + newApp.getFirstDish());
        System.out.println("The first dish in " + newMain + " is " + newMain.getFirstDish());
        System.out.println("The first dish in " + newDes + " is " + newDes.getFirstDish());

    }
}
