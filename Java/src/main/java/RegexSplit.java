package src.main.java;

import java.util.regex.Pattern;

public class RegexSplit {

/*    Components of Regular Expressions

    Literals: Characters that match themselves. For example, the pattern a matches the string "a".
    Metacharacters: Special characters that represent other characters or groups of characters. Common metacharacters include:

            .: Matches any single character except newline.
            ^: Matches the beginning of a line.
    $: Matches the end of a line.
            *: Matches 0 or more repetitions of the preceding element.
    +: Matches 1 or more repetitions of the preceding element.
    ?: Matches 0 or 1 repetition of the preceding element.
            []: Matches any one of the enclosed characters.
    |: Acts like a boolean OR.
            (): Groups multiple tokens together and remembers the matched text.*/

        public static void main(String[] args) {
            // Define the regular expression pattern
            String regex = "\\s+";
            String txt = " I am Raghu";

            // Compile the pattern
            Pattern pattern = Pattern.compile(regex);

            Pattern.matches(regex, txt);

            // Define a string to be split
            String input = "This  is a   test";

            // Split the string using the compiled pattern
            String[] result = pattern.split(input);

            // Print the result
            for (String part : result) {
                System.out.println(part);
            }
        }
    }
