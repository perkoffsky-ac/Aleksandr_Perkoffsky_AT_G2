package project.utils;

public class ParsingUtil {

    public static int parsingToInt(String string) {
        String symbols = string.replaceAll("[^0-9]", "");
        int numbers = Integer.parseInt(symbols);
        return numbers;
    }

    public static double parsingString(String string) {
        String numberRaiting = string.replaceAll(",", ".");
        double ratingValue = Double.parseDouble(numberRaiting);
        return ratingValue;
    }
}
