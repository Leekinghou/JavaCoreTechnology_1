package TimeClass_12;

import java.util.Calendar;

public class CalendarTest {
    Calendar calendar = Calendar.getInstance();

    public void test1(){
        //获取年
        int year = calendar.get(Calendar.YEAR);

        //获取月，月份为0-11，所以+1才是真实年份
        int month = calendar.get(Calendar.MONTH) + 1;

        //获取日
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        //获取时
        int hour = calendar.get(Calendar.HOUR_OF_DAY); //24小时制表示

        //获取分
        int minute = calendar.get(Calendar.MINUTE);

        //获取秒
        int second = calendar.get(Calendar.SECOND);

        String []week = {"/","一","二","三","四","五","六","日"};
        //星期，英语国家星期从周日开始算
        int weekday = calendar.get(Calendar.DAY_OF_WEEK);

        System.out.println("现在是" + year + "年，" + month + "月， " + day + "日， "+ hour + "时， "+ minute + "分 " + second + "秒， " + "星期" + week[weekday]);
    }
    public void test5(){
        calendar.set(2018,7,8);
        calendar.add(Calendar.DAY_OF_MONTH,-8);

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(("2018.8.8,用add减少8天，现在是" + year + "." + month + "." + day));

        calendar.set(2018,7,8);
        calendar.roll(Calendar.DAY_OF_MONTH,-8);

        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println(("2018.8.8,用roll减少8天，现在是" + year + "." + month + "." + day));
    }

    public static void main(String []args){
        CalendarTest c1 = new CalendarTest();
        c1.test5();
    }
}
