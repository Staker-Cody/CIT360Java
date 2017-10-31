package com.company.appcPattern;

import java.util.Scanner;


public class Application {

    public static void main(String[] args) {
        Controller userInter = new Controller();
        String username;
        String password;

        Scanner input = new Scanner(System.in);

        System.out.println("Please input your Username");
        username = input.next();
        System.out.println("Please input your Password");
        password = input.next();


        userInter.findUser(username,password);

    }

}
