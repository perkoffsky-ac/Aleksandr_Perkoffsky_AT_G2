package main.java.tasks.day6;

public class ObjectContainerRunner {

    public static void main(String[] args) {

        ObjectContainer container = new ObjectContainer();

        for (int i = 0; i < 5; i++) {
            container.add(i);
            container.add("tratatatataaa");
        }
        System.out.println(container + " - created!");
        while (!container.isEmpty()) {
            Object object = container.removeLast();
            if (object instanceof Integer) {
                System.out.println("Number " + object + " removed..");
            }
        }
    }
}
