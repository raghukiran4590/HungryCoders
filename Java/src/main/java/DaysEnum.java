package src.main.java;

public class DaysEnum {

//    Defining an enum called DayOfWeek
    enum DayOfWeek {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
        public static void main(String[] args) {
            // Using enum constants
            DayOfWeek today = DayOfWeek.MONDAY;
            DayOfWeek tomorrow = DayOfWeek.FRIDAY; // Cannot be assigned to any other data type other than Enum type
            System.out.println("Today is: " + today);

            // Switch statement with enum
            switch (tomorrow) {
                case MONDAY:
                    System.out.println("It's the start of the week.");
                    break;
                case FRIDAY:
                    System.out.println("TGIF!");
                    break;
                case SATURDAY:
                    System.out.println("It is the weekend");
                    break;
                default:
                    System.out.println("Just another day.");
                
            }

            // Iterating over enum constants
            System.out.println("Days of the week:");
            for (DayOfWeek day : DayOfWeek.values()) {
                System.out.println(day);
            }
        }
    }
