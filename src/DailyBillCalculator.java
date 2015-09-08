import src.WeekdayEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DailyBillCalculator {

    Newspaper timeOfIndia = new Newspaper("TOI",1.00);
    Newspaper bangaloreMirror = new Newspaper("BM",1.00);
    Newspaper sundayTimes = new Newspaper("ST",1.00);


    private List<Newspaper> papersForWeekDay(){
        List<Newspaper> papersForWeekday = new ArrayList<>();
        papersForWeekday.add(timeOfIndia);
        papersForWeekday.add(bangaloreMirror);
        return papersForWeekday;
    }

    private List<Newspaper> papersForWeekend(){
        List<Newspaper> papersForWeekday = new ArrayList<>();
        papersForWeekday.add(sundayTimes);
        papersForWeekday.add(bangaloreMirror);
        return papersForWeekday;
    }

    public HashMap<String, List<Newspaper>> getDailyPaperMap(){

        HashMap<String, List<Newspaper>> dayWisePaperMap = new HashMap<>();
        dayWisePaperMap.put(WeekdayEnum.MONDAY,papersForWeekDay());
        dayWisePaperMap.put(WeekdayEnum.TUESDAY,papersForWeekDay());
        dayWisePaperMap.put(WeekdayEnum.WEDNESDAY,papersForWeekDay());
        dayWisePaperMap.put(WeekdayEnum.THURSDAY,papersForWeekDay());
        dayWisePaperMap.put(WeekdayEnum.FRIDAY,papersForWeekDay());
        dayWisePaperMap.put(WeekdayEnum.SATURDAY, papersForWeekDay());
        dayWisePaperMap.put(WeekdayEnum.SUNDAY, papersForWeekend());
        return dayWisePaperMap;
    }

    public double getPriceForACalendarDay(String weekdayName) {
        List<Newspaper> paperForSunday = getDailyPaperMap().get(weekdayName);
        double priceForThatDay = 0;
        for (Newspaper newspaper : paperForSunday) {
            priceForThatDay += newspaper.getPrice();
        }
        return priceForThatDay;
    }



}
