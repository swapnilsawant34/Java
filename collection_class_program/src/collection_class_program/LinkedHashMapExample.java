package collection_class_program;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LinkedHashMapExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Create a LinkedHashMap to store student records
        Map<Integer, String[]> studentRecords = new LinkedHashMap<>();
        
        // Add 5 student records to the LinkedHashMap
        studentRecords.put(1001, new String[] {"John Smith", "john.smith@example.com", "123-456-7890"});
        studentRecords.put(1002, new String[] {"Jane Doe", "jane.doe@example.com", "456-789-0123"});
        studentRecords.put(1003, new String[] {"Bob Johnson", "bob.johnson@example.com", "789-012-3456"});
        studentRecords.put(1004, new String[] {"Mary Williams", "mary.williams@example.com", "234-567-8901"});
        studentRecords.put(1005, new String[] {"Tom Davis", "tom.davis@example.com", "567-890-1234"});
        
        // Display all the student records
        System.out.println("All student records:");
        for (Map.Entry<Integer, String[]> entry : studentRecords.entrySet()) {
            Integer id = entry.getKey();
            String[] values = entry.getValue();
            System.out.println("ID: " + id + " Name: " + values[0] + " Email: " + values[1] + " Contact: " + values[2]);
        }
        
        // Search for a student record by ID
        System.out.print("Enter a student ID to search: ");
        int searchId = input.nextInt();
        if (studentRecords.containsKey(searchId)) {
            String[] values = studentRecords.get(searchId);
            System.out.println("ID: " + searchId + " Name: " + values[0] + " Email: " + values[1] + " Contact: " + values[2]);
        } else {
            System.out.println("No student record found for ID: " + searchId);
        }
        
        input.close();
    }

}
