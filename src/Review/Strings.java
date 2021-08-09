package Review;

public class Strings {
    public static void main(String[] args) {

        String str = "JAVA";

        char ch = str.charAt(2);
        System.out.println(ch);

        String st2= ""+ch;
        System.out.println(st2);


        String str2= "Nathane";
        int n =str2.length();
        System.out.println(n);


        String st3 = str.concat(" ").concat(str2);//Addition
        System.out.println(st3);


       str= str.toLowerCase();
        System.out.println(str);
        str=str.toUpperCase();
        System.out.println(str);

        String sent= "  I love Java  ";
        sent=sent.trim();
        System.out.println(sent);

        String sent1=sent.substring(2,6);
        System.out.println(sent1);

        String sent2 =  sent.substring(7);
        System.out.println(sent2);
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");
        System.out.println("--------------------------------------");


        String w = "Sun is bright, I love sun, sun is sun";
                w=w.toLowerCase();
                String neww= w.replaceFirst("sun","moon");
                System.out.println(neww);
        String w2= w.replace("sun","moon");
        System.out.println(w2);

        int value= w.indexOf("s");
        System.out.println(value);
        int v2 = w.lastIndexOf("sun,");
        System.out.println(v2);
        int v3 = w.lastIndexOf("sun is sun");
        System.out.println(v3);
        System.out.println(w.isEmpty());
        System.out.println("---------------------------------------");

        String r = "                   ";
        r=r.trim();
        System.out.println(r);
        System.out.println(r.isEmpty());
        System.out.println("---------------------------------------");

        String a = "Java";
        String b = "JAva";
        if (a.equalsIgnoreCase(b)){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");
        System.out.println("---------------------------------------");

        String morning = "My morning starts at 2 pm";
        boolean c = morning.toLowerCase().contains("g");
        System.out.println(c);

        boolean t = morning.startsWith("M");
        System.out.println(t);

        int ind = morning.indexOf("s");
        System.out.println(ind);

        int lastind = morning.lastIndexOf("s");
        System.out.println(lastind);
        String stars = morning.substring(11,17);
        System.out.println(stars);
        boolean y = stars.contains("r");
        System.out.println(y);
        boolean o = stars.startsWith("s");
        boolean z = stars.endsWith("s");
        System.out.println(o);
        System.out.println(z);

    }
}
