/*
 * 5. CamelCase Pattern Matching

Input: arr[] = [ “WelcomeGeek”, “WelcomeToGeeksForGeeks”, “GeeksForGeeks” ], pattern = “WTG” 
Output: WelcomeToGeeksForGeeks 
Explanation: 
There is only one abbreviation for the given pattern i.e., WelcomeToGeeksForGeeks.

Input: arr[] = [ “Hi”, “Hello”, “HelloWorld”, “HiTech”, “HiGeek”, “HiTechWorld”, “HiTechCity”, “HiTechLab” ], pattern = “HA” 
Output: No match found 
Explanation: 
There is no such abbreviation for the given pattern.

 */
package hashMap.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CamelCasePatternMatching {

    // Function to check if the CamelCase pattern matches the string
    public static List<String> findMatchingPatterns(String[] arr, String pattern) {
        List<String> result = new ArrayList<>();

        for (String word : arr) {
            String camelCasePattern = extractUpperCase(word);
            if (camelCasePattern.equals(pattern)) {
                result.add(word);
            }
        }
        return result;
    }

    // Helper function to extract uppercase characters (CamelCase pattern) from a word
    public static String extractUpperCase(String word) {
        StringBuilder sb = new StringBuilder();
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of words: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume the leftover newline

        String[] arr = new String[n];
        System.out.println("Enter the words: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }

        System.out.println("Enter the CamelCase pattern to match: ");
        String pattern = sc.nextLine();

        List<String> matchingWords = findMatchingPatterns(arr, pattern);

        if (matchingWords.isEmpty()) {
            System.out.println("No match found");
        } else {
            for (String word : matchingWords) {
                System.out.println(word);
            }
        }
    }
}
