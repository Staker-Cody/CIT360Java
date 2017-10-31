package com.company.appcPattern;

import java.util.HashMap;

public class Controller {

    public static HashMap<String, CheckUser> hashOfUser = new HashMap<String, CheckUser>();

    public static void controller(){




    }

    public static void findUser(String user, String pass){


        hashOfUser.put("Cody", new usercody());


       CheckUser toCheck = hashOfUser.get(user);
       toCheck.calluser(user, pass);

    }


}
