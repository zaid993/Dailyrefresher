package InterviewCodingTasks.notDone;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class String_FrequencyOfCharactersInSortedManner {

    /*
    Return the frequency of each character in the given string in Sorted manner
        Ex:
            Input: DDDAACCCCCCB
            Output: A2B1C6D3
     */

    public String frequencyOfCharacterInSortedManner(String str) {
        TreeMap<String, Integer> map = new TreeMap<>();

        for (String each : str.split("")) {
            if (map.containsKey(each)) {
                map.put(each, map.get(each) + 1);
            } else {
                map.put(each, 1);
            }
        }

        str = "";
        for (Map.Entry<String, Integer> each : map.entrySet()) {
            str += each.getKey() + each.getValue();
        }

        return str;
    }



    public static String sequence(String st){
        Arrays.sort(st.split(""));
        String res = "";

        String removeDups = "";
        for (int i = 0; i < st.length(); i++) {
            if (!removeDups.contains(""+st.charAt(i))) {
                removeDups += st.charAt(i);
            }}


        for (int j = 0; j < removeDups.length(); j++) {
            char ch1 = removeDups.charAt(j);
            int count =0;
            for (int i = 0; i < st.length(); i++) {
                if (st.charAt(i)==ch1){
                    count++;
                }
            }
            res+=""+ch1+count;
        }
        return res;
    }

}
