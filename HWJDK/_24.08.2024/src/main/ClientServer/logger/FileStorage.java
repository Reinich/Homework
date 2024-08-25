package ClientServer.logger;

import java.io.FileReader;
import java.io.FileWriter;

public class FileStorage implements Repository {
    private static final String LOG_PATH = "H:\\Workplace\\Seminars\\JDK\\Seminar_2\\src\\main\\java\\ClientServer\\logger\\log.txt";


    @Override
    public void saveLog(String text) {
        try (FileWriter writer = new FileWriter(LOG_PATH, true)) {
            writer.write(text + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String readLog() {
        StringBuilder stringBuilder = new StringBuilder();

        try (FileReader reader = new FileReader(LOG_PATH)) {
            int c;

            while ((c = reader.read()) != -1) {
                stringBuilder.append((char) c);
            }

            stringBuilder.delete(stringBuilder.length(), stringBuilder.length());
            return stringBuilder.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public String getLog() {
        return readLog();
    }
}
