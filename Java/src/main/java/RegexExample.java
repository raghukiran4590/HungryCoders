package src.main.java;
import java.util.regex.*;

public class RegexExample {

    public static void main(String[] args) {

        String regex = "\\bcat\\b";

        //Compile the pattern into an object
        Pattern pattern = Pattern.compile(regex);

        String input = "The cat sat on the mat.";

        //Create a matcher for the input string
        Matcher matcher = pattern.matcher(input);

        //check if the pattern matches
        boolean found = matcher.find();

        if (found)
            System.out.println("Match found");
        else
            System.out.println("Match not found");


        //Print all matches
        matcher.reset();
        while(matcher.find()) {
            System.out.println("Match Found : "+matcher.find());
        }
    }
}
