
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FindDuplicates {

    public static void main(String[] args) {

        // Create a process to run the Bash script
        ProcessBuilder builder =
                new ProcessBuilder("bash", "FindDuplicates.sh");

        // Combine normal output and error messages
        builder.redirectErrorStream(true);

        try {
            // Start the Bash script
            Process process = builder.start();

            // Read the script's output
            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));

            // Store the output lines in a list
            List<String> results = new ArrayList<>();
            String line;

            // Read, display, and save each line of output
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                results.add(line);
            }

            reader.close();

            // Wait for the script to finish
            int exitCode = process.waitFor();

            // Use a lambda expression to count duplicate matches
            long duplicates = results.stream()
                    .filter(result -> result.startsWith("Duplicate found:"))
                    .count();

            // Display the results
            System.out.println("Total duplicate matches: " + duplicates);
            System.out.println("Script exit code: " + exitCode);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
