package com.company.MVC;

public class Controller {
    Model userData = new Model();

    public String fUser(String id){
        Object user;
        String auser;

        user = userData.allUsers(id);
        auser = user.toString();





        return auser;


    }





}
