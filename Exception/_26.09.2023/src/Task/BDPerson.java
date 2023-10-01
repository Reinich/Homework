package Task;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BDPerson {

    public Map<String, Person> fillBD() {


        Map<String, Person> bdPerson = new HashMap<>();
        GetData getData = new GetData();
        try {
            int i = 0;
            while (true) {
                System.out.println("Enter data or q for exit: ");
                Scanner scanner = new Scanner(System.in);
                String enter = scanner.nextLine();
                if (!enter.equals("q")) {
                    // автоматическая генерация ключей для bdPerson
                    String key = String.format("person%s", i);
                    Person person = new Person(getData.getArrayData(enter));
                    bdPerson.put(key, person);
                    i++;
                } else return bdPerson;

            }

        } catch (IncorrectFormatDataException e) {
            System.err.println(new IncorrectFormatDataException());
            e.printStackTrace();
        } catch (WrongAmountOfDataException e) {
            System.err.println(new WrongAmountOfDataException());
            e.printStackTrace();
        }
        return bdPerson;

    }


}

