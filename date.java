public class date {
    public int day;
    public int month;
    public int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "date{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
