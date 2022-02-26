package javaTasks.morningOfficeHoursTasks;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
public class MapSortByValues {


    /*
        Write a method that can sort the map by values
     */

    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();
        map.put("John",19);
        map.put("Steve",34);
        map.put("Anne",21);
        map.put("April",31);
        System.out.println(sortByValue(map));
    }

    public static Map<String, Integer> sortByValue(Map<String, Integer> map) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue());

        map = new LinkedHashMap<>();

        for (Map.Entry<String, Integer> each : list) {
            map.put(each.getKey(), each.getValue());
        }

        return map;

    }
}
