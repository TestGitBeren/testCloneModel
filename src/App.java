import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        //TODO Change to hello github
        System.out.println("Hello, World!");
        System.out.println(reverse("abcd").equals("dcba"));
        int[] test = new int[] {5, 2, 8, 7};
        int[] expected = new int[] {2, 5, 7, 8};
        System.out.println(Arrays.equals(test, expected));
    }

    public static String reverse(String input) {
        //TODO write a method to reverse a string
        return input;
    }

    public static int[] sortArray(int[] input) {
        //TODO write a method to sort an array
        return input;
    }
}
