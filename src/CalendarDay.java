import java.util.Calendar;
import java.util.List;

/**
 * Created by SinghArun on 9/4/2015.
 */
public class CalendarDay {

    private String nameOfDay;
    private List<Newspaper> newspaperList;

    public CalendarDay(String nameOfDay, List<Newspaper> newspaper) {
        this.nameOfDay = nameOfDay;
        this.newspaperList = newspaper;
    }

    public String getNameOfDay() {
        return nameOfDay;
    }

    public void setNameOfDay(String nameOfDay) {
        this.nameOfDay = nameOfDay;
    }


    public List<Newspaper> getNewspaperList() {
        return newspaperList;
    }

    public void setNewspaperList(List<Newspaper> newspaperList) {
        this.newspaperList = newspaperList;
    }


}
