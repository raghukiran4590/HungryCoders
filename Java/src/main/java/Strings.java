package src.main.java;

public class Strings {

    public static void main(String[] args) {

        String s1 = "Hello "; // This string is created in String Pool

//        s1.concat("World"); //This result is ignored as s1 string is immutable

        String s2 = s1.concat("World"); // This string is created in Heap Memory

        String s3 = s1.concat("World").intern(); // This will check the String Pool, Performance Issue

        String s4 = new String("Hello World"); //Creates a new String object in Heap Memory

        String s5 = "Hello World"; //String Pool

        String s6 = "Hello World";

        System.out.println(s4 == s5); //False; String object cannot use == to compare to string literal

        System.out.println(s4.equals(s5)); //True Values are compared

        System.out.println(s5 == s6); //True

        System.out.println(s5.equals(s6)); //True

        System.out.println(s3 == s5);

        System.out.println(s3 == s2);

        System.out.println(s3.equals(s2));

    }
}
