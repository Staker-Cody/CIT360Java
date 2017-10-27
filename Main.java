package com.company;
import java.util.*;



public class Main {

    public static void main(String[] args) {

     /*Example List*/
        String[] coolPeople = {"Emily", "Owen", "Adam", "Matthew"};
        String[] notCool = {"Adam", "Matthew"};
        List<String> list1 = new ArrayList<String>();


        for (String i : coolPeople) {
            // .add gives us the ability to add to the list

            list1.add(i);
            for (String x : notCool) {
               // .remove removes things from a list.
                list1.remove(x);

            }


        }
        System.out.println(list1.get(1));
        System.out.println(list1);

 /* Example Set*/
        int count[] = {34, 22, 10, 60, 30, 22};
        Set<Integer> set = new HashSet<Integer>();
        try {
            for (int y = 0; y < 5; y++) {
                set.add(count[y]);
            }
            System.out.println(set);

            TreeSet sortedSet = new TreeSet<Integer>(set);
            System.out.println("The sorted list is:");
            System.out.println(sortedSet);

            System.out.println("The First element of the set is: " + (Integer) sortedSet.first());
            System.out.println("The last element of the set is: " + (Integer) sortedSet.last());
        } catch (Exception e) {


        }


   /*Example Map*/
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");

        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);



        /*Example Tree*/

        // Create a hash map
        TreeMap tm = new TreeMap();

        // Put elements to the map
        tm.put("Zara", new Double(3434.34));
        tm.put("Mahnaz", new Double(123.22));
        tm.put("Ayan", new Double(1378.00));
        tm.put("Daisy", new Double(99.22));
        tm.put("Qadir", new Double(-19.08));

        // Get a set of the entries
        Set aSet = tm.entrySet();

        // Get an iterator
        Iterator i = aSet.iterator();

        // Display elements
        while (i.hasNext()) {
            Map.Entry me = (Map.Entry) i.next();
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        // Deposit 1000 into Zara's account
        double balance = ((Double) tm.get("Zara")).doubleValue();
        tm.put("Zara", new Double(balance + 1000));
        System.out.println("Zara's new balance: " + tm.get("Zara"));
    }


}











        /*Example Queue*/




