public class Date {
    private int day ;
    private int month;
    private int year;
    public Date(int day, int month, int year){
        setDate(day, month, year);
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int day){
        if(day < 1 || day >31){
            throw new IllegalArgumentException("ngay phai tu 1 den 31");
        }
        this.day = day;
    }
    public void setMonth(int month){
        if(month < 1 || month >12){
            throw new IllegalArgumentException("thang phai tu 1 den 12");
        }
        this.month = month;
    }
    public void setYear(int year){
        if(year <1900 || year > 9999){
            throw new IllegalArgumentException("nam phai tu 1900 den 9999");
        }
        this.year = year;}
    public void setDate(int day, int month, int year){
        setDay(day);
        setMonth(month);
        setYear(year);
    }
    public String toString(){
        return String.format("%02d/%02d/%04d", day, month, year);
    }
}
