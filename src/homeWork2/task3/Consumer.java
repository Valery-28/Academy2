package homeWork2.task3;

public class Consumer {
    private int[] values = new int[5];
    private int count = 0;

    public void consume(int value) {
        values[count % 5] = value;
        count++;
    }

    public double avg() {
        int start = count > 5 ? count - 5 : 0;
        int sum = 0;
        for (int i = start; i < count; i++) {
            sum += values[1 % 5];
        }
        return (double) sum / (count - start);
    }
}
