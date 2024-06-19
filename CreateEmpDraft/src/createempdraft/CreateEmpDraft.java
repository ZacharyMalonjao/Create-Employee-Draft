package createempdraft;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import java.util.Scanner;

public class CreateEmpDraft {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String csvFile = "MotorPH.csv";

            // 1. Make Reader object
            CSVReader reader = new CSVReader(new FileReader(csvFile));
            List<String[]> records = reader.readAll();

            // Print existing records
//            for (String[] record : records) {
//                for (String field : record) {
//                    System.out.print(field + " ");
//                }
//                System.out.println();
//            }
            
            // Close reader
            reader.close();
            
            System.out.println("Insert ID: ");
            String ID= sc.next();
            

        
          
            System.out.println("Last Name: ");
            String lastName = sc.next();
            System.out.println("Insert first name");
            String firstName = sc.next();

            // 2. Add a new row
            String[] newRow = {ID, lastName, firstName};
            records.add(newRow);

            // 3. Make Writer object and write all records
            CSVWriter writer = new CSVWriter(new FileWriter(csvFile));

            // Write all records
            writer.writeAll(records);

            // Close writer
            writer.close();

            // Confirm the addition
            System.out.println("\nNew row added successfully!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    
    
    
    
}
