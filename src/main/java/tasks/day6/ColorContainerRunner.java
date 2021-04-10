package tasks.day6;

public class ColorContainerRunner {

    public static void main(String[] args) {

    }

    private void ifColor(String color) {
        switch (color) {
            case "red":
                System.out.println(ColorContainer.RED.getColor());
                break;
        }
    }

    private void ifColor(int color) {
        switch (color) {
            case 5:
                System.out.println(ColorContainer.RED.getColor());
                break;
        }
    }
}
