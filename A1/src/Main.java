import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        //Ausflug List
        List<Ausflug> items = new ArrayList<>();

        //read from file
        try (Scanner scanner = new Scanner(new File("A1/src/ausfluge.txt"))) {
            while (scanner.hasNextLine()) {
                //get each Line from file to String
                String scannerString = scanner.nextLine();

                //split line by delimiter
                String[] attributes = scannerString.split("&&");

                //get values for Ausflug
                int id = Integer.parseInt(attributes[0]);
                String reiseZiel = attributes[1];
                int preisPerson = Integer.parseInt(attributes[2]);
                int maxAnzahl = Integer.parseInt(attributes[3]);
                int anzahl = Integer.parseInt(attributes[4]);

                //set values to Ausflug
                Ausflug ausflug = new Ausflug(id, reiseZiel, preisPerson, maxAnzahl, anzahl);

                //add Ausflug to list
                items.add(ausflug);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //items.stream().sort();

        //write to ausflugesortiert.txt
        File sortFile = new File("A1/src/ausflugesortiert.txt");
        sortFile.createNewFile();
        FileWriter fileWriter = new FileWriter("A1/src/ausflugesortiert.txt");
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for(Ausflug item: items){
            printWriter.print(item + "\n");
        }
        printWriter.close();
        fileWriter.close();

        //write to statistik.txt
        File statistikFile = new File("A1/src/ausflugesortiert.txt");
        statistikFile.createNewFile();
        fileWriter = new FileWriter("A1/src/ausflugesortiert.txt");
        printWriter = new PrintWriter(fileWriter);
        for(Ausflug item: items){
            printWriter.print(item + "\n");
        }
        printWriter.close();
        fileWriter.close();
    }
}
