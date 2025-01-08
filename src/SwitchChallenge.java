public class SwitchChallenge {

    public static void main(String[] args) {
        // NATO phonetic alphabet
        char charValue = 'x';
        switch (charValue) {
            case 'A':
                System.out.println("A is ABLE");
                break;
            case 'B':
                System.out.println("B is BAKER");
                break;
            case 'C':
                System.out.println("C is CHARLIE");
                break;
            case 'D':
                System.out.println("D is DOG");
                break;
            case 'E':
                System.out.println("E is EASY");
                break;
            default:
                System.out.println("Letter " + charValue + " is not supported");
                break;


        }

    }
}
