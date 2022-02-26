package javaTasks.morningOfficeHoursTasks.javaReviews;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class MapReview {


    /*
     * A map is a container object that stores a collection of key/value pairs(Entry)
     * It enables fast retrieval, deletion, and updating of the pair through the key.
     * A map stores the values along with the keys.
     * The keys are like indexes.
     * In List, the indexes are integers.
     * In Map, the keys can be any objects.
     * A map cannot contain duplicate keys.Keys are unique
     * Each key maps to one value.Values can be duplicate
     *
     * HashMap >> not insertion ordered
     *
     * LinkedHashMap >> insertion ordered
     *
     * TreeMap >> sorted
     *
     * map.put(K key, V value)
     * map.remove(Object key)
     * map.keySet()
     * map.containsKey(Object key)
     * map.containsValue(Object value)
     * map.isEmpty()
     * map.size()
     */

    public static void main(String[] args) {

        // Create a HashMap object called capitalCities
        Map<String,String> capitalCities = new TreeMap<String,String>();

        // Add keys and values (Country, City)
        capitalCities.put("England","London");
        capitalCities.put("Mongolia", "Ulaanbaatar");
        capitalCities.put("Turkey","Ankara");
        capitalCities.put("India","Delhi");
        System.out.println(capitalCities);

        //Access a value get(key)
        System.out.println(capitalCities.get("England"));

        //Remove a value remove(key)
        capitalCities.remove("England");
        System.out.println(capitalCities);

        //size()
        System.out.println(capitalCities.size());

        // Print keys keySet()
        for(String i:capitalCities.keySet()){
            System.out.println(i);
        }


        // Print keys and values
        for(String i: capitalCities.keySet()){
            System.out.println("key: " + i + " value: " + capitalCities.get(i));

        }

        //clear()
        capitalCities.clear();
        System.out.println(capitalCities);


        // Create a HashMap object called people
        Map<String,Integer> people =new HashMap<String,Integer>();

        // Add keys and values (Name, Age)
        people.put("John",35);
        people.put("Mary",30);
        people.put("Steve",26);


        //Print All name and age
        for(String i:people.keySet()){
            System.out.println("name: "+i+" age: "+ people.get(i));
        }

    }
}
