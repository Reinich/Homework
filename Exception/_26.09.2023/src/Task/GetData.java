package Task;


public class GetData {

    public String[] getArrayData(String str) throws WrongAmountOfDataException,
            IncorrectFormatDataException {

        String[] personData;
        personData = str.split(" ");

        if (isNotCorrectAmountArrayData(personData))
            throw new WrongAmountOfDataException(personData.length);
        if (isNotCorrectFormatSNP(personData).aBoolean)
            throw new IncorrectFormatDataException
                    (isNotCorrectFormatSNP(personData).position);
        if (isNotCorrectFormatDate(personData))
            throw new IncorrectFormatDataException(personData, 3);
        if (isNotCorrectFormatPhoneNumber(personData))
            throw new IncorrectFormatDataException(personData, 4);
        if (isNotCorrectFormatSex(personData))
            throw new IncorrectFormatDataException(personData, 5);
        return personData;

    }

    public boolean isNotCorrectAmountArrayData(String[] arr) {
        if (arr.length != 6) return true;
        else return false;
    }

    // проверка фио
    public Result isNotCorrectFormatSNP(String[] arr) {

        if (arr[0].isEmpty() || arr[0].equals(null))
            return new Result(true, 0);
        else if (arr[1].isEmpty() || arr[1].equals(null))
            return new Result(true, 1);
        else if (arr[2].isEmpty() || arr[2].equals(null))
            return new Result(true, 2);
        else return new Result(false, 0);

    }

    public boolean isNotCorrectFormatDate(String[] arr) {

        String str = arr[3];
        String[] dateStr;
        dateStr = str.split("\\.");
        int[] dateInt = new int[3];

        try {
            for (int i = 0; i < dateStr.length; i++) {
                dateInt[i] = Integer.parseInt(dateStr[i]);
            }
        } catch (NumberFormatException e) {
            throw new IncorrectFormatDataException(arr, 3);
        }
        if ((dateInt[0] > 0 && dateInt[0] <= 31) &&
                (dateInt[1] > 0 && dateInt[1] <= 12) &&
                (dateInt[2] > 1600 && dateInt[2] <= 2023)) {
            return false;
        } else return true;

    }

    public boolean isNotCorrectFormatPhoneNumber(String[] arr) {

        String str = arr[4];
        char firstDigit = str.charAt(0);
        long longPhoneNumber;
        try {
            longPhoneNumber = Long.parseLong(str);
        } catch (NumberFormatException e) {
            throw new IncorrectFormatDataException(arr, 4);
        }
        if (str.length() != 11) return true;
        else if (firstDigit != '8') return true;
        else return false;

    }

    public boolean isNotCorrectFormatSex(String[] arr) {
        if (arr[5].equals("f") || arr[5].equals("m")) return false;
        else return true;
    }

}
