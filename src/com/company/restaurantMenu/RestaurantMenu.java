package com.company.restaurantMenu;

public enum RestaurantMenu {
    APPETIZER("Steamed Prawns", "Caffe Latte"),
    MAIN("Continental Rice", "Deep Fried Chicken"),
    DESSERT("Cupcakes", "Ice Cream");

    private final String firstDish;
    private final String secondDish;

    RestaurantMenu(String firstDish, String secondDish) {
        this.firstDish = firstDish;
        this.secondDish = secondDish;
    }

    public String getFirstDish() {
        return firstDish;
    }

    public String getSecondDish() {
        return secondDish;
    }
}
