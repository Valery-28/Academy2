package homeWork2.task2;

public class Box {

    private  int x;
    private  int y;
    private  int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    @Override
    public String toString() {
        return "Box{" +
                "x= " + x +
                ", y= " + y +
                ", z= " + z + ", Type: " + HowTypeBox(x, y, z) +
                '}';
    }

    public static TypeBox HowTypeBox(int x, int y, int z) {
        if (x == y && y == z) {
            return TypeBox.COUB;
        } else if (z == 0) {
            return TypeBox.ENVELOPE;
        } else {
            return TypeBox.STANDARTBOX;
        }
    }
}

