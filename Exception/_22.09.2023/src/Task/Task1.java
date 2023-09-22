package Task;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static HashMap<String, String> readFile(File file) {
        HashMap<String, String> map = new HashMap<>();
        BufferedReader fileReader;
        try {
            fileReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = fileReader.readLine()) != null) {
                map.put(line.split("=")[0], line.split("=")[1]);
            }
        } catch (FileNotFoundException e) {
            System.err.println("Read impossible");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static HashMap<String, String> mapChange(HashMap<String, String> hashMap) {
        for (Map.Entry<String, String> s : hashMap.entrySet()) {
            if (s.getValue().equals("?")) {
                s.setValue(String.valueOf(s.getKey().length()));
            }
        }
        return hashMap;
    }

    public static void writeFileMap(File file, HashMap<String, String> changedMap) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file);
            for (Map.Entry<String, String> el : changedMap.entrySet()) {
                fileWriter.write(el.toString());
                fileWriter.write('\n');
            }
            fileWriter.flush();
        } catch (IOException e) {
            System.err.println("Write impossible");
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
