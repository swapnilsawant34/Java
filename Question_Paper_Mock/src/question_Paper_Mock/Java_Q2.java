package question_Paper_Mock;
import java.util.*;


public class Java_Q2 {
    public static void main(String[] args) {
        Map<Integer, String> studentMap = new LinkedHashMap<>();
        Scanner xyz = new Scanner(System.in);

        // Adding student data to the map
        studentMap.put(1, "ABC");
        studentMap.put(2, "MNO");
        studentMap.put(3, "PQR");
        studentMap.put(4, "BBB");

        // Searching for a student record by ID
        System.out.print("Enter student id to search: ");   //take student id from user.
        int id = xyz.nextInt();

        if (studentMap.containsKey(id)) {   //check the id is present or not. using contains method.
            String name = studentMap.get(id);
            System.out.println("Student record found");
            System.out.println("Student name: " + name);
        } else {
            System.out.println("Student record not found with id: " + id);
        }
    }
}

