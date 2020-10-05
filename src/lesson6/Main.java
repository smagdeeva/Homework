package lesson6;


import java.io.*;
import java.util.Scanner;

public class Main {
    private static File file = new File("src" + File.separator + "lesson6" + File.separator + "File.txt");

    public static void main(String[] args) throws IOException {


        boolean Exist = file.exists();
        if (!Exist) {
            System.out.println("no file, creating");
            boolean newFile = file.createNewFile();
            System.out.println("created " + newFile);
        }
        try (
                Scanner scanner = new Scanner(System.in);
                BufferedReader reader = new BufferedReader(new FileReader(file));
        ) {
            Atm accounts = new Atm(reader, Exist);



            try (
                    PrintWriter writer = new PrintWriter(new FileWriter(file));
            ) {
                accounts.writeFile(writer);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
