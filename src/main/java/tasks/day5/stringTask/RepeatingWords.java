package main.java.tasks.day5.stringTask;

public class RepeatingWords {

    public static void main(String[] args) {
        String string = "Мама мыла раму утром раму утром мыл и брат сам он гад пришел под утро, после мыла стал медбрат";
        int count;

        string = string.toLowerCase(); //Преобразовываем строку в нижний регистр
        String words[] = string.split(" "); // Разбиваем строку на слова
        System.out.println("Повторяющееся слова: ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].endsWith(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }

            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}

