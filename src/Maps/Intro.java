package Maps;

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
        newMethods.put("Feruza",1000);
        newMethods.put("Mucahit",1000);
        newMethods.put("Ahmed",1000);
        newMethods.put("Zaid",1000);
        newMethods.put("Nate",1000);
        newMethods.put("Jenna",1000);
        newMethods.put("Ivana",1000);
        System.out.println("newMethods.keySet() = " + newMethods.keySet());


        System.out.println("-------------------------------------------------------");
        for (String each : newMethods.keySet()) {
            System.out.println(each+" : "+newMethods.get(each));
        }


    }








}
