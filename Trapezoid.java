import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Trapezoid {
    public static void main(String[] args) {
        String namaFile = "Trapesium.txt";

        List<Sisi> sisiList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String line;
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(", ");
                Sisi r = new Sisi();
                r.A = Double.parseDouble(row[0]);
                r.B = Double.parseDouble(row[1]);
                r.C = Double.parseDouble(row[2]);

                sisiList.add(r);
            }

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());

        System.out.println("Luas Trapesium adalah" + ...)
        }
    }
}