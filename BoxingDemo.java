import java.util.Scanner;

public class BoxingDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // User input for various data types
        System.out.print("Enter an integer: ");
        int intInput = scanner.nextInt();

        System.out.print("Enter a double: ");
        double doubleInput = scanner.nextDouble();

        System.out.print("Enter a character: ");
        char charInput = scanner.next().charAt(0);

        System.out.print("Enter a boolean (true/false): ");
        boolean booleanInput = scanner.nextBoolean();

        System.out.print("Enter a float: ");
        float floatInput = scanner.nextFloat();

        // Manual Boxing
        Integer boxedInt = Integer.valueOf(intInput);
        Double boxedDouble = Double.valueOf(doubleInput);
        Character boxedChar = Character.valueOf(charInput);
        Boolean boxedBoolean = Boolean.valueOf(booleanInput);
        Float boxedFloat = Float.valueOf(floatInput);

        // Manual Unboxing
        int unboxedInt = boxedInt.intValue();
        double unboxedDouble = boxedDouble.doubleValue();
        char unboxedChar = boxedChar.charValue();
        boolean unboxedBoolean = boxedBoolean.booleanValue();
        float unboxedFloat = boxedFloat.floatValue();

        // Autoboxing
        Integer autoBoxedInt = intInput;
        Double autoBoxedDouble = doubleInput;

        // Auto-unboxing
        int autoUnboxedInt = autoBoxedInt;
        double autoUnboxedDouble = autoBoxedDouble;

        // Output
        System.out.println("\n--- Boxing and Unboxing Demo ---");
        System.out.println("Manual Boxing and Unboxing:");
        System.out.printf("Boxed Integer: %-10d | Unboxed: %d%n", boxedInt, unboxedInt);
        System.out.printf("Boxed Double:  %-10.2f | Unboxed: %.2f%n", boxedDouble, unboxedDouble);
        System.out.printf("Boxed Char:    %-10c | Unboxed: %c%n", boxedChar, unboxedChar);
        System.out.printf("Boxed Boolean: %-10b | Unboxed: %b%n", boxedBoolean, unboxedBoolean);
        System.out.printf("Boxed Float:   %-10.2f | Unboxed: %.2f%n", boxedFloat, unboxedFloat);

        System.out.println("\nAutoboxing and Auto-unboxing:");
        System.out.printf("Autoboxed Integer: %-10d | Auto-unboxed: %d%n", autoBoxedInt, autoUnboxedInt);
        System.out.printf("Autoboxed Double:  %-10.2f | Auto-unboxed: %.2f%n", autoBoxedDouble, autoUnboxedDouble);

        scanner.close();
    }
}
