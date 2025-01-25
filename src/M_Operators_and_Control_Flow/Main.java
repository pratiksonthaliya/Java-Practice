package M_Operators_and_Control_Flow;

public class Main {
    public static void main(String[] args) {
        // Operators
        System.out.println("Operators: ");

        System.out.println("Signed Right Shift: '>>'");
        System.out.println("  8 >> 1   -> " + (8 >> 1));
        System.out.println(" -8 >> 1   -> " + (-8 >> 1));

        System.out.println("Unsigned Right Shift: '>>>'");
        System.out.println("  8 >>> 1  -> " + (8 >>> 1));
        System.out.println(" -8 >>> 1  -> " + (-8 >>> 1));

        System.out.println("Left Shift: '<<'");
        System.out.println("  8 << 1   -> " + (8 << 1));

        String val = "hello";
        System.out.println(val instanceof String); // Also for Objects of subClass


        // Control Flow
        System.out.println("Control Flow: ");
        // if, if-else, if-elseif, nested if  => skipped
        // for, while, do-while, for-each => skipped
        // break, continue => skipped

        // Switch:

        int a = 3;
        int b = 5;
        switch (a + b) {
            case 3:
                System.out.println(3);
                break;
            case 5:
                System.out.println(5);
                break;
            case 8:
                System.out.println(8);
                break;
            default:
                System.out.println(a+b);
        }

        // Enhanced Switch
        final int c = 7; // only constants/literals can be used as case
        switch (a + b) {
            case 3 -> System.out.println(3);
            case 5 -> System.out.println(5);
            case 8 -> System.out.println(8);
            case c -> System.out.println(c);
            default -> System.out.println(a+b);
        }

        String day = "";
        int value = 1;
        day = switch (value) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            default -> "Anyday";
        };

        String day2 = "";
        int value2 = 2;
        day = switch (value2) {
            case 1 -> "Monday";
            case 2 -> {
                System.out.println("Tuesday");
                yield "Tuesday";
            }
            default -> "Anyday";
        };


    }
}
