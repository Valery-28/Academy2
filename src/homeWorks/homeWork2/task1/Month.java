package homeWorks.homeWork2.task1;

public enum Month {
    JANUARY(1), FEBRUARY(2), MARCH(3),
    APRIL(4), MAY(5), JUNE(6),
    JULY(7), AUGUST(8), SEPTEMBER(9),
    OCTOBER(10), NOVEMBER(11), DECEMBER(12);
    private int numberMonth;

    Month(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public static String getNameByNumber(int monthNumber) {
        for (Month month : Month.values()) {
            if (month.numberMonth == monthNumber) {
                return month.name();
            }
        }
        return null;
    }

    public static int getNumberByName(String monthName) {
        for (Month month : Month.values()) {
            if (month.name().equals(monthName)) {
                return month.numberMonth;
            }
        }
        return 0;
    }

}
