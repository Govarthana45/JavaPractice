import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String[] names = new String[1];
        int[] ages = new int[1];
        boolean[] isMarriedArray = new boolean[1];
        int index = 0;

        while (true) {
            System.out.print("Enter name (type 'exit' to finish): ");
            String name = scanner.nextLine();
            
            if (name.equalsIgnoreCase("exit")) {
                break;
            }
            
            if (index >= names.length) {
                names = expandArray(names);
                ages = expandArray(ages);
                isMarriedArray = expandArray(isMarriedArray);
            }

            System.out.print("Enter age: ");
            int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
            
            System.out.print("Is married? (true/false): ");
            boolean isMarried = scanner.nextBoolean();
            scanner.nextLine(); // Consume newline character

            names[index] = name;
            ages[index] = age;
            isMarriedArray[index] = isMarried;
            index++;
        }

        System.out.println("\nEntered details:");
        for (int i = 0; i < index; i++) {
            System.out.println("Name: " + names[i] + ", Age: " + ages[i] + ", Is Married: " + isMarriedArray[i]);
        }
    }

    // Function to expand array size
    private static String[] expandArray(String[] array) {
        String[] newArray = new String[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    private static int[] expandArray(int[] array) {
        int[] newArray = new int[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }

    private static boolean[] expandArray(boolean[] array) {
        boolean[] newArray = new boolean[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
}
