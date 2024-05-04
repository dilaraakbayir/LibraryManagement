package com.dilara.ui;

import com.dilara.controller.UserController;

public class LibraryUi {

    UserController userController;
    public LibraryUi(){
        this.userController = new UserController();
    }
    public void mainMenu(){
        System.out.println("==== LIBRARY MANAGEMENT SYSTEM ===");
        System.out.println("1-Register");
        System.out.println("2-Login");
    }
    public void userMenu(){
        System.out.println("1-Update profile informations");
        System.out.println("2-List books");
        System.out.println("3-Rent a book");
        System.out.println("4-List authors");
    }
    public void startApp(){
        int control;
        do{
            mainMenu();
            control=Utility.getIntValue("Please make a choice");
            switch(control){
                case 1: userController.register();
                    break;
                case 2: userController.login();
                    break;
                case 3:
                    break;
                default:
                    break;
            }
        }while(control!=0);
    }
}
