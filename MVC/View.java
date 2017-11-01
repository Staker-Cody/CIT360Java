package com.company.MVC;



import java.util.Scanner;

public class View {

    public static void main(String[] args) {
        String id ;
        String returnedUser;

        Controller getUser = new Controller();

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome please input your user ID");
        id = input.next();

        returnedUser = getUser.fUser(id);

        System.out.println(returnedUser);






    }

}
