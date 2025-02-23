package c3.b3_5;

public class MyDate {
    private int year;
    private int month;
    private int day;

    private static final String[] MONTHS ={"Jan","Feb", "Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec" };
    private static final String[] DAYS = {"Monday", "Tuesday", "Wednesday","Thursday","Friday","Saturday","Sunday"};
    private static final int[] DAY_IN_MONTH = {31,28,31,30,31,30,31,31,30,31,30,31};

    public MyDate(int year, int month, int day){
        setDate(year,month,day);
    }

    public boolean isLeapYear(int year){
        return ( year%4==0 && year%100!=0 ) || (year%400==0);

    }
    public boolean isValidDate(int year, int month, int day){
        if( year>=1 && year<=9999 && month>=1 && month<=12 && day>=1 && day<=31){
            return  true;
        }
        int dayInMonth=DAY_IN_MONTH[month -1];
        if(month ==2 && isLeapYear(year)){
            dayInMonth=29;
        }
        return day<=dayInMonth;
    }

    public int getDayOfWeek(int year, int month, int day){
        int totalDays=0;
        for(int y=1; y<year;y++){
            totalDays+=isLeapYear(y) ? 366:365;
        }
        for(int m=1; m<month; m++){
            totalDays +=DAY_IN_MONTH[m-1];
            if(m==2 && isLeapYear(year)){
                totalDays+=1;
            }
        }
        totalDays+=day;
        return  (totalDays+5) %7;
    }
    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date!");
        }
    }
    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }
    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }

    public MyDate nextDay() {
        int newDay = day + 1;
        int newMonth = month;
        int newYear = year;

        if (newDay > DAY_IN_MONTH[month - 1] || (month == 2 && isLeapYear(year) && newDay > 29)) {
            newDay = 1;
            newMonth++;
        }
        if (newMonth > 12) {
            newMonth = 1;
            newYear++;
        }
        return new MyDate(newYear, newMonth, newDay);
    }
    public MyDate nextMonth() {
        int newDay = day;
        int newMonth = month+1;
        int newYear = year;

        if (newMonth>12) {
            newDay = 1;
            newMonth++;
        }
        if (newMonth > 12) {
            newMonth = 1;
            newYear++;
        }
        return new MyDate(newYear, newMonth, newDay);
    }
    public MyDate nextYear() {
        return new MyDate(year + 1, month, day);
    }
    public MyDate previousDay() {
        return new MyDate(year, month, day - 1);
    }
    public MyDate previousMonth() {
        return new MyDate(year, month - 1, day);
    }
    public MyDate previousYear() {
        return new MyDate(year - 1, month, day);
    }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }


}
