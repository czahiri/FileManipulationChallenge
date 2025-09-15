import java.io.*;

public class FileHandlingActivity {
    public static void main(String[] args) throws IOException {
        // Your code here
        // a. Create main directory
        File main = new File("JavaFileSystem");
        main.mkdir();
        // b. Create three text files
        File file = new File("notes.txt");
        file.createNewFile();
        File file2 = new File("data.txt");
        file2.createNewFile();
        File file3 = new File("log.txt");
        file3.createNewFile();
        // c. Write messages to files
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write("Data for notes file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2))) {
            bufferedWriter.write("Data for data file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file3))) {
            bufferedWriter.write("Data for log file");
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
        File backupDir = new File("Backup");
        backupDir.mkdir();
        // f. Copy contents to backup file
        File backupFile = new File("backup.txt");
        backupFile.createNewFile();
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
                BufferedWriter writer = new BufferedWriter(new FileWriter(backupFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file2));
                BufferedWriter writer = new BufferedWriter(new FileWriter(backupFile, true))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file3));
                BufferedWriter writer = new BufferedWriter(new FileWriter(backupFile, true))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // g. List all files in both directories
        System.out.println("Files in main directory:");
        String[] mainFiles = main.list();
        if (mainFiles != null) {
            for (String f : mainFiles) {
                System.out.println(f);
    }
}        System.out.println("Files in backup directory:");
        String[] backupFiles = backupDir.list();
        if (backupFiles != null) {
            for (String f : backupFiles) {
                System.out.println(f);
            }
        }
    }
}