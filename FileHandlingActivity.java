import java.io.*;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {
        // Your code here
        // a. Create main directory
        File main = new File("/Users/cyruszahiri/Desktop/HTCS_Projects/FileManipulationChallenge");
        main.mkdir();
        // b. Create three text files
        File file = new File("myfile.txt");
        file.createNewFile();
        File file2 = new File("myfile2.txt");
        file2.createNewFile();
        File file3 = new File("myfile3.txt");
        file3.createNewFile();
        // c. Write messages to files
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Data for file 1");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            bufferedWriter.write("Data for file 2");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file3))) {
            bufferedWriter.write("Data for file 3");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // d. Read and display file contents
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file2))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file3))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        // e. Create backup directory
        
        // f. Copy contents to backup file
        
        // g. List all files in both directories
    }
}