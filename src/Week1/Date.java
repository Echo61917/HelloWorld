package Week1;

import java.util.GregorianCalendar;

public class Date {
    public static void main(String[] args)
    {
        GregorianCalendar aYearAgo = new GregorianCalendar(2021, 2, 15);
        GregorianCalendar today = new GregorianCalendar();

        float balance = 2000.00f;
        float rate = 0.05f;
        int yearSpanned = today.get(GregorianCalendar.YEAR) - aYearAgo.get(GregorianCalendar.YEAR);

        balance = balance + balance*rate*yearSpanned;
        System.out.println("New Balance: " + balance);
        System.out.println(yearSpanned);
    }
}
