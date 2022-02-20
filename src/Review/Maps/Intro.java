package Review.Maps;

import java.util.HashMap;
import java.util.Map;

public class Intro {

    public static void main(String[] args) {

        Map<String,Integer> employeeMap = new HashMap<>();
        employeeMap.put("Zaid", 200000);
        employeeMap.put("Zaid", 150000);
        employeeMap.put("Ivana", 150000);
        employeeMap.put("Jenna", 150000);

        System.out.println(employeeMap);
        System.out.println("employeeMap.size() = " + employeeMap.size());

        System.out.println("employeeMap.get(\"Zaid\") = " + employeeMap.get("Zaid"));
        System.out.println("employeeMap.size() = " + employeeMap.size());

        employeeMap.remove("Ivana");
        System.out.println("employeeMap Ivana removed = " + employeeMap);


        //so here the Zaid with 200000K was removed so you can get containsKey and containsValue of Zaid 150000
        System.out.println("employeeMap.containsKey(\"Zaid\") = " + employeeMap.containsKey("Zaid"));
        System.out.println("employeeMap.containsValue(150000) = " + employeeMap.containsValue(150000));
        System.out.println("===============================================");
//        employeeMap.clear();
        System.out.println("employeeMap = " + employeeMap);
        System.out.println("employeeMap.isEmpty() = " + employeeMap.isEmpty());
        employeeMap.replace("Zaid",120000);
        System.out.println("employeeMap = " + employeeMap);
        employeeMap.replace("Jenna",employeeMap.get("Jenna")+20000);
        System.out.println("employeeMap = " + employeeMap);
        System.out.println("===============================================");
        System.out.println("===============================================");
        System.out.println("===============================================");

        Map<String,Integer> newMethods = new HashMap<>();
        newMethods.put("Feruza",90000);
        newMethods.put("Mucahit",2200000);
        newMethods.put("Ahmed",1000);
        newMethods.put("Zaid",1000);
        newMethods.put("Nate",1000);
        newMethods.put("Jenna",1000);
        newMethods.put("Ivana",1000);
        System.out.println("newMethods.keySet() = " + newMethods.keySet());


        System.out.println("-------------------------------------------------------");

        //Iteration of keys only use KeySet Like getting the names only
        for (String each : newMethods.keySet()) {
            System.out.println(each+" : "+newMethods.get(each));
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");

        // if you want to get values only use .Values()
        for (Integer eachValue : newMethods.values()) {
            System.out.println("eachValue = " + eachValue);

        }

        // if you want to get the entries meaning the keys and values use entrySet
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");
        for (Map.Entry<String, Integer> eachMember : newMethods.entrySet()) {
//            System.out.println("eachMember = " + eachMember);
            System.out.println(eachMember.getKey()+" : "+ eachMember.getValue());
        }

        System.out.println(newMethods);
        System.out.println("-------------------------------------------------------");
        System.out.println("-------------------------------------------------------");


        // find the max salary

        int Max = Integer.MIN_VALUE;
        String name ="";
        for (Map.Entry<String, Integer> eachEntry : newMethods.entrySet()) {
            String eachName = eachEntry.getKey();
            Integer eachSalary = eachEntry.getValue();
            if (eachSalary>Max){
                Max=eachSalary;
                name =  eachName;
            }
        }
        System.out.println(name);
        System.out.println(Max);

    }








}
