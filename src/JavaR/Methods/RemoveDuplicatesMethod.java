package JavaR.Methods;

public class RemoveDuplicatesMethod {
    public static void main(String[] args) {
        System.out.println(removeDups("AAABBBCCC"));

        System.out.println("removeEachDups(\"ZZZZAAAIIIIDDD\") = "
                + removeEachDups("ZZZZAAAIIIIDDD"));

        System.out.println("removeEachDups2(\"AAAVVVCCCBBNNN\") = "
                + removeEachDups2("AAAVVVCCCBBNNN"));

    }


//  using for loop and contains method
    public static String removeDups(String str){

        String result = "";

        for (int i = 0; i <= str.length()-1; i++) {
             if (!result.contains(""+str.charAt(i))){
                 result+=str.charAt(i);
             }
        }
        return result;
    }



// using for each loop but you need array
    public static String removeEachDups(String str){
        // split will return array of string
        String res = "";

        for (String each : str.split("")) {
            if (!res.contains(each)){
                res+=each;
            }
        }
        return res;
    }


    //toCharArry and index of when a char is not contained it will return -1
    // using for each loop but you need array
    public static String removeEachDups2(String str){
        String res = "";

        for (char each : str.toCharArray()) {
            if (res.indexOf(each) < 0){
                res+=each;
            }
        }
        return res;

    }


}
