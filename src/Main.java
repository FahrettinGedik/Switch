import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int value;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        value = scanner.nextInt();
        System.out.println("Enter an integer: ");
        if (value == 1) {
            System.out.println("Value is 1");
        } else if (value == 2) {
            System.out.println("Value is 2");
        } else {
            System.out.println("Value is not 1 or 2");
        }

        int switchValue;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        switchValue = scanner1.nextInt();
        System.out.println("Enter an integer: ");
        switch (switchValue) {
            case 1 -> System.out.println("Value is 1");
            case 2 -> System.out.println("Value is 2");
            case 3, 4, 5, 6, 7, 8, 9 -> {
                System.out.println("Value is 3, 4 or 5, 6 or 7, 8 or 9");
                System.out.println("Actually Value is " + switchValue);
            }
            default -> System.out.println("Value is not 1, 2, 3, 4, 5, 6, 7, 8, 9");
        }
        // More code here
        String month;
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter an string as a month: ");
        month = scanner2.next();
        System.out.println("Enter an string: ");
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        String monthOfSeason;
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Enter an string as a month of season: ");
        monthOfSeason = scanner3.next();
        System.out.println("Enter an string: ");
        System.out.println(monthOfSeason + " is in the " + getSeason(monthOfSeason) + " season");

    }

    public static String getQuarter(String month) {
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "bad";
        };
    }


    public static String getSeason(String monthOfSeason) {
        return switch (monthOfSeason) {
            case  "December", "January", "February" -> {
                yield "Winter";
            }
            case  "March", "April", "May" -> "Spring";
            case "June", "July", "August" -> "Summer";
            case "September", "October", "November" -> "autumn";
            default -> {
                String badResponse = monthOfSeason + " not a valid month of";
                yield badResponse;
            }
        };
    }
}
