package homeWork2.task4;

public class Car {
    private final String brand;
    private String color;

    public Car(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        if (isValidColor(color)) {
            this.color = color;
        }
    }

    private boolean isValidColor(String color) {
        switch (brand) {
            case "Audi":
                String[] colorAudi = {"Blue", "Red", "Green"};
                for (String colors : colorAudi) {
                    if (colors.equals(color)) {
                        return true;
                    }
                }
                break;
            case "BMW":
                String[] colorBMW = {"Orange", "Black", "Purple"};
                for (String colors : colorBMW) {
                    if (colors.equals(color)) {
                        return true;
                    }
                }
                break;
            case "KIA":
                String[] colorKIA = {"Yelow", "Grey", "White"};
                for (String colors : colorKIA) {
                    if (colors.equals(color)) {
                        return true;
                    }
                }
                break;
        }
        return false;
    }

    public void print() {
        System.out.printf("Brand: %s, Color: %s\n",
                brand,
                color
        );
    }
}