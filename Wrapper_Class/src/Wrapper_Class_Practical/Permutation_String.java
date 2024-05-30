package Wrapper_Class_Practical;
import java.util.*;

public class Permutation_String {

    public static ArrayList<String> getPermutations(String str) {
         ArrayList<String> permutations = new ArrayList<>();

        if (str.length() == 1) {
            permutations.add(str);
            return permutations;
        }

        for (int i = 0; i < str.length(); i++) {
            char charAtIndex = str.charAt(i);

            String remainingString = str.substring(0, i) + str.substring(i + 1);

            ArrayList<String> remainingPermutations = getPermutations(remainingString);

            for (String perm : remainingPermutations) {
                permutations.add(charAtIndex + perm);
            }
        }

        return permutations;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        ArrayList<String> permutations = getPermutations(inputString);
        System.out.println("Permutations of the input string:");
        for (String perm : permutations) {
            System.out.println(perm);
        }
        scanner.close();
    }
}
