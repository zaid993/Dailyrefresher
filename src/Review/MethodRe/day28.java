package Review.MethodRe;

public class day28 {


    public static void name5times(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("zaid");
        }
    }

    public static void sum (int n1, int n2, int n3){
        int sum = n1+n2+n3;
        System.out.println("sum = " + sum);
    }

    public static void odds(int from, int to){
        for (int i = from; i <=to ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void evens(int from, int to){
        for (int i = from; i <=to ; i++) {
            if (i%2==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void age(int currentyear, int birthyear){
        int age = currentyear-birthyear;
        System.out.println("age = " + age);
    }

    public static void vote(boolean usenationality, int birthyear){
        if (usenationality&&birthyear>=18){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not");
        }

    }


    public static void main(String[] args) {
        name5times();
        System.out.println("muh");

        sum(2,3,4);

        odds(1,100);
        evens(1,100);
        age(2021,1993);
        vote(true,18);
    }


}
