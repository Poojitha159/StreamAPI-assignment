package com.techlabs.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class NameProcessor {

	public static void main(String[] args) {
		try {
            // Step 1: Read names from the provided text file (names.txt) and store them in a List of Strings
            List<String> names = Files.readAllLines(Paths.get("C:\\Users\\ChHarshini\\eclipse-workspace\\M-NmaesProccesor\\src\\com\\techlabs\\test\\names.txt"));
            names.stream().forEach((name)->System.out.println(names));
            System.out.println("");
            
            // Step 2: Filter the names to include only those that start with a specific letter (e.g., 'A')
            System.out.println("2. Names start with A -->");
            List<String> filteredNames = names.stream()
                    .filter(name -> name.startsWith("A"))
                    .collect(Collectors.toList());
           // System.out.println(filteredNames);
            filteredNames.stream().forEach((name)->System.out.println(name));
            System.out.println("");
            
            // Step 3: Convert all names to uppercase
            System.out.println(" 3. Convetring into uppercase --> ");
            List<String> upperCaseNames = filteredNames.stream()
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());
            
            upperCaseNames.stream().forEach((name)->System.out.println(name));
            System.out.println("");

            // Step 4: Sort the names alphabetically
            
          
            List<String> sortedNames = names.stream()
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println(" 4.Sorted names are : ");

            sortedNames.stream().forEach((name)->System.out.println(name));
            System.out.println("");


            // Step 5: Remove duplicate names from the list
            List<String> uniqueNames = sortedNames.stream()
                    .distinct()
                    .collect(Collectors.toList());
            
            System.out.println(" 5 Removing duplicate : ");
            uniqueNames.stream().forEach((name)->System.out.println(name));

            
            System.out.println("");

            // Step 6: Collect the names into a new list (already done in previous steps)

            // Step 7: Count the number of names that satisfy a certain condition - names that do not contain 'i'
            long count = uniqueNames.stream()
                    .filter(name -> !name.contains("I"))
                    .count();
            System.out.println("Count of names without 'I': " + count);
            System.out.println("");

            // Step 8: Concatenate all the names into a single string separated by commas
            
            System.out.println(" combining all by , ");
            String concatenatedNames = String.join(", ", uniqueNames);
            System.out.println("Concatenated names: " + concatenatedNames);

            System.out.println("");
            // Step 9: Filter names that start with 'J', convert them to uppercase, sort them, and then collect them into a list
            
            System.out.println(" names start wityh J  uppercase, sort them, and then collect them into a list ");
            List<String> jNames = names.stream()
                    .filter(name -> name.startsWith("J"))
                    .map(String::toUpperCase)
                    .sorted()
                    .collect(Collectors.toList());
            System.out.println("Filtered J names: " + jNames);
        } catch (IOException e) {
            e.printStackTrace();
        }	}

}
