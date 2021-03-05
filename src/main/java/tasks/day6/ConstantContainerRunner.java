package main.java.tasks.day6;

public class ConstantContainerRunner {

    public static void main(String[] args) {

    }

    private void printColor(String color) {
        switch (color) {
            case "red":
                System.out.println(ConstantContainer.RED);
                break;
            case "blue":
                System.out.println(ConstantContainer.BLUE);
                break;

            case "green":
                System.out.println(ConstantContainer.GREEN);
                break;
            case "yellow":
                System.out.println(ConstantContainer.YELLOW);
                break;
            case "purple":
                System.out.println(ConstantContainer.PURPLE);
                break;
        }
    }
}

