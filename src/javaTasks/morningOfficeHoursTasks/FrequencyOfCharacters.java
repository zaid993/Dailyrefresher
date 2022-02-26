package javaTasks.morningOfficeHoursTasks;
import java.util.LinkedHashMap;
import java.util.Map;
public class FrequencyOfCharacters {


    public static void main(String[] args) {

        String str = "hello world";
        // {"char":number of usage}
        frequencyTest(str);
    }

    public static void frequencyTest(String str) {

        // Step 1: Create an insertion ordered map structure
        Map<Character,Integer> map=new LinkedHashMap<>();


        //Step 2: iterate each char in char array
        for(Character eachChar: str.toCharArray()){
            // Step 3: check the statement if map contains each char
            if(map.containsKey(eachChar)){
                map.put(eachChar,map.get(eachChar)+1);
            }else{
                map.put(eachChar,1);
            }
        }

        System.out.println(map);

    }
}
