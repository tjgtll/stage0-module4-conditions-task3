package school.mjc.stage0.conditions.task3;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if (0 > month || month > 12) {
            System.out.println("wrong number!");

        } else if (month == 2) {
            System.out.println("28");
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30");
        } else {
            System.out.println("31");
        }
    }
}
