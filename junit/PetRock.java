package com.company.junit;

public class PetRock {
    private String name;
    private boolean happy = false;
    private String[] toys = {"Legos","Rubber Duck","Knex" };
    private String[] moreToys = {"Legos","Rubber Duck","Knex" };
    private String nullString = null;


    public PetRock(String name) {
        this.name = name;

    }
    public String[] getToys() {
        return toys;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



   public boolean isHappy(){
        return happy;

   }

    public void playWithRock() {
       happy = true;
    }

    public String[] getMoreToys() {
        return moreToys;
    }

    public String getNullString() {
        return nullString;
    }
}
