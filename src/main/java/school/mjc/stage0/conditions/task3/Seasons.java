package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (0 > month || month > 12) {
            System.out.println("wrong number!");
        } else if (2 < month && month < 6) {
            System.out.println("Spring");
        } else if (5 < month && month < 9) {
            System.out.println("Summer");
        } else if (8 < month && month < 9) {
            System.out.println("Autumn");
        } else {
            System.out.println("Winter");
        }
    }
}
