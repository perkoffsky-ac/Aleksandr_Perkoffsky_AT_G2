package main.java.tasks.ownTasks;

public class PhraseOMatic {
    public static void main(String[] args) {

        String[] wordListOne = {"круглосуточный", "трех-звенный", "3000-футовый", "взаимный", "обоюдный выигрыш",
                "фронтэнд", "на основе веб-технологий", "проникающий", "умный", "шесть сигм", "метод критического пути",
                "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный", "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный", "нестандартный ум", "позиционированный",
                "сетевой", "сфокусированный", "использолванный с выгодой", "выровненный", "нацеленный на",
                "общий", "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки", "выход из положения", "тип структуры", "талант",
                "подход", "уровень завоеванного внимания", "портал", "период времени", "обзор",
                "образец", "пункт следования"};

        int oneLength = wordListOne.length; //передаем переменной длину массива
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength); //random возвращает от 0 до 1 (не включительно) + приводим к типу инт
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        //wordListOne[rand1] - индекс элемента массива...

        System.out.println("Все, что нам нужно - это " + phrase);

    }
}
