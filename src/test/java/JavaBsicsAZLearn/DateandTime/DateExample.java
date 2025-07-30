package JavaBsicsAZLearn.DateandTime;

import java.util.Calendar;
import java.util.Date;

public class DateExample {

    public static void main(String args[]){
      Date date = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.set(2015,Calendar.JANUARY,1);
        Date currentDate = calendar.getTime();
        System.out.println(currentDate.toString());
    }
}
