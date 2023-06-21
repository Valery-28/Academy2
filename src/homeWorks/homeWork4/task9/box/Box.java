package homeWorks.homeWork4.task9.box;

import java.io.Serializable;

public class Box implements Serializable {
    public final int x;
    public final int y;
    public final int z;

    public Box(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString() {
        return "\n" +
                "x= " + x +
                ", y= " + y +
                ", z= " + z;
    }
}
