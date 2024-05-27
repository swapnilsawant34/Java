package Practice_Code;
import java.util.*;
class ArrayOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements for the first array: ");
        int size1 = scanner.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of elements for the second array: ");
        int size2 = scanner.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size2; i++) {
            arr2[i] = scanner.nextInt();
        }

        int[] unionArr = findUnion(arr1, arr2);

        System.out.print("Union of the arrays: ");
        printArray(unionArr);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static int[] findUnion(int[] arr1, int[] arr2) {
        int size1 = arr1.length;
        int size2 = arr2.length;

        // Calculate the size of the union array
        int size = size1 + size2;
        for (int i = 0; i < size1; i++) {
            for (int j = 0; j < size2; j++) {
                if (arr1[i] == arr2[j]) {
                    size--;
                    break;
                }
            }
        }

        // Create the union array
        int[] unionArr = new int[size];
        int index = 0;

        // Copy elements from arr1 to unionArr
        for (int i = 0; i < size1; i++) {
            unionArr[index++] = arr1[i];
        }

        // Copy unique elements from arr2 to unionArr
        for (int i = 0; i < size2; i++) {
            boolean found = false;
            for (int j = 0; j < size1; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                unionArr[index++] = arr2[i];
            }
        }

        return unionArr;
    }
}