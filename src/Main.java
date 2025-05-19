import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/input.txt");

        int totalWords = 0;

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine().trim();
                if (!line.isEmpty()) {
                    String[] words = line.split("\\s+"); // Sépare par espaces multiples
                    totalWords += words.length;
                }
            }

            System.out.println("Nombre total de mots dans le fichier : " + totalWords);
        } catch (FileNotFoundException e) {
            System.out.println("Fichier non trouvé : " + file.getName());
            e.printStackTrace();
        }
    }
}
