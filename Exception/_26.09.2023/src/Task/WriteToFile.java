package Task;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteToFile {

    public void writeToFile() {

        Map<String, Person> bdPerson = new BDPerson().fillBD();

        for (var item : bdPerson.entrySet()) {
            String fileName = item.getValue().getSurname();
            File file = new File(fileName + ".txt");
            try (FileWriter writer = new FileWriter(file, true)) {
                writer.write(String.valueOf(item.getValue()));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
