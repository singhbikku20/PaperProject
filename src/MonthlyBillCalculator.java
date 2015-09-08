import src.WeekdayEnum;

import java.util.Calendar;

public class MonthlyBillCalculator {
    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);


        Calendar c = Calendar.getInstance();
        c.set(year, month, 1);
        int maxDayInMonth;
        maxDayInMonth = c.getActualMaximum(c.DAY_OF_MONTH);
        double monthlyTotal = 0;
        for (int dayOfMonth = 1; dayOfMonth <= maxDayInMonth; dayOfMonth++) {
            c.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            switch (c.DAY_OF_WEEK) {
                case 1:
                    monthlyTotal += new DailyBillCalculator().getPriceForACalendarDay(WeekdayEnum.SUNDAY);
                    break;
                case 2:
                    monthlyTotal += new DailyBillCalculator().getPriceForACalendarDay(WeekdayEnum.MONDAY);
                    break;
                case 3:
                    monthlyTotal += new DailyBillCalculator().getPriceForACalendarDay(WeekdayEnum.TUESDAY);
                    break;
                case 4:
                    monthlyTotal += new DailyBillCalculator().getPriceForACalendarDay(WeekdayEnum.WEDNESDAY);
                    break;
                case 5:
                    monthlyTotal += new DailyBillCalculator().getPriceForACalendarDay(WeekdayEnum.THURSDAY);
                    break;
                case 6:
                    monthlyTotal += new DailyBillCalculator().getPriceForACalendarDay(WeekdayEnum.FRIDAY);
                    break;
                case 7:
                    monthlyTotal += new DailyBillCalculator().getPriceForACalendarDay(WeekdayEnum.SATURDAY);
                    break;
            }
        }

        System.out.println("Monthly Total is - " + monthlyTotal);
    }
}
