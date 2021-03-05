package main.java.tasks.day5.stringTask;

public class NumbersInText {

    public static void main(String[] args) {

        String text = "13Мама10 9мыла7 5раму6 53утром21";
        char[] chars = text.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char i : chars) {
            if (Character.isDigit(i)) {
                builder.append(i);
                System.out.println(i);
            }

        }

    }

}
