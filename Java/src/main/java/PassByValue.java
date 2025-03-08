package src.main.java;

public class PassByValue {

    public static void main(String[] args) {

        int num = 10;

        System.out.println("Before calling modifyValue method, num : "+num);

        modifyValue(num);

        System.out.println("After modifyValue method, num : "+num);

        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Before calling modifyReference method, sb : "+sb);

        modifyReference(sb);

        System.out.println("After modifyReference method, sb : "+sb);

    }

    public static void modifyValue(int num) {
        num += 5;
        System.out.println("Inside modifyValue method, num : "+num);
    }

    public static void modifyReference(StringBuilder sb) {
        sb.append(" World");
        System.out.println("Inside modifyValue method, sb : "+sb);
    }
}
