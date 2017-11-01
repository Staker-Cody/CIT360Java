package com.company.MVC;

import java.util.HashMap;

public class Model {
  public static HashMap users =  new HashMap();


    public Object allUsers(String id) {
         Object fUser;



        users.put("15204","Cody");
        users.put("98239","Owen");
        users.put("83442","Emily");

        fUser = users.get(id);

        return fUser;





    }

}
