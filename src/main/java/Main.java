import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> lines = new ArrayList<>();

        String path = "data/movementList.csv";

        List<String> bankOperations = Files.readAllLines(Paths.get(path));

        for (String expenses : bankOperations) {
            // при работе с форматом файла csv, раскалываем через split по ","
            String[] components = expenses.split(",");
            if (components.length == 8) {
                if (Integer.parseInt(components[7]) > 0) {
                    
                }
            }
        }

        }
    }
