package StringReplits;

public class UniqueElements {
    public static void main(String[] args) {
        String[] names = {"Zaid","Zad","ai","Zd","id","Zid","Zad","Zid","Zi","Zad"};


        for (String each : names){
            int count = 0;
            if (names.equals(each)){
                count++;
            }
            System.out.println(count);
            if (count==1){
                System.out.println(each);
        }

}
    }
}
