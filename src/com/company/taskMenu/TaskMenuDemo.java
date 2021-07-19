package com.company.taskMenu;

import com.company.taskMenu.TaskMenu;

public class TaskMenuDemo {

    public static void main(String[] args) {
// Enums - constants
        TaskMenu newFile = TaskMenu.FILE;
        TaskMenu newEdit = TaskMenu.EDIT;
        TaskMenu newView = TaskMenu.VIEW;
        System.out.println("The first item of " + newFile + " is " + newFile.getFirstItem());
        System.out.println("The first item of " + newEdit + " is " + newFile.getFirstItem());
        System.out.println("The first item of " + newView + " is " + newFile.getFirstItem());
    }

}
